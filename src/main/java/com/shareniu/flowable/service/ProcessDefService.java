package com.shareniu.flowable.service;

import java.util.List;

import com.shareniu.flowable.entity.ProcessDefEntity;
import com.shareniu.flowable.util.Parametermap;

public interface ProcessDefService {
	   /**
     * 查询所有已经部署的流程
     * @param pm
     * @return
     */
    public List<ProcessDefEntity> queryPageAllProcessDef(Parametermap pm);
}
