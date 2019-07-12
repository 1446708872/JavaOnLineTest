package com.wzy.jolt.service.impl;

import com.wzy.jolt.model.ExaminationRecords;
import com.wzy.jolt.service.ExaminationRecordsService;
import com.wzy.jolt.service.base.BaseService;
import com.wzy.jolt.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ExaminationRecordsServiceImpl extends BaseServiceImpl<ExaminationRecords> implements ExaminationRecordsService {
    @Override
    public ExaminationRecords findByIntId(Integer id) {
        return examinationRecordsMapper.findByIntId(id);
    }

    @Override
    public ExaminationRecords findByStrId(String strId) {
        return examinationRecordsMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {
        examinationRecordsMapper.deleteByIntId(id);
    }

    @Override
    public void deleteByStrId(String strId) {
        examinationRecordsMapper.deleteByStrId(strId);
    }

    @Override
    public void updateT(ExaminationRecords examinationRecords) {
        examinationRecordsMapper.updateT(examinationRecords);
    }

    @Override
    public void insertT(ExaminationRecords examinationRecords) {
        examinationRecordsMapper.insertT(examinationRecords);
    }

    @Override
    public List<ExaminationRecords> query(ExaminationRecords examinationRecords) {
        return examinationRecordsMapper.query(examinationRecords);
    }

    @Override
    public List<ExaminationRecords> findByIntIdList(Integer id) {
        return examinationRecordsMapper.findByIntIdList(id);
    }

    @Override
    public List<ExaminationRecords> findByStrIdList(String id) {
        return examinationRecordsMapper.findByStrIdList(id);
    }

    @Override
    public List<ExaminationRecords> findByList() {
        return examinationRecordsMapper.findByList();
    }

    @Override
    public ExaminationRecords findByUserIdAndProblemId(Map<String, Object> map) {
        return examinationRecordsMapper.findByUserIdAndProblemId(map);
    }
}
