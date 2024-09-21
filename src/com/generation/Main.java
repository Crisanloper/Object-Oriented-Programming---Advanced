package com.generation;

import com.generation.classes.Student;
import com.generation.classes.StudentService;
import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
        studentService.addStudent(new Student("Carlos", "1030", 31 ));
        studentService.addStudent(new Student( "Ian", "1040", 28 ) );
        studentService.addStudent(new Student( "Elise", "1050", 26 ) );
     	studentService.addStudent(new Student( "Santiago", "1020", 33 ) );

        try {
			studentService.enrollStudents( "Math01", "1030" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
		System.out.println(e.getMessage());
		}
        try {
			studentService.enrollStudents( "Math01", "1020" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}//catch
        try {
			studentService.enrollStudents( "History", "1040" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}//catch
        try {
			studentService.enrollStudents( "History", "1050" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}//catch

        studentService.showAllCourses();
        studentService.showEnrolledStudents("Math01");
        studentService.showEnrolledStudents("History");
    }//main
}//classMain