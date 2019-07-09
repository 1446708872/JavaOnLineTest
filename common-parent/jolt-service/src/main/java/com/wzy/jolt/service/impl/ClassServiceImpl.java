package com.wzy.jolt.service.impl;

import com.wzy.jolt.model.Class;
import com.wzy.jolt.model.User;
import com.wzy.jolt.service.ClassService;
import com.wzy.jolt.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassServiceImpl extends BaseServiceImpl<Class> implements ClassService {
    @Override
    public Class findByIntId(Integer id) {
        return classMapper.findByIntId(id);
    }

    @Override
    public Class findByStrId(String strId) {
        return classMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {
        classMapper.deleteByIntId(id);
    }

    @Override
    public void deleteByStrId(String strId) {
        classMapper.deleteByStrId(strId);
    }

    @Override
    public void updateT(Class aClass) {
        classMapper.updateT(aClass);
    }

    @Override
    public void insertT(Class aClass) {
        classMapper.insertT(aClass);
    }

    @Override
    public List<Class> query(Class aClass) {
        return classMapper.query(aClass);
    }

    @Override
    public List<Class> findByIntIdList(Integer id) {
        return classMapper.findByIntIdList(id);
    }

    @Override
    public List<Class> findByStrIdList(String id) {
        return classMapper.findByStrIdList(id);
    }

    @Override
    public List<Class> findByList() {
        return classMapper.findByList();
    }

    @Override
    public Class findByIntClass(Class cla) {
        return classMapper.findByIntClass(cla);
    }


}
