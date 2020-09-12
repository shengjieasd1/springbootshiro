package cn.sj.springbootshiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberController {
    @RequestMapping("/loginPage")
    public String get(){
        return "member_login";
    }
    @RequestMapping("/error")
    public String error(){
        return "member_login";
    }
}
