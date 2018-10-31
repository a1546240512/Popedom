package com.entity;

import java.sql.Timestamp;

public class User {
	private String fUser;
	private String fPassword;
	private String fBanci;
	private int fRoleID;
	private String fDescription;
	private String fCreateUser;
	private Timestamp fLastEditTime;
	private String fRoleName;
	public String getfRoleName() {
		return fRoleName;
	}
	public void setfRoleName(String fRoleName) {
		this.fRoleName = fRoleName;
	}
	public String getfUser() {
		return fUser;
	}
	public void setfUser(String fUser) {
		this.fUser = fUser;
	}
	public String getfPassword() {
		return fPassword;
	}
	public void setfPassword(String fPassword) {
		this.fPassword = fPassword;
	}
	public String getfBanci() {
		return fBanci;
	}
	public void setfBanci(String fBanci) {
		this.fBanci = fBanci;
	}
	public int getfRoleID() {
		return fRoleID;
	}
	public void setfRoleID(int fRoleID) {
		this.fRoleID = fRoleID;
	}
	public String getfDescription() {
		return fDescription;
	}
	public void setfDescription(String fDescription) {
		this.fDescription = fDescription;
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
		return "User [fUser=" + fUser + ", fPassword=" + fPassword
				+ ", fBanci=" + fBanci + ", fRoleId=" + fRoleID
				+ ", fDescription=" + fDescription + ", fCreateUser="
				+ fCreateUser + ", fLastEditTime=" + fLastEditTime
				+ ", fRoleName=" + fRoleName + "]";
	}
	
	public User(String fUser, String fPassword, String fBanci, int fRoleId,
			String fDescription, String fCreateUser, Timestamp fLastEditTime,
			String fRoleName) {
		super();
		this.fUser = fUser;
		this.fPassword = fPassword;
		this.fBanci = fBanci;
		this.fRoleID = fRoleId;
		this.fDescription = fDescription;
		this.fCreateUser = fCreateUser;
		this.fLastEditTime = fLastEditTime;
		this.fRoleName = fRoleName;
	}
	public User() {
		super();
	}
	
}
