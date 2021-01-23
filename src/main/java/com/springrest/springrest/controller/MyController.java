package com.springrest.springrest.controller;

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

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class MyController {
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home() {
	return "this is homepage";
	}
	@GetMapping("/house")
	public String house() {
	return "this is housepage";
	}
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourses(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Courses AddCourse(@RequestBody Courses course)
	{
		return this.courseService.addcourse(course);
	}
	@PutMapping("/courses")
	public Courses UpdateCourse(@RequestBody Courses course)
	{
		return this.courseService.updateCourse(course);
	}
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
		 try {this.courseService.deletecourse(Long.parseLong(courseId));
		 return new ResponseEntity<>(HttpStatus.OK);
		 }
		 catch (Exception e)
		 {
			 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			 
		 }
	}

}
