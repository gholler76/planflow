package com.holler.planflow.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="locdefs")
public class Locdef {
	private String primloc;
	private String secloc;
	
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loctype")
    private Loctype loctype;
    
	public Locdef() {
	}
	
	public Locdef(String primloc, String secloc, Loctype loctype) {
		this.primloc = primloc;
		this.secloc = secloc;
		this.loctype = loctype;
		
	}

	public String getPrimloc() {
		return primloc;
	}

	public void setPrimloc(String primloc) {
		this.primloc = primloc;
	}

	public String getSecloc() {
		return secloc;
	}

	public void setSecloc(String secloc) {
		this.secloc = secloc;
	}

	public Loctype getLoctype() {
		return loctype;
	}

	public void setLoctype(Loctype loctype) {
		this.loctype = loctype;
	}
	
	

}
