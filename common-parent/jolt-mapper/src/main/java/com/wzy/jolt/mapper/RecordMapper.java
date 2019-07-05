package com.wzy.jolt.mapper;

import com.wzy.jolt.model.Record;
import com.wzy.jolt.model.RecordExample;
import com.wzy.jolt.model.RecordWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordMapper {
    long countByExample(RecordExample example);

    int deleteByExample(RecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(RecordWithBLOBs record);

    int insertSelective(RecordWithBLOBs record);

    List<RecordWithBLOBs> selectByExampleWithBLOBs(RecordExample example);

    List<Record> selectByExample(RecordExample example);

    RecordWithBLOBs selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") RecordWithBLOBs record, @Param("example") RecordExample example);

    int updateByExampleWithBLOBs(@Param("record") RecordWithBLOBs record, @Param("example") RecordExample example);

    int updateByExample(@Param("record") Record record, @Param("example") RecordExample example);

    int updateByPrimaryKeySelective(RecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RecordWithBLOBs record);

    int updateByPrimaryKey(Record record);
}