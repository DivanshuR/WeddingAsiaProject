package org.divanshu.project.Wedding.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.divanshu.project.Wedding.Modal.Task;

public class TaskService {
	
	static HashMap<Integer,Task> TaskIdMap=getTaskIdMap();
	 
	 
	 public TaskService() {
	  super();
	 
	  if(TaskIdMap==null)
	  {
		  TaskIdMap=new HashMap<Integer,Task>();
	  // Creating some objects of Country while initializing
	   Task aTask=new Task(1, "aTask",true);
	   Task bTask=new Task(4, "bTask",false);
	   Task cTask=new Task(3, "cTask",true);
	   Task dTask=new Task(2, "dTask",true);
	 
	 
	   TaskIdMap.put(1,aTask);
	   TaskIdMap.put(4,bTask);
	   TaskIdMap.put(3,cTask);
	   TaskIdMap.put(2,dTask);
	  }
	 }
	 
	 public List getAllTask()
	 {
	  List task = new ArrayList(TaskIdMap.values());
	  return task;
	 }
	 
	 public Task getTask(int id)
	 {
		 Task task= TaskIdMap.get(id);
	  return task;
	 }
	 public Task addTask(Task task)
	 {
	  task.setTaskId(TaskIdMap.size()+1);
	  TaskIdMap.put(task.getTaskId(), task);
	  return task;
	 }
	 
	 public Task updateTask(Task task)
	 {
	  if(task.getTaskId()<=0)
	   return null;
	  TaskIdMap.put(task.getTaskId(),task);
	  return task;
	 
	 }
	 public void deleteTask(int id)
	 {
		 TaskIdMap.remove(id);
	 }
	 
	 public static HashMap<Integer, Task> getTaskIdMap() {
	  return TaskIdMap;
	 }
	}