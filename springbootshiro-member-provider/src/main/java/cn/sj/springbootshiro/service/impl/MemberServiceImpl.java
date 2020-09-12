package cn.sj.springbootshiro.service.impl;

import cn.sj.springbootshiro.dao.IActionDao;
import cn.sj.springbootshiro.dao.IMemberDao;
import cn.sj.springbootshiro.dao.IRoleDao;
import cn.sj.springbootshiro.service.IMemberService;
import cn.sj.vo.Member;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class MemberServiceImpl implements IMemberService {
    @Resource
    private IMemberDao memberDao;
    @Resource
    private IRoleDao roleDao;
    @Resource
    private IActionDao actionDao;
    @Override
    public Member get(String mid) {
        return this.memberDao.findById(mid);
    }
    
    @Override
    public Map<String, Set<String>> listAuthByMember(String mid) {
        Map<String,Set<String>> map = new HashMap<>();
        map.put("allRoles",this.roleDao.findAllRoleByMember(mid));
        map.put("allAction",this.actionDao.findAllActionByMember(mid));
        return map;
    }
}
