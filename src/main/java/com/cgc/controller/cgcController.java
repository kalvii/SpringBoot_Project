package com.cgc.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cgc.dao.CrudRepos;
import com.cgc.records.students;

import jakarta.persistence.Id;

@RestController
public class cgcController {
	
	@Autowired
	private CrudRepos repos;
	
	@PostMapping("/addStudent")
	
	public students addStudentdata(@RequestBody students newstudent)
	{
		students s1=new students();
		s1.setSname(newstudent.getSname());
		s1.setBranch(newstudent.getBranch());
		s1.setSemail(newstudent.getSemail());
		s1.setSmob(newstudent.getSmob());
		repos.save(s1);
		
		
		return s1;
	}
	
	@GetMapping("/views")
	public @ResponseBody Iterable<students> getstudent()
	{
		return repos.findAll();
	}
	
	@GetMapping("/view/{id}")
	
	public Optional<students> getStudentbyId(@PathVariable Integer id)
	{
		return repos.findById(id);
	}
	
	@DeleteMapping("/deletes")
	public String deletedata()
	{
		repos.deleteAll();
		return "Succesfully deleted";
	}
	@DeleteMapping("/deletebyid/{id}")
	public void deletedatabyid(@PathVariable Integer id)
	{
		repos.deleteById(id);
	}
	
	
	
	

}
