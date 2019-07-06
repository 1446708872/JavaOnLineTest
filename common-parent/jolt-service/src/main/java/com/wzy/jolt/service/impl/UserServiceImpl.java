package com.wzy.jolt.service.impl;

import com.wzy.jolt.model.Title;
import com.wzy.jolt.model.User;
import com.wzy.jolt.service.UserService;
import com.wzy.jolt.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Override
    public User findByIntId(Integer id) {
        return userMapper.findByIntId(id);
    }

    @Override
    public User findByStrId(String strId) {
        return userMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {
        userMapper.deleteByIntId(id);
    }

    @Override
    public void deleteByStrId(String strId) {
        userMapper.deleteByStrId(strId);
    }

    @Override
    public void updateT(User user) {
        userMapper.updateT(user);
    }

    @Override
    public void insertT(User user) {
        userMapper.insertT(user);
    }

    @Override
    public List<User> findByIntIdList(Integer id) {
        return userMapper.findByIntIdList(id);
    }

    @Override
    public List<User> findByStrIdList(String id) {
        return userMapper.findByStrIdList(id);
    }

    @Override
    public List<User> findByList() {
        return userMapper.findByList();
    }

    @Override
    public List<Title> findByIntIdTitleList(Integer id) {
        return titleMapper.findByIntIdList(id);
    }

}
