package cn.sj.springbootshiro;

import cn.sj.springbootshiro.service.IMemberService;
import cn.sj.vo.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
public class TestMemberController {

    private RestTemplate restTemplate = new RestTemplate();
    
    @Test
    public void testGet(){
        String url = "http://localhost:8001/member/get?mid=admin";
        Member vo = this.restTemplate.postForObject(url, null, Member.class);
        System.out.println(vo);
    }
    
    @Test
    public void testAuth(){
        String url = "http://localhost:8001/member/auth?mid=admin";
        Map<String, Object> map = this.restTemplate.postForObject(url, null, Map.class);
        Set<String> allRoles = new HashSet<>();
        Set<String> allActions = new HashSet<>();
        allRoles.addAll((List<String>)map.get("allActions"));
        allActions.addAll((List<String>)map.get("allRoles"));
        System.out.println("【角色】"+allRoles);
        System.out.println("【权限】"+allActions);
    }

}
