package com.wzy.jolt.mapper;

import com.wzy.jolt.mapper.base.BaseMapper;
import com.wzy.jolt.model.Choice;

import java.util.List;
import java.util.Map;

public interface ChoiceMapper extends BaseMapper<Choice> {
    public List findByIdListTimer (Map<String,Object>map);

    public int MixSize(int id);

    public List Rand(int problem_id);
}