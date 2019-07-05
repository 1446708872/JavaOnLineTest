package com.wzy.jolt.service.base;

import com.wzy.jolt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    protected UserMapper userMapper;
}
