package com.wzy.jolt.mapper;


import com.wzy.jolt.mapper.base.BaseMapper;
import com.wzy.jolt.model.Library;

import java.util.List;

public interface LibraryMapper extends BaseMapper<Library> {
    public void oppenTest(int problem_id);

    public void closeTest(int problem_id);
}