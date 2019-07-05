package com.wzy.jolt.mapper;

import com.wzy.jolt.model.Completion;
import com.wzy.jolt.model.CompletionExample;
import com.wzy.jolt.model.CompletionWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompletionMapper {
    long countByExample(CompletionExample example);

    int deleteByExample(CompletionExample example);

    int deleteByPrimaryKey(Integer completionId);

    int insert(CompletionWithBLOBs record);

    int insertSelective(CompletionWithBLOBs record);

    List<CompletionWithBLOBs> selectByExampleWithBLOBs(CompletionExample example);

    List<Completion> selectByExample(CompletionExample example);

    CompletionWithBLOBs selectByPrimaryKey(Integer completionId);

    int updateByExampleSelective(@Param("record") CompletionWithBLOBs record, @Param("example") CompletionExample example);

    int updateByExampleWithBLOBs(@Param("record") CompletionWithBLOBs record, @Param("example") CompletionExample example);

    int updateByExample(@Param("record") Completion record, @Param("example") CompletionExample example);

    int updateByPrimaryKeySelective(CompletionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompletionWithBLOBs record);

    int updateByPrimaryKey(Completion record);
}