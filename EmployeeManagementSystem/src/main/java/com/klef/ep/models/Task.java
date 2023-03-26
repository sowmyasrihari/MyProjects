package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="task_table")
public class Task implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="taskid")
	private int taskid;
    @Column(name="taskname")
	private String taskname;
    @Column(name="taskstatus")
	private String taskstatus;
    @Column(name="taskprogress")
   	private String taskprogress;
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
    
   

}
