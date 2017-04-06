package com.zhao.ssm.controller;

import com.zhao.ssm.bean.Person;
import com.zhao.ssm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.util.List;

/**
 * Created by zhao on 2017/3/29.
 */
@Controller
//@RequestMapping("/hello")
public class Hello {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    private String hello(HttpServletRequest request){
        List<Person> all = personService.getAll();
        request.setAttribute("persons",all);
        return "hello";
    }
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    private String index(){
        return "index";
    }
}
