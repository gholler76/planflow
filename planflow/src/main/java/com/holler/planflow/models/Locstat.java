package com.holler.planflow.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="locstats")
public class Locstat {
	@Id
	private String locstat;
	private String descrip;
	
	@OneToMany(
	mappedBy="locstat",
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	private List<Loc> locs;
	
	@OneToMany(
	mappedBy="locstat",
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
	private List<Dock> docks;
	

	public Locstat() {
		
	}
	
	public Locstat(String locstat, String descrip) {
		this.locstat = locstat;
		this.descrip = descrip;
	}

	public String getLocstat() {
		return locstat;
	}

	public void setLocstat(String locstat) {
		this.locstat = locstat;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public List<Loc> getLocs() {
		return locs;
	}

	public void setLocs(List<Loc> locs) {
		this.locs = locs;
	}

	public List<Dock> getDocks() {
		return docks;
	}

	public void setDocks(List<Dock> docks) {
		this.docks = docks;
	}
	
	

}
