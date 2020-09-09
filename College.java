package com.myschool.model;

public class College {
	private int cId;
	private String cName;
	private int noOfStud;
	public int getcId() {
	return cId;
	}
	public void setcId(int cId) {
	this.cId = cId;
	}
	public String getcName() {
	return cName;
	}
	public void setcName(String cName) {
	this.cName = cName;
	}
	public int getNoOfStud() {
	return noOfStud;
	}
	public void setNoOfStud(int noOfStud) {
	this.noOfStud = noOfStud;
	}
	public College(int cId, String cName, int noOfStud) {
	super();
	this.cId = cId;
	this.cName = cName;
	this.noOfStud = noOfStud;
	}

	public College() {
	// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
	return "College [cId=" + cId + ", cName=" + cName + ", noOfStud=" + noOfStud + "]";
	}



	}


