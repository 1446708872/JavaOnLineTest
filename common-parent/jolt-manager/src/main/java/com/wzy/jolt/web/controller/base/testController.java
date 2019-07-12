package com.wzy.jolt.web.controller.base;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wzy.jolt.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("test")
public class testController extends BaseControllerImpl {


    @RequestMapping(value = "test")
    public  String closeTest(String problem_id, Model model,HttpSession session) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = (User) session.getAttribute("user");
        Test test = new Test();

//      判断学生是否测试过
        Map map = new HashMap();
        map.put("problem_id",problem_id);
        map.put("user_id",user.getUser_id());
        ExaminationRecords byUserIdAndProblemId = examinationRecordsService.findByUserIdAndProblemId(map);
        if(byUserIdAndProblemId!=null) return "test404";

        List choiceRand = choiceService.Rand(Integer.parseInt(problem_id));
        List completionRand = completionService.Rand(Integer.parseInt(problem_id));
//        创建test对象，存入抽到的题
        test.setProblem_id(Integer.valueOf(problem_id));
        test.setChoiceList(choiceRand);
        test.setCompletionList(completionRand);
//        将抽到的题转换为JSON存入数据库
        ExaminationRecords records = new ExaminationRecords();
        records.setChoice_done(mapper.writeValueAsString(choiceRand));
        records.setCompletion_done(mapper.writeValueAsString(completionRand));
        records.setUser_id(user.getUser_id());
        records.setProblem_id(Integer.valueOf(problem_id));
        examinationRecordsService.insertT(records);

        model.addAttribute("test",test);
        return "test";
    }
}
