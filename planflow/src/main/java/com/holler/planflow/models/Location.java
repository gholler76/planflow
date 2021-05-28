package com.holler.planflow.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class Location {
	@Id
	@GeneratedValue
	private Long locid;
	
	@Column(name="rack", length=3, nullable=false)	
	private String rack;

	@Column(name="xcoor", length=3, nullable=false)
	private String xcoor;
	
	@Column(name="ycoor", length=3, nullable=false)
	private String ycoor;
	
	@OneToOne(
	mappedBy="location",
	cascade=CascadeType.ALL,
	fetch=FetchType.LAZY)
    private Pallet pallet;
	
	public Location() {
		
	}
	
	public Location(
		String rack,
		String xcoor,
		String ycoor
			) {
		this.rack = rack;
		this.xcoor = xcoor;
		this.ycoor = ycoor;
	}

	public Long getLocid() {
		return locid;
	}

	public void setLocid(Long locid) {
		this.locid = locid;
	}

	public String getRack() {
		return rack;
	}

	public void setRack(String rack) {
		this.rack = rack;
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

	public Pallet getPallet() {
		return pallet;
	}

	public void setPallet(Pallet pallet) {
		this.pallet = pallet;
	}


	
	
}