package com.myproject.smartjobrecruitmentportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.smartjobrecruitmentportal.model.Candidate;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Integer>{

}
