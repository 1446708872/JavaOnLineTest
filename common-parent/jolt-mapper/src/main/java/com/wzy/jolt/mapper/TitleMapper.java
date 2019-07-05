package com.wzy.jolt.mapper;

import com.wzy.jolt.model.Title;
import com.wzy.jolt.model.TitleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TitleMapper {
    long countByExample(TitleExample example);

    int deleteByExample(TitleExample example);

    int deleteByPrimaryKey(Integer titlePower);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    Title selectByPrimaryKey(Integer titlePower);

    int updateByExampleSelective(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByExample(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}