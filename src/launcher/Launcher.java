package launcher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import datamodel.Admin;
import datamodel.Courses;
import datamodel.Enrollment;
import datamodel.Students;

public class Launcher {
	public static void main(String[] args)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setUsername("aarjoo");
		admin.setPassword("pw");
		
		
		
		Enrollment enroll = new Enrollment();
		enroll.setEnrollId(123);
		enroll.setDate(sdf.parse("01/01/2023"));
		enroll.setDetails("Fall 2023");
		
		Courses course = new Courses();
		course.setCourseId(1);
		course.setCourseDuration(30);
		course.setCourseName("java app dev");
		
		Students student= new Students();
		student.

		
		List<String> courses = new ArrayList<String>();
		courses.add("java");
		courses.add("python");
		courses.add("C++");
		
		student.setCourse(courses);
		
		
		
		
		
		
	}

}
