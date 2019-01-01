package com.shareniu.flowable.service;

import java.util.List;

import com.shareniu.flowable.entity.TaskAPIData;
import com.shareniu.flowable.entity.TaskData;

public interface ShareniuTaskService {
	

    /**
     * 分页查询代办事项
     * @param taskAPIData
     * @param pageSize
     * @return
     */
    List<TaskData> taskListPage(String userId);


    public List<TaskAPIData> queryByUserIdPage(String userId);

    
}
