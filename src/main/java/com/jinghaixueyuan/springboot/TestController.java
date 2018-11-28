package com.jinghaixueyuan.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*相关的Controller，Service*/
@Controller
public class TestController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "HelloWorld";

    }

}
