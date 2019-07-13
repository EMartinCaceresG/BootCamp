package com.everis.model;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Parents")
public class Parents implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long parent_id;
	
	private String gender;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String other_parent_details;
	
	@ManyToOne
	private Families family_id;
	
	@ManyToMany( cascade = CascadeType.ALL)
	@JsonIgnoreProperties("parents")
	@JoinTable(name = "Student_Parents", joinColumns= {@JoinColumn(name="parent_id", referencedColumnName = "parent_id")},
	inverseJoinColumns= {@JoinColumn(name = "student_id",referencedColumnName = "student_id")})
	private Set<Students> students;

	public Parents(long parent_id, String gender, String first_name, String middle_name, String last_name,
			String other_parent_details, Families family_id, Set<Students> students) {
		super();
		this.parent_id = parent_id;
		this.gender = gender;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.other_parent_details = other_parent_details;
		this.family_id = family_id;
		this.students = students;
	}

	public Parents() {
		super();
	}

	public long getParent_id() {
		return parent_id;
	}

	public void setParent_id(long parent_id) {
		this.parent_id = parent_id;
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

	public String getOther_parent_details() {
		return other_parent_details;
	}

	public void setOther_parent_details(String other_parent_details) {
		this.other_parent_details = other_parent_details;
	}

	public Families getFamily_id() {
		return family_id;
	}

	public void setFamily_id(Families family_id) {
		this.family_id = family_id;
	}

	public Set<Students> getStudents() {
		return students;
	}

	public void setStudents(Set<Students> students) {
		this.students = students;
	}

		


}
