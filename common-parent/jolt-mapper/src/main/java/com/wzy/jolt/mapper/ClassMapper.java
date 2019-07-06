package com.wzy.jolt.mapper;


import com.wzy.jolt.mapper.base.BaseMapper;
import com.wzy.jolt.model.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMapper extends BaseMapper<Class> {
    public Class findByIntClass(Class cla);
}