package com.ecommerce.controllers;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

         @Autowired
         private Repository repository;
         
          @RequestMapping("/")
          @ResponseBody
          public String index() {
            return "This is running under SSL";
          }
         
        
}

