package com.shareniu.flowable.dao;

import java.util.List;

import com.shareniu.flowable.entity.ProcessDefEntity;
import com.shareniu.flowable.util.Parametermap;

/**
 * Created by Administrator on 2018/1/3.
 */
public interface ProcessDefDao {
    /**
     * 查询所有已经部署的流程
     * @param pm
     * @return
     */
    public List<ProcessDefEntity> queryPageAllProcessDefPage(Parametermap pm);

}
