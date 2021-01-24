package com.example.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:3000")
public class MyController {
	@GetMapping("/")
	public String home() {
	return "this is homepage";
	}
	@GetMapping("/house")
	public String house() {
	return "this is housepage";
	}
	@GetMapping("/courses")
	public byte[] getCourses(@RequestBody byte[] data)
	{
		return data;
//		return this.courseService.getCourses();
	}

}
