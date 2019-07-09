package com.wzy.jolt.service;

import com.wzy.jolt.model.Class;
import com.wzy.jolt.model.Ltmit;
import com.wzy.jolt.service.base.BaseService;

import java.util.List;

public interface  ClassService extends BaseService<Class> {
    public Class findByIntClass(Class cla);
}
