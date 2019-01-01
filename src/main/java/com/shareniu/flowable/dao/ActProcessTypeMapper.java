package com.shareniu.flowable.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shareniu.flowable.entity.ActProcessType;
@Repository
public interface ActProcessTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActProcessType record);
    List<ActProcessType> selectAll();
    int insertSelective(ActProcessType record);

    ActProcessType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActProcessType record);

    int updateByPrimaryKey(ActProcessType record);
}