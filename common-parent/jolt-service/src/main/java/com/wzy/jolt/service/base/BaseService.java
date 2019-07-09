package com.wzy.jolt.service.base;

import com.wzy.jolt.model.User;

import java.util.List;

public interface BaseService <T>{
    public T findByIntId(Integer id);

    public T findByStrId(String strId);

    public void deleteByIntId(Integer id);

    public void deleteByStrId(String strId);

    public void updateT(T t);

    public void insertT(T t);

    public List<T> query(T t);

    public List<T> findByIntIdList(Integer id);

    public List<T> findByStrIdList(String id);

    public List<T> findByList();
}
