package com.holler.planflow.models;

import java.io.Serializable;

public class LocId implements Serializable {
	private String row;
	private String xcoor;
	private String ycoor;

	public LocId() {
	}

	public LocId(String row, String xcoor, String ycoor) {
		this.row = row;
		this.xcoor = xcoor;
		this.ycoor = ycoor;
	}

	public String getRownum() {
		return row;
	}

	public void setRownum(String rownum) {
		this.row = rownum;
	}

	public String getXcoor() {
		return xcoor;
	}

	public void setXcoor(String xcoor) {
		this.xcoor = xcoor;
	}

	public String getYcoor() {
		return ycoor;
	}

	public void setYcoor(String ycoor) {
		this.ycoor = ycoor;
	}

	
}
