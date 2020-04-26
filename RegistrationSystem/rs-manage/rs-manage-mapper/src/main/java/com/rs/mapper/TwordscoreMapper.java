package com.rs.mapper;

import com.rs.pojo.Twordscore;
import com.rs.pojo.TwordscoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TwordscoreMapper {
    int countByExample(TwordscoreExample example);

    int deleteByExample(TwordscoreExample example);

    int deleteByPrimaryKey(Long sid);

    int insert(Twordscore record);

    int insertSelective(Twordscore record);
    
    int completedCount();//已完成作品数
    
    int uncompletedCount();//未完成作品数

    List<Twordscore> selectByExample(TwordscoreExample example);
    
    List<Twordscore> selectUncompleted();//返回未完成的作品集

    Twordscore selectByPrimaryKey(Long sid);

    int updateByExampleSelective(@Param("record") Twordscore record, @Param("example") TwordscoreExample example);

    int updateByExample(@Param("record") Twordscore record, @Param("example") TwordscoreExample example);

    int updateByPrimaryKeySelective(Twordscore record);

    int updateByPrimaryKey(Twordscore record);
}