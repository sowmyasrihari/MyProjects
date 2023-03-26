package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="employee_table")
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="employeeid")
	private int empid;
    @Column(name="employeename")
	private String empname;
    @Column(name="employeedept")
	private String empdept;
    @Column(name="employeesalary")
    private int empsal;
    @Column(name="employeepassword")
    private String emppwd;
    @Column(name="employeetask")
    private String emptask;
    
	
   public String getEmptask() {
		return emptask;
	}
	public void setEmptask(String emptask) {
		this.emptask = emptask;
	}
public String getEmppwd() {
		return emppwd;
	}
	public void setEmppwd(String emppwd) {
		this.emppwd = emppwd;
	}
public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

}
