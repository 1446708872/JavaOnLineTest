package com.wzy.jolt.mapper;

import com.wzy.jolt.model.Choice;
import com.wzy.jolt.model.ChoiceExample;
import com.wzy.jolt.model.ChoiceWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChoiceMapper {
    long countByExample(ChoiceExample example);

    int deleteByExample(ChoiceExample example);

    int deleteByPrimaryKey(Integer choiceId);

    int insert(ChoiceWithBLOBs record);

    int insertSelective(ChoiceWithBLOBs record);

    List<ChoiceWithBLOBs> selectByExampleWithBLOBs(ChoiceExample example);

    List<Choice> selectByExample(ChoiceExample example);

    ChoiceWithBLOBs selectByPrimaryKey(Integer choiceId);

    int updateByExampleSelective(@Param("record") ChoiceWithBLOBs record, @Param("example") ChoiceExample example);

    int updateByExampleWithBLOBs(@Param("record") ChoiceWithBLOBs record, @Param("example") ChoiceExample example);

    int updateByExample(@Param("record") Choice record, @Param("example") ChoiceExample example);

    int updateByPrimaryKeySelective(ChoiceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ChoiceWithBLOBs record);

    int updateByPrimaryKey(Choice record);
}