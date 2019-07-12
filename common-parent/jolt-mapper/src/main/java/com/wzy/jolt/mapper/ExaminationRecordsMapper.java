package com.wzy.jolt.mapper;

import com.wzy.jolt.mapper.base.BaseMapper;
import com.wzy.jolt.model.ExaminationRecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ExaminationRecordsMapper extends BaseMapper<ExaminationRecords> {
    public ExaminationRecords findByUserIdAndProblemId(Map<String,Object> map);
}