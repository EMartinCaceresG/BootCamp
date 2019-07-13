package com.everis.model;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "Students")
public class Students implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long student_id;
		
	private String gender;
	private String first_name;
	private String middle_name;
	private String last_name;
	private Date date_of_birth;
	private String other_parent_details;
	
	@ManyToMany(mappedBy = "students",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("students")
	private Set<Parents> parents;

	public Students(long student_id, String gender, String first_name, String middle_name, String last_name,
			Date date_of_birth, String other_parent_details, Set<Parents> parents) {
		super();
		this.student_id = student_id;
		this.gender = gender;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.other_parent_details = other_parent_details;
		this.parents = parents;
	}

	public Students() {
		super();
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getOther_parent_details() {
		return other_parent_details;
	}

	public void setOther_parent_details(String other_parent_details) {
		this.other_parent_details = other_parent_details;
	}

	public Set<Parents> getParents() {
		return parents;
	}

	public void setParents(Set<Parents> parents) {
		this.parents = parents;
	}
		
	
	
}
