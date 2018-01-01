package org.divanshu.project.Wedding.Modal;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Task {
	
	private Integer taskId;
	private String TaskName;
	private Boolean isDone;
	private Date CreatedAt;
	private Date DoneAt;
	
	
	
	public Task() {
		
	}

	public Task(Integer taskId,String TaskName,Boolean isDone){
		this.taskId=taskId;
		this.TaskName=TaskName;
		this.isDone=isDone;
		this.CreatedAt=new Date();
		this.DoneAt= new Date();
		
		
		
	}
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	public Boolean getIsDone() {
		return isDone;
	}
	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}
	public Date getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}
	public Date getDoneAt() {
		return DoneAt;
	}
	public void setDoneAt(Date doneAt) {
		DoneAt = doneAt;
	}
	
	
	

}
