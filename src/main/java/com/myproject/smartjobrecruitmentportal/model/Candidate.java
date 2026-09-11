package com.myproject.smartjobrecruitmentportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "candidatedetails")
@Setter
@Getter

public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer cid;
	String cname;
	String email;
	Long phone;
	String skills;
	Integer experience;
	String qualification;
}
