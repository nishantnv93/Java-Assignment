package com.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public ModelAndView getHelloPgae(){
        return new ModelAndView("Hello");
    }
    @RequestMapping(value="/hello/{id}", method= RequestMethod.GET)
    public ModelAndView getHelloPage(@PathVariable int id){
        return new ModelAndView("Hi");
    }
}
