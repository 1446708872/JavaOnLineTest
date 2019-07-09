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
        return null;
    }

    @Override
    public Completion findByStrId(String strId) {
        return completionMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {

    }

    @Override
    public void deleteByStrId(String strId) {

    }

    @Override
    public void updateT(Completion completion) {

    }

    @Override
    public void insertT(Completion completion) {
        completionMapper.insertT(completion);
    }

    @Override
    public List<Completion> query(Completion completion) {
        return null;
    }

    @Override
    public List<Completion> findByIntIdList(Integer id) {
        return null;
    }

    @Override
    public List<Completion> findByStrIdList(String id) {
        return null;
    }

    @Override
    public List<Completion> findByList() {
        return completionMapper.findByList();
    }
}
