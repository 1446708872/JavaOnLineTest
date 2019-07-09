package com.wzy.jolt.service.impl;

import com.wzy.jolt.model.Choice;
import com.wzy.jolt.service.ChoiceService;
import com.wzy.jolt.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ChoiceServiceImpl extends BaseServiceImpl<Choice> implements ChoiceService {
    @Override
    public Choice findByIntId(Integer id) {
        return null;
    }

    @Override
    public Choice findByStrId(String strId) {
        return choiceMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {

    }

    @Override
    public void deleteByStrId(String strId) {

    }

    @Override
    public void updateT(Choice choice) {

    }

    @Override
    public void insertT(Choice choice) {
        choiceMapper.insertT(choice);
    }

    @Override
    public List<Choice> query(Choice choice) {
        return null;
    }

    @Override
    public List<Choice> findByIntIdList(Integer id) {
        return null;
    }

    @Override
    public List<Choice> findByStrIdList(String id) {
        return null;
    }

    @Override
    public List<Choice> findByList() {
        return choiceMapper.findByList();
    }
}
