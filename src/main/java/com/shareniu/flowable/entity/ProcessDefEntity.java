package com.shareniu.flowable.entity;

import java.io.Serializable;

/**
 * 流程定义实体
 */
public class ProcessDefEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    //流程key
    private String defKey;

    private String processDefName;

    private String processCategory;
    private String processId;
    

    public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getDefKey() {
        return defKey;
    }

    public void setDefKey(String defKey) {
        this.defKey = defKey;
    }

    public String getProcessCategory() {
        return processCategory;
    }

    public void setProcessCategory(String processCategory) {
        this.processCategory = processCategory;
    }

    public String getProcessDefName() {
        return processDefName;
    }

    public void setProcessDefName(String processDefName) {
        this.processDefName = processDefName;
    }

    @Override
    public String toString() {
        return "ProcessDefEntity{" +
                "defKey='" + defKey + '\'' +
                ", processDefName='" + processDefName + '\'' +
                ", processCategory='" + processCategory + '\'' +
                '}';
    }
}
