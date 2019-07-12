package com.wzy.jolt.service;

import com.wzy.jolt.model.Completion;
import com.wzy.jolt.service.base.BaseService;

import java.util.List;

public interface CompletionService extends BaseService<Completion> {
    public int MixSize( int id);

    public List Rand(int problem_id);
}
