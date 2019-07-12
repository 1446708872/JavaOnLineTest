package com.wzy.jolt.service;

import com.wzy.jolt.model.Choice;
import com.wzy.jolt.model.Class;
import com.wzy.jolt.service.base.BaseService;

import java.util.List;
import java.util.Map;

public interface ChoiceService extends BaseService<Choice> {
    public List findByIdListTimer (Map<String,Object> map);

    public int MixSize( int id);

    public List Rand(int problem_id);
}
