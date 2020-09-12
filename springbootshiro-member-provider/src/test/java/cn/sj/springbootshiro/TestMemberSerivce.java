package cn.sj.springbootshiro;

import cn.sj.springbootshiro.service.IMemberService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestMemberSerivce {
    @Resource
    private IMemberService memberService;
    
    @Test
    public void testGet(){
        System.out.println(this.memberService.get("admin"));
    }
    
    @Test
    public void testAuth(){
        System.out.println(this.memberService.listAuthByMember("admin"));
    }

}
