package com.wzy.jolt.service.impl;

import com.wzy.jolt.model.Choice;
import com.wzy.jolt.service.ChoiceService;
import com.wzy.jolt.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ChoiceServiceImpl extends BaseServiceImpl<Choice> implements ChoiceService {
    @Override
    public Choice findByIntId(Integer id) {
        return choiceMapper.findByIntId(id);
    }

    @Override
    public Choice findByStrId(String strId) {
        return choiceMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {
        choiceMapper.deleteByIntId(id);
    }

    @Override
    public void deleteByStrId(String strId) {
        choiceMapper.deleteByStrId(strId);
    }

    @Override
    public void updateT(Choice choice) {
        choiceMapper.updateT(choice);
    }

    @Override
    public void insertT(Choice choice) {
        choiceMapper.insertT(choice);
    }

    @Override
    public List<Choice> query(Choice choice) {
        return choiceMapper.query(choice);
    }

    @Override
    public List<Choice> findByIntIdList(Integer id) {
        return choiceMapper.findByIntIdList(id);
    }

    @Override
    public List<Choice> findByStrIdList(String id) {
        return choiceMapper.findByStrIdList(id);
    }

    @Override
    public List<Choice> findByList() {
        return choiceMapper.findByList();
    }

    @Override
    public List findByIdListTimer(Map<String, Object> map) {
        return choiceMapper.findByIdListTimer(map);
    }

    @Override
    public int MixSize(int id) {
        return choiceMapper.MixSize(id);
    }

    @Override
    public List Rand(int problem_id) {
        return choiceMapper.Rand(problem_id);
    }
}
