package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Issues;

@Repository
public interface BugTrackerRepository extends JpaRepository<Issues, Integer> {

}
