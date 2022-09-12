package com.akron.gittest.controller;

import com.akron.gittest.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akron
 * @version 1.0
 * @date 2022/9/12 14:21
 */
@RestController
public class GitController {

    @RequestMapping("/git")
    public String test1(){
        Student student1 = new Student();
        return "gittest!!!";
    }
}
