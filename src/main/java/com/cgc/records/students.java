package com.cgc.records;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="S_Deatails")
public class students {
	
	@Id
	@Column(name = "Roll_Num")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String branch;
	private String sname;
	private String smob;
	private String semail;
	@Override
	public String toString() {
		return "students [sid=" + sid + ", branch=" + branch + ", sname=" + sname + ", smob=" + smob + ", semail="
				+ semail + "]";
	}

	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSmob() {
		return smob;
	}

	public void setSmob(String smob) {
		this.smob = smob;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	
	public students(int sid, String branch, String sname, String smob, String semail) {
		super();
		this.sid = sid;
		this.branch = branch;
		this.sname = sname;
		this.smob = smob;
		this.semail = semail;
	}
	
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
   

}
