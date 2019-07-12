package com.wzy.jolt.web.controller;

import com.wzy.jolt.model.Choice;
import com.wzy.jolt.model.Completion;
import com.wzy.jolt.model.Library;
import com.wzy.jolt.model.User;
import com.wzy.jolt.web.controller.base.BaseControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("lib")
public class libraryController extends BaseControllerImpl {

    @RequestMapping(value = "addLibrary")
    public @ResponseBody String addLibrary(Library library){
        Library byStrId = libraryService.findByStrId(library.getIntroduce());
        if(byStrId!=null)return "false";
        library.setOff(0);
        libraryService.insertT(library);
        return "true";
    }

    @RequestMapping(value = "getLibrary")
    public @ResponseBody Library getLibrary(int problem_id){
        return libraryService.findByIntId(problem_id);
    }

    @RequestMapping(value = "updateLibrary")
    public @ResponseBody String updateLibrary(Library library){
        libraryService.updateT(library);
        return "true";
    }

    @RequestMapping(value = "updateChoice")
    public @ResponseBody String updateChoice(Choice choice){
        choiceService.updateT(choice);
        return "true";
    }

    @RequestMapping(value = "updateCompletion")
    public @ResponseBody String updateCompletion(Completion completion){
        completionService.updateT(completion);
        return "true";
    }


    @RequestMapping(value = "deleteLibrary")
    public @ResponseBody String deleteLibrary(int problem_id){
        Library byIntId = libraryService.findByIntId(problem_id);
        if(byIntId==null)return "false";
        libraryService.deleteByIntId(problem_id);
        return "true";
    }

    @RequestMapping(value = "LibraryList")
    public @ResponseBody List LibraryList(){
        return libraryService.findByList();
    }

    @RequestMapping(value = "addChoice")
    public @ResponseBody String addChoice(Choice choice){
        Choice byStrId = choiceService.findByStrId(choice.getIntroduce());
        if(byStrId!=null)return "false";
        choiceService.insertT(choice);
        return "true";
    }

    @RequestMapping(value = "addCompletion")
    public @ResponseBody String addCompletion(Completion completion){
        Completion byStrId = completionService.findByStrId(completion.getIntroduce());
        if(byStrId!=null)return "false";
        completionService.insertT(completion);
        return "true";
    }

    @RequestMapping(value = "choiceList")
    public @ResponseBody List choiceList(String selectId,HttpSession session){


        return choiceService.findByStrIdList(selectId);
    }

    @RequestMapping(value = "completionList")
    public @ResponseBody List completionList(String selectId){
        return completionService.findByStrIdList(selectId);
    }

    @RequestMapping(value = "deleteChoice")
    public @ResponseBody List deleteChoice(String selectId,String id){
        choiceService.deleteByIntId(Integer.valueOf(selectId));
        return choiceService.findByStrIdList(id);
    }

    @RequestMapping(value = "deleteCompletion")
    public @ResponseBody List deleteCompletion(String selectId,String id){
        completionService.deleteByIntId(Integer.valueOf(selectId));
        return completionService.findByStrIdList(id);
    }

    @RequestMapping(value = "getChoice")
    public @ResponseBody Choice getChoice(String id){
        return choiceService.findByIntId(Integer.valueOf(id));
    }


    @RequestMapping(value = "getCompletion")
    public @ResponseBody Completion getCompletion(String id){
        return completionService.findByIntId(Integer.valueOf(id));
    }

    @RequestMapping(value = "submitChoice")
    public @ResponseBody String submit(Choice choice){
        Choice byIntId = choiceService.findByIntId(choice.getChoice_id());
        if(byIntId.getAnswer().equals(choice.getAnswer())){
            return "true";
        }
        return "false";
    }

    @RequestMapping(value = "submitCompletion")
    public @ResponseBody String submit2(Completion completion){
        Completion byIntId = completionService.findByIntId(completion.getCompletion_id());
        Pattern p = Pattern.compile("\\s*|\t|\r|\n");


        Matcher matcher = p.matcher(byIntId.getAnswer());
        String orAnwers = matcher.replaceAll("");

        Matcher matcher1 = p.matcher(completion.getAnswer());
        String stAnwers = matcher1.replaceAll("");

        if(orAnwers.equals(stAnwers)){
            return "true";
        }
        return "false";
    }

    @RequestMapping(value = "openTest")
    public @ResponseBody String openTest( String problem_id){
        int choice = choiceService.MixSize(Integer.parseInt(problem_id));
        if(choice<10){
            return"您的选择题题库内，提的数量小于10道，禁止开启开测试！";
        }
        int completion = completionService.MixSize(Integer.parseInt(problem_id));
        if(completion<5){
            return"您的编程提题题库内，提的数量小于5道，禁止开启开测试！";
        }
        libraryService.oppenTest(Integer.parseInt(problem_id));
        return "true";
    }

    @RequestMapping(value = "closeTest")
    public @ResponseBody String closeTest( String problem_id){
        libraryService.closeTest(Integer.parseInt(problem_id));
        return "true";
    }
}
