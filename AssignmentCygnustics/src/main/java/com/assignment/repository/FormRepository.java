package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.entity.Analysis;

@Repository
public interface FormRepository extends JpaRepository<Analysis, Integer> {

	
}
