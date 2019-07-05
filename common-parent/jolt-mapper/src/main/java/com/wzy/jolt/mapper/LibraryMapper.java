package com.wzy.jolt.mapper;

import com.wzy.jolt.model.Library;
import com.wzy.jolt.model.LibraryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LibraryMapper {
    long countByExample(LibraryExample example);

    int deleteByExample(LibraryExample example);

    int deleteByPrimaryKey(Integer problemId);

    int insert(Library record);

    int insertSelective(Library record);

    List<Library> selectByExample(LibraryExample example);

    Library selectByPrimaryKey(Integer problemId);

    int updateByExampleSelective(@Param("record") Library record, @Param("example") LibraryExample example);

    int updateByExample(@Param("record") Library record, @Param("example") LibraryExample example);

    int updateByPrimaryKeySelective(Library record);

    int updateByPrimaryKey(Library record);
}