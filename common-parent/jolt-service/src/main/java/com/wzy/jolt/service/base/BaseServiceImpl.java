package com.wzy.jolt.service.base;

import com.wzy.jolt.mapper.*;
import com.wzy.jolt.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    protected UserMapper userMapper;

    @Autowired
    protected TitleMapper titleMapper;

    @Autowired
    protected ClassMapper classMapper;

    @Autowired
    protected LibraryMapper libraryMapper;

    @Autowired
    protected ChoiceMapper choiceMapper;

    @Autowired
    protected CompletionMapper completionMapper;

    @Autowired
    protected ExaminationRecordsMapper examinationRecordsMapper;
}
