package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
//	List<Courses> list;
//	public CourseServiceImpl()
//	{
//		list=new ArrayList<>();
//		list.add(new Courses(145,"Java Core Course","this course contains basic of java"));
//		list.add(new Courses(4343,"test","data"));
//	}
//	
	public List<Courses> getCourses()
	{
//		return list;
		return courseDao.findAll();
	}

	@Override
	public Courses getCourses(long courseId) {
		// TODO Auto-generated method stub
//		Courses c=null;
//		for(Courses course:list)
//		{
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return courseDao.getOne(courseId);
	}

	@Override
	public Courses addcourse(Courses course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public void deletecourse(long course) {
//		for(Courses i:list)
//		{
//			if(i.getId()==course) {
//				
//				
//				list.remove(i);
//				break;
//			}
//		}
//		list=this.list.stream().filter(e->e.getId()!=course).collect(Collectors.toList());
	Courses entity=courseDao.getOne(course);
	courseDao.delete(entity);
	}
	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

}
