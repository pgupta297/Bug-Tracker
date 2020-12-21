package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Issues;
import com.example.demo.repository.BugTrackerRepository;

@Service
public class BugTrackerService {
	
	@Autowired
	private BugTrackerRepository repository;
	
	//Pagination of the values in the repository
	public List<Issues> findAll(Pageable pageable){
		
		Page<Issues> pages=this.repository.findAll(pageable);
		
		return pages.getContent();
	}
	
	public Optional<Issues> findIssuesById(int id){
		
		return this.repository.findById(id);
	}
	
	public Issues saveIssue(Issues issue) {
		
		return this.repository.save(issue);
	}

}
