package cn.sj.springbootshiro.dao;

import cn.sj.vo.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shuzheng
 */
@Mapper
public interface IMemberDao {
    public Member findById(String mid);
    
}
