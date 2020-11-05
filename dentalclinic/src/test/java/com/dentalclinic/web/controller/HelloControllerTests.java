package com.dentalclinic.web.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import com.dentalclinic.business.BusinessConfig;
import com.dentalclinic.web.WebConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BusinessConfig.class, WebConfig.class})
@WebAppConfiguration
public class HelloControllerTests {

    @Autowired
    private HelloController controller;

    @Test
    public void testHandleRequestView() {	
        ModelAndView modelAndView = controller.handleRequest();		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}
