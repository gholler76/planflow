package com.holler.planflow.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pallets")
public class Pallet {
	@Id
	private Long palletid;
	
	private String ptype;
	   
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="location")
    private Location location;
	
	public Pallet() {
				
	}

	public Long getPalletid() {
		return palletid;
	}

	public void setPalletid(Long palletid) {
		this.palletid = palletid;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
	
}