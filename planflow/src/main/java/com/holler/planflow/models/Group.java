package com.holler.planflow.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="groups")
public class Group {
	@Id 
	private String group;

	@OneToMany(
	mappedBy="group",
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	
	private List<Area> areas;
	
	public Group() {
		
	}
	
	public Group (String group) {
		this.group = group;
	}
	

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	
	
}

