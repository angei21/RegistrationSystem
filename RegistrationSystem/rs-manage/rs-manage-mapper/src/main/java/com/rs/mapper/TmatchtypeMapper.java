package com.rs.mapper;

import com.rs.pojo.Tmatchtype;
import com.rs.pojo.TmatchtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmatchtypeMapper {
    int countByExample(TmatchtypeExample example);

    int deleteByExample(TmatchtypeExample example);

    int deleteByPrimaryKey(Long tmid);

    int insert(Tmatchtype record);

    int insertSelective(Tmatchtype record);

    List<Tmatchtype> selectByExample(TmatchtypeExample example);

    Tmatchtype selectByPrimaryKey(Long tmid);
    
    String getTypenameByTypeId(Long tmid);//根据比赛类别Id获取比赛类型名字

    int updateByExampleSelective(@Param("record") Tmatchtype record, @Param("example") TmatchtypeExample example);

    int updateByExample(@Param("record") Tmatchtype record, @Param("example") TmatchtypeExample example);

    int updateByPrimaryKeySelective(Tmatchtype record);

    int updateByPrimaryKey(Tmatchtype record);
    
    
}