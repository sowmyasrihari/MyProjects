package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.EmployeeService;
import com.klef.ep.services.TaskService;

@ManagedBean(name = "empBean",eager = true)
public class EmployeeBean 
{
	private int eid;
	private String ename;
	private String edept;
	private String response;
	private int esal;
	private String etask;
	private int taskid;
	private String taskname;
	private String taskstatus;
	private String taskprogress;
	List<Task> tasklist;
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
	
	public String getEtask() {
		return etask;
	}

	public void setEtask(String etask) {
		this.etask = etask;
	}
	Employee empdetails=new Employee();
	

	public Employee getEmpdetails() {
		return empdetails;
	}

	public void setEmpdetails(Employee empdetails) {
		this.empdetails = empdetails;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public String getEpwd() {
		return epwd;
	}

	public void setEpwd(String epwd) {
		this.epwd = epwd;
	}
	private String epwd;
	

	List<Employee> emplist;
	
	@EJB(lookup = "java:global/EmployeeManagementSystem/EmployeeServiceImpl!com.klef.ep.services.EmployeeService")
	EmployeeService employeeService;
	
	TaskService taskService;
	
	public List<Employee> getEmplist() 
	{
		return employeeService.viewallemployees();
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	
	
	public void insertemp()
	{
		try
		{
			Employee emp = new Employee();
			emp.setEmpid(eid);
			emp.setEmpname(ename);
			emp.setEmpdept(edept);
			emp.setEmpsal(esal);
			response=employeeService.insertemployee(emp);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void updateemp()
	{
		try
		{
			Employee emp = new Employee();
			emp.setEmpid(eid);
			emp.setEmpname(ename);
			emp.setEmpdept(edept);
			emp.setEmpsal(esal);
			response=employeeService.updateemployee(emp, eid);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void deleteemp()
	{
		try
		{
			response=employeeService.deleteemployee(eid);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void viewallemp()
	{
		try
		{
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void viewdetails()
	{
		try {
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
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
}
