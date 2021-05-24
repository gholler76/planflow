package com.holler.planflow.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="areas")
public class Area {
	@Id
	private String area;
		
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="group")
    private Group group;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stortype")
    private StorageType storagetype;

	public Area() {
	}

	public Area(String area, Group group, StorageType storagetype) {
		this.area = area;
		this.group = group;
		this.storagetype = storagetype;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public StorageType getStoragetype() {
		return storagetype;
	}

	public void setStoragetype(StorageType storagetype) {
		this.storagetype = storagetype;
	}

}