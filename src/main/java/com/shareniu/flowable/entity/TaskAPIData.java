package com.shareniu.flowable.entity;

import java.io.Serializable;
import java.util.Date;

/**
 */
public class TaskAPIData implements Serializable {
    private static final long serialVersionUID = 1L;
    private String taskId;
    private String taskKey;
    private String taskName;
    private Date startTime;
    private String processInstanceId;
    //流程实例名称
    private String processInstanceName;
    private Date endTime;
    private Date applyTime;
    private Date stopTime;
    //优先级 正常 50 紧急 100 特别紧急 150
    // 1 2 3 级
    private Integer priority;
    //发起人id
    private String startUserId;
    private String handerId;

    public String getHanderId() {
        return handerId;
    }

    public void setHanderId(String handerId) {
        this.handerId = handerId;
    }

    //处理时间
    private Date dueDate;
    //流程定义名称
    private String processDefName;
    //任务节点类型 1.代表审核节点 2代表知会节点
    private String taskType;
    //流程定义id
    private String processDefId;
    private String processKey;
    //是否可以撤回
    private Boolean canPick;
    //处理结果
    private Boolean result;
    //流程的状态
    private Integer state;
    //流程的类别 1代表人事 2代表资产
    private String processCategory;
    //系统id
    private String systemId;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getProcessKey() {
        return processKey;
    }

    public void setProcessKey(String processKey) {
        this.processKey = processKey;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskKey() {
        return taskKey;
    }

    public void setTaskKey(String taskKey) {
        this.taskKey = taskKey;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessDefName() {
        return processDefName;
    }

    public String getProcessInstanceName() {
        return processInstanceName;
    }

    public void setProcessInstanceName(String processInstanceName) {
        this.processInstanceName = processInstanceName;
    }

    public void setProcessDefName(String processDefName) {
        this.processDefName = processDefName;
    }

    public String getStartUserId() {
        return startUserId;
    }

    public void setStartUserId(String startUserId) {
        this.startUserId = startUserId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public String getProcessDefId() {
        return processDefId;
    }

    public void setProcessDefId(String processDefId) {
        this.processDefId = processDefId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Boolean getCanPick() {
        return canPick;
    }

    public void setCanPick(Boolean canPick) {
        this.canPick = canPick;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }


    public String getProcessCategory() {
        return processCategory;
    }

    public void setProcessCategory(String processCategory) {
        this.processCategory = processCategory;
    }

    @Override
    public String toString() {
        return "TaskAPIData{" +
                "taskId='" + taskId + '\'' +
                ", taskKey='" + taskKey + '\'' +
                ", taskName='" + taskName + '\'' +
                ", startTime=" + startTime +
                ", processInstanceId='" + processInstanceId + '\'' +
                ", endTime=" + endTime +
                ", applyTime=" + applyTime +
                ", stopTime=" + stopTime +
                ", priority=" + priority +
                ", startUserId='" + startUserId + '\'' +
                ", handerId='" + handerId + '\'' +
                ", dueDate=" + dueDate +
                ", processDefName='" + processDefName + '\'' +
                ", taskType='" + taskType + '\'' +
                ", processDefId='" + processDefId + '\'' +
                ", canPick=" + canPick +
                ", result=" + result +
                ", state=" + state +
                ", processCategory='" + processCategory + '\'' +
                '}';
    }
}
