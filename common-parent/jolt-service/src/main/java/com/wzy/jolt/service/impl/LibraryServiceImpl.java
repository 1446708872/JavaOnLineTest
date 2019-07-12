package com.wzy.jolt.service.impl;

import com.wzy.jolt.model.Library;
import com.wzy.jolt.model.User;
import com.wzy.jolt.service.LibraryService;
import com.wzy.jolt.service.UserService;
import com.wzy.jolt.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LibraryServiceImpl extends BaseServiceImpl<Library> implements LibraryService {
    @Override
    public Library findByIntId(Integer id) {
        return  libraryMapper.findByIntId(id);
    }

    @Override
    public Library findByStrId(String strId) {
        return libraryMapper.findByStrId(strId);
    }

    @Override
    public void deleteByIntId(Integer id) {
        libraryMapper.deleteByIntId(id);
    }

    @Override
    public void deleteByStrId(String strId) {

    }

    @Override
    public void updateT(Library library) {
        libraryMapper.updateT(library);
    }

    @Override
    public void insertT(Library library) {
        libraryMapper.insertT(library);
    }

    @Override
    public List<Library> query(Library library) {
        return libraryMapper.query(library);
    }

    @Override
    public List<Library> findByIntIdList(Integer id) {
        return null;
    }

    @Override
    public List<Library> findByStrIdList(String id) {
        return null;
    }

    @Override
    public List<Library> findByList() {
        return libraryMapper.findByList();
    }

    @Override
    public void oppenTest(int problem_id) {
        libraryMapper.oppenTest(problem_id);
    }

    @Override
    public void closeTest(int problem_id) {
        libraryMapper.closeTest(problem_id);
    }
}
