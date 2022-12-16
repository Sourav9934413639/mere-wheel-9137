package Dao;

import Model.Course;

public interface CourseDao {
	public String insertCourseDetails(Course course);
	public String updateCourseFees(Course course);
	public Course getAllCourseDetails();
}
