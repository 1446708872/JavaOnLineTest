package com.wzy.jolt.mapper.base;

import java.util.List;

public interface BaseMapper <T> {
    public T findByIntId(Integer id);

    public T findByStrId(String strId);

    public void deleteByIntId(Integer id);

    public void deleteByStrId(String strId);

    public void updateT(T t);

    public void insertT(T t);

    public List<T> findByIntIdList(Integer id);

    public List<T> findByStrIdList(String id);
}
