package com.wzy.jolt.service;

import com.wzy.jolt.model.Library;
import com.wzy.jolt.service.base.BaseService;

public interface LibraryService extends BaseService<Library> {
    public void oppenTest(int problem_id);

    public void closeTest(int problem_id);
}
