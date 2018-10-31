package com.entity;

import java.util.List;

public class RoleFun {
	private int fRoleID;
	private int fFunID;
	private List<String> fFunName;
	public int getfRoleID() {
		return fRoleID;
	}
	public void setfRoleID(int fRoleID) {
		this.fRoleID = fRoleID;
	}
	public int getfFunID() {
		return fFunID;
	}
	public void setfFunID(int fFunID) {
		this.fFunID = fFunID;
	}
	public List<String> getfFunName() {
		return fFunName;
	}
	public void setfFunName(List<String> fFunName) {
		this.fFunName = fFunName;
	}
	@Override
	public String toString() {
		return "RoleFun [fRoleID=" + fRoleID + ", fFunID=" + fFunID
				+ ", fFunName=" + fFunName + "]";
	}
	public RoleFun(int fRoleID, int fFunID, List<String> fFunName) {
		super();
		this.fRoleID = fRoleID;
		this.fFunID = fFunID;
		this.fFunName = fFunName;
	}
	public RoleFun() {
		super();
	}

	
}
