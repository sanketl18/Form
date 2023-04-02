package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.entity.Analysis;
import com.assignment.repository.FormRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1")
public class FormController {

	@Autowired
	FormRepository formRepository;
	
	@PostMapping("/create")
	public Analysis createAnalysis(
			@RequestBody Analysis analysis) {
		
		return formRepository.save(analysis);		
	}
	
	@GetMapping("/get")
	public List<Analysis> getAnalysis() {
		
		return formRepository.findAll();		
	}
	

}
