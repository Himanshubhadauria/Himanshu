package com.wtt.tree.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	int sid;
	String sname;
	String sstream;
	
	
	public Student() {
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSstream() {
		return sstream;
	}
	public void setSstream(String sstream) {
		this.sstream = sstream;
	}
	
	public Student(int sid, String sname, String sstream) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sstream = sstream;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sstream=" + sstream + "]";
	}

}

