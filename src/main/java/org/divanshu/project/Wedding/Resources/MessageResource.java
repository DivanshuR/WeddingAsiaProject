package org.divanshu.project.Wedding.Resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.divanshu.project.Wedding.Modal.Task;
import org.divanshu.project.Wedding.Service.TaskService;


@Path("/resource")
public class MessageResource {
	
	TaskService taskService=new TaskService();
	 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
 public List getCountries()
 {
  
  List listOfTasks=taskService.getAllTask();
  return listOfTasks;
 }
 
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
 public Task getTaskById(@PathParam("id") int id)
 {
  return taskService.getTask(id);
 }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
 public Task addTask(Task task)
 {
  return taskService.addTask(task);
 }
 
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
 public Task updateTask(Task task)
 {
  return taskService.updateTask(task);
  
 }
 
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
 public void deleteTask(@PathParam("id") int id)
 {
   taskService.deleteTask(id);
  
 }
 
}
