package com.klef.ep.models;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "hodBean",eager = true)
public class HodBean 
{
	private int hodid;
	public int getHodid() {
		return hodid;
	}
	public void setHodid(int hodid) {
		this.hodid = hodid;
	}
	public String getHodname() {
		return hodname;
	}
	public void setHodname(String hodname) {
		this.hodname = hodname;
	}
	public String getHoddept() {
		return hoddept;
	}
	public void setHoddept(String hoddept) {
		this.hoddept = hoddept;
	}
	public String getHodpwd() {
		return hodpwd;
	}
	public void setHodpwd(String hodpwd) {
		this.hodpwd = hodpwd;
	}
	private String hodname;
	private String hoddept;
	private String hodpwd;

}
