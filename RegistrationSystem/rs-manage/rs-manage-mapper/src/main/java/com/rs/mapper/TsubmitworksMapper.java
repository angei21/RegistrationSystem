package com.rs.mapper;

import com.rs.pojo.Tsubmitworks;
import com.rs.pojo.TsubmitworksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsubmitworksMapper {
    int countByExample(TsubmitworksExample example);

    int deleteByExample(TsubmitworksExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(Tsubmitworks record);

    int insertSelective(Tsubmitworks record);

    List<Tsubmitworks> selectByExample(TsubmitworksExample example);

    Tsubmitworks selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") Tsubmitworks record, @Param("example") TsubmitworksExample example);

    int updateByExample(@Param("record") Tsubmitworks record, @Param("example") TsubmitworksExample example);

    int updateByPrimaryKeySelective(Tsubmitworks record);

    int updateByPrimaryKey(Tsubmitworks record);
}