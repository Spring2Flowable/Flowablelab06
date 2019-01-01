package com.shareniu.flowable.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareniu.flowable.dao.ActProcessTypeMapper;
import com.shareniu.flowable.entity.ActProcessType;
import com.shareniu.flowable.service.ActProcessTypeService;
@Service("actProcessTypeServiceImpl")
public class ActProcessTypeServiceImpl implements ActProcessTypeService{

	@Autowired
	ActProcessTypeMapper actProcessTypeMapper;
	@Override
	public List<ActProcessType> selectAll() {
		return actProcessTypeMapper.selectAll();
	}

}
