package One_To_Many_Has_A_Relationship.Task02;

import java.util.ArrayList;
import java.util.Scanner;

public class College {

    ArrayList<Student> students;
    ArrayList<Course> courses;


    // enroll the course
    public void enrollCourse(Scanner ip, College college){

        college.courses = new ArrayList<>();

        System.out.print("Enter the Course Name : ");
        String courseName = ip.nextLine();
        System.out.print("Enter the Professor Name : ");
        String professorName = ip.nextLine();
        college.courses.add(new Course(courseName,professorName));

        System.out.print("\nDo you want to allot one more course to the Student (Y/N) : ");
        String yesNo = ip.nextLine();

        if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y'){
            enrollCourse(ip,college);
        }

    }

    // cancel the course
    public void cancelCourse(Scanner ip , College college){

        System.out.println("\nWhich Course do you want to cancel : ");
        System.out.print("Enter Course Name : ");
        String courseName = ip.nextLine();

        Course demo = null;
        for (Course elem : courses){
            if (elem.getCourseName().equalsIgnoreCase(courseName)){
                demo = elem;
            }
        }
        college.courses.remove(demo);
    }

}