package org.creation.demo.entity.bookdemo.mysql;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.creation.demo.entity.bookdemo.Entity;
import org.creation.demo.entity.bookdemo.EntityCriteria;

public interface EntityMapper {
    int countByExample(EntityCriteria example);

    int deleteByExample(EntityCriteria example);

    int deleteByPrimaryKey(Long uniqueEntityCode);

    int insert(Entity record);

    int insertSelective(Entity record);

    List<Entity> selectByExampleWithRowbounds(EntityCriteria example, RowBounds rowBounds);

    List<Entity> selectByExample(EntityCriteria example);

    Entity selectByPrimaryKey(Long uniqueEntityCode);

    int updateByExampleSelective(@Param("record") Entity record, @Param("example") EntityCriteria example);

    int updateByExample(@Param("record") Entity record, @Param("example") EntityCriteria example);

    int updateByPrimaryKeySelective(Entity record);

    int updateByPrimaryKey(Entity record);

    void batchInsert(@Param("items") List<Entity> items);
}