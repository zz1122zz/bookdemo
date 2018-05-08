package org.creation.demo.entity.bookdemo.mysql;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.creation.demo.entity.bookdemo.StringProperty;
import org.creation.demo.entity.bookdemo.StringPropertyCriteria;

public interface StringPropertyMapper {
    int countByExample(StringPropertyCriteria example);

    int deleteByExample(StringPropertyCriteria example);

    int deleteByPrimaryKey(Long uniquePropertyCode);

    int insert(StringProperty record);

    int insertSelective(StringProperty record);

    List<StringProperty> selectByExampleWithRowbounds(StringPropertyCriteria example, RowBounds rowBounds);

    List<StringProperty> selectByExample(StringPropertyCriteria example);

    StringProperty selectByPrimaryKey(Long uniquePropertyCode);

    int updateByExampleSelective(@Param("record") StringProperty record, @Param("example") StringPropertyCriteria example);

    int updateByExample(@Param("record") StringProperty record, @Param("example") StringPropertyCriteria example);

    int updateByPrimaryKeySelective(StringProperty record);

    int updateByPrimaryKey(StringProperty record);

    void batchInsert(@Param("items") List<StringProperty> items);
}