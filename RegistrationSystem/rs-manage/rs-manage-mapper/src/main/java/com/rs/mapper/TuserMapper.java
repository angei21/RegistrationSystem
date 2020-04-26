package com.rs.mapper;

import com.rs.pojo.Tuser;
import com.rs.pojo.TuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TuserMapper {
    int countByExample(TuserExample example);

    int deleteByExample(TuserExample example);

    int deleteByPrimaryKey(Long sno);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    List<Tuser> selectByExample(TuserExample example);

    Tuser selectByPrimaryKey(Long sno);

    int updateByExampleSelective(@Param("record") Tuser record, @Param("example") TuserExample example);

    int updateByExample(@Param("record") Tuser record, @Param("example") TuserExample example);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
    
    int loginCheck(Long sno,String spassword,Integer statue);//检查用户是否存在
}