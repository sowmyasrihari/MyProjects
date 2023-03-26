package com.klef.ep.models;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.TaskService;

@ManagedBean(name = "taskBean",eager = true)
public class TaskBean {
	
	private int taskid;
	private String taskname;
	private String taskstatus;
	private String taskprogress;
	List<Task> tasklist;
	private String response;
	
	@EJB(lookup = "java:global/EmployeeManagementSystem/TaskServiceImpl!com.klef.ep.services.TaskService")
	TaskService taskService;
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public List<Task> getTasklist() {
		return tasklist;
	}
	public void setTasklist(List<Task> tasklist) {
		this.tasklist = tasklist;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getTaskstatus() {
		return taskstatus;
	}
	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}
	public String getTaskprogress() {
		return taskprogress;
	}
	public void setTaskprogress(String taskprogress) {
		this.taskprogress = taskprogress;
	}
	public void inserttask()
	{
		try
		{
			Task t = new Task();
			t.setTaskid(taskid);
			t.setTaskname(taskname);
			t.setTaskprogress(taskprogress);
			t.setTaskstatus(taskstatus);
			response=taskService.inserttask(t);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void viewalltask()
	{
		try
		{
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
