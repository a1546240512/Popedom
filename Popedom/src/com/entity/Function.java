package com.entity;

import java.sql.Timestamp;

public class Function {
	private int fFunID;
	private String fFunName;
	private String fFunClassName;
	private String fCreateUser;
	private Timestamp  fLastEditTime;
	public int getfFunID() {
		return fFunID;
	}
	public void setfFunID(int fFunID) {
		this.fFunID = fFunID;
	}
	public String getfFunName() {
		return fFunName;
	}
	public void setfFunName(String fFunName) {
		this.fFunName = fFunName;
	}
	public String getfFunClassName() {
		return fFunClassName;
	}
	public void setfFunClassName(String fFunClassName) {
		this.fFunClassName = fFunClassName;
	}
	public String getfCreateUser() {
		return fCreateUser;
	}
	public void setfCreateUser(String fCreateUser) {
		this.fCreateUser = fCreateUser;
	}
	public Timestamp getfLastEditTime() {
		return fLastEditTime;
	}
	public void setfLastEditTime(Timestamp fLastEditTime) {
		this.fLastEditTime = fLastEditTime;
	}
	@Override
	public String toString() {
		return "Function [fFunID=" + fFunID + ", fFunName=" + fFunName
				+ ", fFunClassName=" + fFunClassName + ", fCreateUser="
				+ fCreateUser + ", fLastEditTime=" + fLastEditTime + "]";
	}
	public Function(int fFunID, String fFunName, String fFunClassName,
			String fCreateUser, Timestamp fLastEditTime) {
		super();
		this.fFunID = fFunID;
		this.fFunName = fFunName;
		this.fFunClassName = fFunClassName;
		this.fCreateUser = fCreateUser;
		this.fLastEditTime = fLastEditTime;
	}
	public Function() {
		super();
	}
	
}
