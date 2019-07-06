package com.wzy.jolt.web.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.io.File;

@Controller
public class DeleteExcel {

    public static String url="";

    //360000
    @Scheduled(fixedDelay = 360000)
    public  void delete(){
        if(url.equals("")){
            return;
        };
        deleteDir(new File(url));
    }


    public  boolean deleteDir(File dir) {
        if(dir.isDirectory()) {
            String [] children=dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success =deleteDir(new File(dir, children[i]));//如果有文件将一直调用deleteDir()方法
                if(!success){
                    return false;
                }
                System.out.println(children[i]);//文件夹下面的文件
            }
        }
        System.out.println("The directory is deleted.");
        url="";
        return dir.delete();
    }
}
