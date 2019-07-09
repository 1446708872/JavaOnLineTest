package com.wzy.jolt.web.controller;

import com.wzy.jolt.model.Choice;
import com.wzy.jolt.model.Completion;
import com.wzy.jolt.model.Library;
import com.wzy.jolt.web.controller.base.BaseControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping(value = "addLibraryList")
    public @ResponseBody List addLibraryList(){ ;
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
}
