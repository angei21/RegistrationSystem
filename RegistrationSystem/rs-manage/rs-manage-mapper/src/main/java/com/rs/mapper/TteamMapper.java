package com.rs.mapper;

import com.rs.pojo.Tteam;
import com.rs.pojo.TteamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TteamMapper {
    int countByExample(TteamExample example);

    int deleteByExample(TteamExample example);

    int deleteByPrimaryKey(Long teamid);

    int insert(Tteam record);

    int insertSelective(Tteam record);

    List<Tteam> selectByExample(TteamExample example);
    
    List<Tteam> selectThroughPage(int index,int pageCount);

    Tteam selectByPrimaryKey(Long teamid);
    
    Tteam selectBySno(Long sno);

    int updateByExampleSelective(@Param("record") Tteam record, @Param("example") TteamExample example);

    int updateByExample(@Param("record") Tteam record, @Param("example") TteamExample example);

    int updateByPrimaryKeySelective(Tteam record);

    int updateByPrimaryKey(Tteam record);
}