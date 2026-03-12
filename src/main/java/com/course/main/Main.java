package com.course.main;

import com.course.model.Course;
import com.course.model.Student;
import com.course.service.CourseService;

public class Main {

    public static void main(String[] args) {

        CourseService service = new CourseService();

        service.addCourse(new Course(1, "Java", 2));
        service.addCourse(new Course(2, "DSA", 1));

        try {

            Student s1 = new Student(101, "Prabhjot Singh");
            Student s2 = new Student(102, "Yaksh Choudhary");

            service.enrollStudent(1, s1);
            service.enrollStudent(1, s2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        service.viewCourses();
    }
}