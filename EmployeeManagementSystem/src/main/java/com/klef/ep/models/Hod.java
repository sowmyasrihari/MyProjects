package com.klef.ep.models;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name="hod_table")
public class Hod implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="hodid")
	private int hodid;
    @Column(name="hodname")
	private String hodname;
    @Column(name="hoddept")
	private String hoddept;
    @Column(name="hodpwd")
   	private String hodpwd;
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
	
 

}
