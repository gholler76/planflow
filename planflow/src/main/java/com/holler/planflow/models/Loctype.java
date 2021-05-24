package com.holler.planflow.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loctypes")
public class Loctype {
	@Id
	private String loctype;
	private Integer widfrom;
	private Integer widto;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stortype")
    private StorageType storagetype;
	
	public Loctype () {
		
	}
	
	public Loctype (
			String loctype,
			Integer widfrom,
			Integer widto,
			StorageType storagetype) {
		this.loctype = loctype;
		this.widfrom = widfrom;
		this.widto = widto;
		this.storagetype = storagetype;
	}
	
	

}