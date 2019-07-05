package com.wzy.jolt.service.base;

public interface BaseService <T>{
    public T findByIntId(Integer id);

    public T findByStrId(String strId);

    public void deleteByIntId(Integer id);

    public void deleteByStrId(String strId);

    public void updateT(T t);

    public void insertT(T t);
}
