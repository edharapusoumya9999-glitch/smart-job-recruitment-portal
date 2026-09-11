package com.myproject.smartjobrecruitmentportal.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.smartjobrecruitmentportal.model.Candidate;
import com.myproject.smartjobrecruitmentportal.repository.CandidateRepo;
import com.myproject.smartjobrecruitmentportal.service.CandidateService;

@RestController
@RequestMapping("api/v1")
public class CandidateController {

	
	@Autowired
	CandidateService candidateService;
	
	@Autowired
	CandidateRepo candidateRepo;

	private Integer cid;
	
	@GetMapping("hello")
	String hello() {
		return "Spring boot is very simple";
	}
	
		//http://localhost:6666/api/v1/create
		@PostMapping("create")
		Candidate createCandidate(@RequestBody Candidate c){
			return candidateService.createCandidate(c);
	}
		@GetMapping("getCandlist")
		List<Candidate> getCandidateData(){
			return candidateRepo.findAll();
		}
		
		@GetMapping("getCand/{cid}")
		Candidate getCandidateData(@PathVariable("cid") Integer cid){
			return candidateRepo.findById(cid).orElseThrow();
		}
		
		@PutMapping("updateCand/{cid}")
		Candidate updateCandidate(@RequestBody Candidate c, @PathVariable("cid") Integer cid) {
			Candidate candidateFrmDB = candidateRepo.findById(cid).orElseThrow();
			
			candidateFrmDB.setEmail(c.getEmail());
			candidateFrmDB.setPhone(c.getPhone());
			candidateFrmDB.setSkills(c.getSkills());
			candidateFrmDB.setExperience(c.getExperience());
			candidateFrmDB.setQualification(c.getQualification());
			
			return candidateRepo.save(candidateFrmDB);
			
		}
		
		@DeleteMapping("dltcan/{cid}")
		void deleteCandidate(@PathVariable("cid") Integer cid) {
			candidateRepo.deleteById(cid);
			
		}
}
