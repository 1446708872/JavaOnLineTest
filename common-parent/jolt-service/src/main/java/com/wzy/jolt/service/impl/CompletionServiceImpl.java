package com.wzy.jolt.service.impl;

import com.wzy.jolt.model.Completion;
import com.wzy.jolt.service.CompletionService;
import com.wzy.jolt.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CompletionServiceImpl extends BaseServiceImpl<Completion> implements CompletionService {
    @Override
    public Completion findByIntId(Integer id) {
        return completionMapper.findByIntId(id);
    }

    @Override
    public Completion findByStrId(String strId) {
        return completionMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {
        completionMapper.deleteByIntId(id);
    }

    @Override
    public void deleteByStrId(String strId) {
        completionMapper.deleteByStrId(strId);
    }

    @Override
    public void updateT(Completion completion) {
        completionMapper.updateT(completion);
    }

    @Override
    public void insertT(Completion completion) {
        completionMapper.insertT(completion);
    }

    @Override
    public List<Completion> query(Completion completion) {
        return completionMapper.query(completion);
    }

    @Override
    public List<Completion> findByIntIdList(Integer id) {
        return completionMapper.findByIntIdList(id);
    }

    @Override
    public List<Completion> findByStrIdList(String id) {
        return completionMapper.findByStrIdList(id);
    }

    @Override
    public List<Completion> findByList() {
        return completionMapper.findByList();
    }

    @Override
    public int MixSize(int id) {
        return completionMapper.MixSize(id);
    }

    @Override
    public List Rand(int problem_id) {
        return completionMapper.Rand(problem_id);
    }
}
