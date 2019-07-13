package com.everis.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Families")
public class Families implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long family_id;
	
	private String family_name;

	public Families(long family_id, String family_name) {
		super();
		this.family_id = family_id;
		this.family_name = family_name;
	}

	public Families() {
		super();
	}

	public long getFamily_id() {
		return family_id;
	}

	public void setFamily_id(long family_id) {
		this.family_id = family_id;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	

	

	
	
	
}
