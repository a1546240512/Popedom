package com.entity;

import java.sql.Timestamp;

public class Role {
	private int fRoleID;
	private String fRoleName;
	private String fCreateUser;
	private Timestamp fLastEditTime;
	private String fDescription;
	public int getfRoleID() {
		return fRoleID;
	}
	public void setfRoleID(int fRoleID) {
		this.fRoleID = fRoleID;
	}
	public String getfRoleName() {
		return fRoleName;
	}
	public void setfRoleName(String fRoleName) {
		this.fRoleName = fRoleName;
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
	
	public Role(int fRoleID, String fRoleName, String fCreateUser,
			Timestamp fLastEditTime, String fDescription) {
		super();
		this.fRoleID = fRoleID;
		this.fRoleName = fRoleName;
		this.fCreateUser = fCreateUser;
		this.fLastEditTime = fLastEditTime;
		this.fDescription = fDescription;
	}
	@Override
	public String toString() {
		return "Role [fRoleID=" + fRoleID + ", fRoleName=" + fRoleName
				+ ", fCreateUser=" + fCreateUser + ", fLastEditTime="
				+ fLastEditTime + ", fDescription=" + fDescription + "]";
	}
	public String getfDescription() {
		return fDescription;
	}
	public void setfDescription(String fDescription) {
		this.fDescription = fDescription;
	}
	public Role() {
		super();
	}
	
}
