package io.anshu.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public List<Course> getAllCourses(String topicId) {
		return (List<Course>) courseRepo.findByTopicId(topicId);
	}
	
	
	public Course getCourse(String id) {
		return courseRepo.findOne(id);
	}


	public void addCourse(Course course) {
		courseRepo.save(course);		
	}


	public void updateCourse(Course course) {
		courseRepo.save(course);
		}
		


	public void deleteCourse(String id) {
		courseRepo.delete(id);
		
	}

}
