package org.creation.demo.entity.bookdemo.mysql;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.creation.demo.entity.bookdemo.NumericProperty;
import org.creation.demo.entity.bookdemo.NumericPropertyCriteria;

public interface NumericPropertyMapper {
    int countByExample(NumericPropertyCriteria example);

    int deleteByExample(NumericPropertyCriteria example);

    int deleteByPrimaryKey(Long uniquePropertyCode);

    int insert(NumericProperty record);

    int insertSelective(NumericProperty record);

    List<NumericProperty> selectByExampleWithRowbounds(NumericPropertyCriteria example, RowBounds rowBounds);

    List<NumericProperty> selectByExample(NumericPropertyCriteria example);

    NumericProperty selectByPrimaryKey(Long uniquePropertyCode);

    int updateByExampleSelective(@Param("record") NumericProperty record, @Param("example") NumericPropertyCriteria example);

    int updateByExample(@Param("record") NumericProperty record, @Param("example") NumericPropertyCriteria example);

    int updateByPrimaryKeySelective(NumericProperty record);

    int updateByPrimaryKey(NumericProperty record);

    void batchInsert(@Param("items") List<NumericProperty> items);
}