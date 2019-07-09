package com.wzy.jolt.service.impl;

import com.wzy.jolt.model.Title;
import com.wzy.jolt.model.User;
import com.wzy.jolt.service.UserService;
import com.wzy.jolt.service.base.BaseServiceImpl;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Override
    public User findByIntId(Integer id) {
        return userMapper.findByIntId(id);
    }

    @Override
    public User findByStrId(String strId) {
        return userMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {
        userMapper.deleteByIntId(id);
    }

    @Override
    public void deleteByStrId(String strId) {
        userMapper.deleteByStrId(strId);
    }

    @Override
    public void updateT(User user) {
        userMapper.updateT(user);
    }

    @Override
    public void insertT(User user) {
        userMapper.insertT(user);
    }

    @Override
    public List<User> query(User user) {
        return userMapper.query(user);
    }

    @Override
    public List<User> findByIntIdList(Integer id) {
        return userMapper.findByIntIdList(id);
    }

    @Override
    public List<User> findByStrIdList(String id) {
        return userMapper.findByStrIdList(id);
    }

    @Override
    public List<User> findByList() {
        return userMapper.findByList();
    }

    @Override
    public List<Title> findByIntIdTitleList(Integer id) {
        return titleMapper.findByIntIdList(id);
    }

    //导入EXCEL数据
    @Override
    public String inportExcel(String excelPath) {
        List<String> list=new ArrayList<String>();
        try {
            //String encoding = "GBK";
            File excel = new File(excelPath);
            if (excel.isFile() && excel.exists()) {   //判断文件是否存在
                String[] split = excel.getName().split("\\.");  //.是特殊字符，需要转义！！！！！
                Workbook wb;
                //根据文件后缀（xls/xlsx）进行判断
                if ("xls".equals(split[1])) {
                    FileInputStream fis = new FileInputStream(excel);   //文件流对象
                    wb = new HSSFWorkbook(fis);
                } else if ("xlsx".equals(split[1])) {
                    wb = new XSSFWorkbook(excel);
                } else {
                    System.out.println("!");
                    return"文件类型错误";
                }
                //开始解析
                Sheet sheet = wb.getSheetAt(0);     //读取sheet 0
                int firstRowIndex = sheet.getFirstRowNum() + 1;   //第一行是列名，所以不读
                int lastRowIndex = sheet.getLastRowNum();       //一共有几行
                for (int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                    Row row = sheet.getRow(rIndex);
                    if (row != null) {
                        int firstCellIndex = row.getFirstCellNum();
                        int lastCellIndex = row.getLastCellNum();
                        for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) {   //遍历列
                            Cell cell = row.getCell(cIndex);
                            if (cell != null) {
                                switch (cell.getCellTypeEnum()) {
                                    case STRING:
                                        list.add(cell.getRichStringCellValue().getString());
                                        break;
                                    case NUMERIC:
                                        if (DateUtil.isCellDateFormatted(cell)) {
                                            list.add(cell.getDateCellValue().toString());
                                        } else {
                                            DecimalFormat df = new DecimalFormat("0");
                                            list.add(String.valueOf(df.format(cell.getNumericCellValue())));
                                        }
                                        break;
                                    case BOOLEAN:
                                        list.add(String.valueOf(cell.getBooleanCellValue()));
                                        break;
                                    case FORMULA:
                                        list.add(cell.getCellFormula());
                                        break;
                                    default:
                                        list.add("");
                                        break;
                                }
                            }
                        }
                    }
                }
            } else {
                return "找不到文件，系统错误!";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "系统错误";
        }

        return this.addStudent(list);
    }

    private String addStudent(List<String> list){
        for(int i=1;i<=list.size();i++){
            if(i%5==0){
                User user = new User();

                //学号
                if(!(Pattern.compile("[0-9]*")).matcher(String.valueOf(list.get(i-5))).matches()){
                    return "请输入全数字的学号!错误"+list.get(i-5)+"!";
                }
                if(userMapper.findByIntId(Integer.valueOf(list.get(i-5)))!=null){
                    return "改学号"+list.get(i-5)+"已存在!";
                }
                user.setUser_id(Integer.valueOf(list.get(i-5)));
                //密码
                if(list.get(i-4).length()>16){
                    return "您输入的学号密码长度不得超过16位,错误"+list.get(i-4)+"!";
                }
                user.setPassword(list.get(i-4));
                //姓名
                user.setName(list.get(i-3));
                //性别
                if(!list.get(i-2).equals("男")&&!list.get(i-2).equals("女")){
                    return "性别只能输入男或女!错误"+list.get(i-2)+"!";
                }
                user.setSex(list.get(i-2));
                //班级号
                if(!(Pattern.compile("[0-9]*")).matcher(list.get(i-1)).matches()){
                    return "请输入正确的班级编号"+list.get(i-1)+"!错误!";
                }
                if(classMapper.findByIntId(Integer.valueOf(list.get(i-1)))==null){
                    return "此班级ID"+list.get(i-1)+"不存在!错误!";
                }
                user.setUser_class(Integer.valueOf(list.get(i-1)));
                //权限
                user.setPower_title(1);
                //添加至数据库
                userMapper.insertT(user);
            }
        }
        return "插入成功！";
    }
}

