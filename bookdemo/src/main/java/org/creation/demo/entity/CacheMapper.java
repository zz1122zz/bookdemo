package org.creation.demo.entity;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CacheMapper {
    int countByExample(CacheCriteria example);

    int deleteByExample(CacheCriteria example);

    int deleteByPrimaryKey(String name);

    int insert(Cache record);

    int insertSelective(Cache record);
    
    int replaceSelective(Cache record);

    List<Cache> selectByExampleWithRowbounds(CacheCriteria example, RowBounds rowBounds);

    List<Cache> selectByExample(CacheCriteria example);

    Cache selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Cache record, @Param("example") CacheCriteria example);

    int updateByExample(@Param("record") Cache record, @Param("example") CacheCriteria example);

    int updateByPrimaryKeySelective(Cache record);

    int updateByPrimaryKey(Cache record);
}