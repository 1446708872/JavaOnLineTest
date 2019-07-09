package com.wzy.jolt;

import static org.junit.Assert.assertTrue;

import com.wzy.jolt.service.UserService;
import com.wzy.jolt.service.impl.UserServiceImpl;
import org.junit.Test;

import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        UserService service =  new UserServiceImpl();
        String s = service.inportExcel("E:\\tomacat\\webapps\\jolt_manager_war\\upload\\7c3ec75b-3a6c-401c-b74d-592257633ac7.xlsx");
        System.out.println(s);
    }
}
