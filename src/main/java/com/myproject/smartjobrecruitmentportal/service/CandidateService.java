package com.myproject.smartjobrecruitmentportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.smartjobrecruitmentportal.model.Candidate;
import com.myproject.smartjobrecruitmentportal.repository.CandidateRepo;

@Service
public class CandidateService {

	@Autowired
	CandidateRepo candidateRepo;
	
		public Candidate createCandidate(Candidate c){
		
		return candidateRepo.save(c);
		 
	}
	
}
