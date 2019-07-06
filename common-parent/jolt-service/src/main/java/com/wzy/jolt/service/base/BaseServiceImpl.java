package com.wzy.jolt.service.base;

import com.wzy.jolt.mapper.ClassMapper;
import com.wzy.jolt.mapper.TitleMapper;
import com.wzy.jolt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    protected UserMapper userMapper;

    @Autowired
    protected TitleMapper titleMapper;

    @Autowired
    protected ClassMapper classMapper;
}
