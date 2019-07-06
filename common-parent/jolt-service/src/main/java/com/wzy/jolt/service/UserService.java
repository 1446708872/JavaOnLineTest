package com.wzy.jolt.service;

import com.wzy.jolt.model.Title;
import com.wzy.jolt.model.User;
import com.wzy.jolt.service.base.BaseService;
import com.wzy.jolt.service.base.BaseServiceImpl;

import java.util.List;

public interface UserService  extends BaseService<User> {
    public List<Title> findByIntIdTitleList(Integer id);
}
