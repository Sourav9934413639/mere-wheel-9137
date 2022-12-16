package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Course;
import Utility.DBUtil;

public class CourseDaoImpl implements CourseDao{

	@Override
	public String insertCourseDetails(Course course) {
		String message="Not inserted..";
		try(Connection conn=DBUtil.provideConnection()){
		PreparedStatement ps=conn.prepareStatement("insert into Course values(?,?,?)");
		ps.setInt(1,course.getCourseId());
		ps.setString(2,course.getName());
		ps.setInt(3,course.getFee());
		int x=ps.executeUpdate();
		if(x>0)
		{
			message="Course Details inserted successfully";
		}
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}	
		return message;
	}

	@Override
	public String updateCourseFees(Course course) {
		String message="Fee not updated..";
		try(Connection conn=DBUtil.provideConnection()){
		PreparedStatement ps=conn.prepareStatement("update course set fee=? where courseName=?");
		ps.setString(1,course.getName());
		ps.setInt(2,course.getFee());
		int x=ps.executeUpdate();
		if(x>0)
		{
			message="Course fee of "+course.getName()+"is updated successfully as "+course.getFee();
		}
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}	
		return message;	}

	@Override
	public Course getAllCourseDetails() {
		Course course=null;
		try (Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from course");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				course=new Course();
				course.setCourseId(rs.getInt("courseId"));
				course.setName(rs.getString("courseName"));
				course.setFee(rs.getInt("fee"));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return course;
	}

	

}
