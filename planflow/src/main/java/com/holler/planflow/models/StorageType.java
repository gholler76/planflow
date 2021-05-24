package com.holler.planflow.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="storagetypes")
public class Storagetype {
	@Id
	private String stortype;
	private Integer storcap;
	
	@OneToMany(
	mappedBy="stortype",
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	private List<Area> areas;
	
	@OneToMany(
	mappedBy="stortype",
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	private List<Dock> docks;
	
		
	public Storagetype() {
		
	}
	
	public Storagetype(String stortype,Integer storcap)  {
		this.stortype = stortype;
		this.storcap = storcap;
	}

	public String getStortype() {
		return stortype;
	}

	public void setStortype(String stortype) {
		this.stortype = stortype;
	}

	public Integer getStorcap() {
		return storcap;
	}

	public void setStorcap(Integer storcap) {
		this.storcap = storcap;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public List<Dock> getDocks() {
		return docks;
	}

	public void setDocks(List<Dock> docks) {
		this.docks = docks;
	}

	
	
}
