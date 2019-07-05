package com.wzy.jolt.mapper;

import com.wzy.jolt.model.ExaminationRecords;
import com.wzy.jolt.model.ExaminationRecordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExaminationRecordsMapper {
    long countByExample(ExaminationRecordsExample example);

    int deleteByExample(ExaminationRecordsExample example);

    int deleteByPrimaryKey(Integer examinationId);

    int insert(ExaminationRecords record);

    int insertSelective(ExaminationRecords record);

    List<ExaminationRecords> selectByExample(ExaminationRecordsExample example);

    ExaminationRecords selectByPrimaryKey(Integer examinationId);

    int updateByExampleSelective(@Param("record") ExaminationRecords record, @Param("example") ExaminationRecordsExample example);

    int updateByExample(@Param("record") ExaminationRecords record, @Param("example") ExaminationRecordsExample example);

    int updateByPrimaryKeySelective(ExaminationRecords record);

    int updateByPrimaryKey(ExaminationRecords record);
}