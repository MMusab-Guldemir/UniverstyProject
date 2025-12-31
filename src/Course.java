import java.util.List;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

import java.security.PublicKey;
import java.util.ArrayList;

public class Course {
    String courseName; 
    int courseCode;
    List<Student> enrolledStudents; // kayitli oğrenciler listesi.
    int capacity;
    Instructor instructor; // dersi veren ogretmen.

    // constructor
    public Course(String courseName, int courseCode, int capacity, Instructor instructor){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.capacity = capacity;
        this.instructor = instructor;
        enrolledStudents = new ArrayList<>();
    }

    // enroll = oğrenciyi derse kaydetmek.
    public Void enroll(Student student){
        enrolledStudents.add(student);
    }

    // dersin bilgilerini ekrana yazdiran metod.
    public void displayCourseInfo(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Capacity: " + capacity);
        System.out.println("Instructor: ");
        instructor.displayInfo();
        System.out.println("Enrolled Students: ");

        
        for(Student s : enrolledStudents){
            s.displayInfo();
            System.out.println("-----");
        }
    }

    // ders dolu mu diye kontrol eden metod.
    public boolean isFull(){
        return enrolledStudents.size() >= capacity;
    }
}