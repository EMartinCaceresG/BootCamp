package com.everis.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Family_Members")
public class FamilyMembers implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long family_member_id;
	
	@ManyToOne
	private Families family_id;
	
	@ManyToOne
	private Parents parent_id;
	
	@ManyToOne	
	private Students student_id;
	
	private String parent_or_student_member;

	public FamilyMembers(long family_member_id, Families family_id, Parents parent_id, Students student_id,
			String parent_or_student_member) {
		super();
		this.family_member_id = family_member_id;
		this.family_id = family_id;
		this.parent_id = parent_id;
		this.student_id = student_id;
		this.parent_or_student_member = parent_or_student_member;
	}

	public FamilyMembers() {
		super();
	}

	public long getFamily_member_id() {
		return family_member_id;
	}

	public void setFamily_member_id(long family_member_id) {
		this.family_member_id = family_member_id;
	}

	public Families getFamily_id() {
		return family_id;
	}

	public void setFamily_id(Families family_id) {
		this.family_id = family_id;
	}

	public Parents getParent_id() {
		return parent_id;
	}

	public void setParent_id(Parents parent_id) {
		this.parent_id = parent_id;
	}

	public Students getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Students student_id) {
		this.student_id = student_id;
	}

	public String getParent_or_student_member() {
		return parent_or_student_member;
	}

	public void setParent_or_student_member(String parent_or_student_member) {
		this.parent_or_student_member = parent_or_student_member;
	}

	

	

	
	
}
