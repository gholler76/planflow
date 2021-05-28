package com.holler.planflow.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="gates")
public class Dock {
	@Id
	private String dock;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stortype")
    private Storagetype storagetype;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="group")
	private Group group;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="locstat")
	private Locstat locstat;
	
	
	
}
