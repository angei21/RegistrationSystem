package com.rs.mapper;

import com.rs.pojo.Documentstock;
import com.rs.pojo.DocumentstockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentstockMapper {
    int countByExample(DocumentstockExample example);

    int deleteByExample(DocumentstockExample example);

    int deleteByPrimaryKey(Long did);

    int insert(Documentstock record);

    int insertSelective(Documentstock record);

    List<Documentstock> selectByExample(DocumentstockExample example);

    Documentstock selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") Documentstock record, @Param("example") DocumentstockExample example);

    int updateByExample(@Param("record") Documentstock record, @Param("example") DocumentstockExample example);

    int updateByPrimaryKeySelective(Documentstock record);

    int updateByPrimaryKey(Documentstock record);
}