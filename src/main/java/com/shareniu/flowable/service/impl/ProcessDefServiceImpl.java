package com.shareniu.flowable.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareniu.flowable.dao.ProcessDefDao;
import com.shareniu.flowable.entity.ProcessDefEntity;
import com.shareniu.flowable.service.ProcessDefService;
import com.shareniu.flowable.util.Parametermap;
@Service
public class ProcessDefServiceImpl implements ProcessDefService {
	@Autowired
	private ProcessDefDao ProcessDefDao;
	@Override
	public List<ProcessDefEntity> queryPageAllProcessDef(Parametermap pm) {
		return ProcessDefDao.queryPageAllProcessDefPage(pm);
	}

}
