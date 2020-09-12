package cn.sj.springbootshiro.controller;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DeptController {
    //@RequiresRoles("dept")
    @RequiresAuthentication
    @ResponseBody
    @RequestMapping("/pages/back/dept/get")
    public String get(){
        return "部门信息";
    }
    
    @RequestMapping("/pages/back/dept/show")
    public String show(){
        return "dept_show";
    }
}
