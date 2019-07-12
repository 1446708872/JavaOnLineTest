package com.wzy.jolt.service;

import com.wzy.jolt.model.ExaminationRecords;
import com.wzy.jolt.service.base.BaseService;

import java.util.Map;

public interface ExaminationRecordsService extends BaseService<ExaminationRecords> {
    public ExaminationRecords findByUserIdAndProblemId(Map<String,Object> map);
}
