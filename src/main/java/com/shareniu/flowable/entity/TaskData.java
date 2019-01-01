package com.shareniu.flowable.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TaskData implements Serializable {
	// 任务id
	private String taskId;
	// 任务名称节点名称
	private String taskName;
	// 流程实例id
	private String processId;
	// 任务类型
	private String taskType;
	// 任务操作人
	private String taskAssigin;
	private String priority;

	// 任务的紧急程度 0代表普通 1代表催办
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	private Integer type;

	// 任务状态
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	private Integer state;

	// 任务开始时间
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	private String startTime;

	private String endTime;

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	// 任务发起人
	private String adminName;

	public String getTaskAssigin() {
		return taskAssigin;
	}

	public void setTaskAssigin(String taskAssigin) {
		this.taskAssigin = taskAssigin;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public boolean result;

	@Override
	public String toString() {
		return "TaskData{" + "taskId='" + taskId + '\'' + ", taskName='" + taskName + '\'' + ", processId='" + processId
				+ '\'' + ", taskType='" + taskType + '\'' + ", taskAssigin='" + taskAssigin + '\'' + ", adminName='"
				+ adminName + '\'' + ", result=" + result + '}';
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

}
