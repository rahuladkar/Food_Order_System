package One_To_Many_Has_A_Relationship.Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentDriver {

    public static void main(String[] args) {

        College college = new College();
        Scanner ip = new Scanner(System.in);
        college.students = new ArrayList<>();

        System.out.println("\n====================== Student Enroll Courses Recorder ====================== \n");

        while (true){

            // Student details taken by user
            System.out.print("Enter the Student Name : ");
            String name = ip.nextLine();
            System.out.print("Enter the Student ID : ");
            int id = ip.nextInt();
            ip.nextLine();

            System.out.print("\nNow Enter the Courses Enroll by " + name + "...!\n");

            // course details taken by user
            college.enrollCourse(ip,college);

            // student details stored inside students arraylist
            college.students.add(new Student(name,id,college.courses));

            System.out.print("\nDo you want add one more Student (Y/N) : ");
            String yesNo = ip.nextLine();

            if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y'){
                continue;
            } else if (yesNo.charAt(0) == 'N' || yesNo.charAt(0) == 'n') {
                break;
            }else {
                System.out.println("Wrong Input...!");
            }

        }// end of while

        System.out.println("Following are the all Student details : ");
        Collections.sort(college.students, new Sort_By_ID_Comparator());

        for (Student elem : college.students){
            System.out.println(elem);
        }

        while (true){
            System.out.println("\nDo you want to remove the courses");
            String yesNo = ip.nextLine();

            if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y'){
                college.cancelCourse(ip,college);
            } else if (yesNo.charAt(0) == 'N' || yesNo.charAt(0) == 'n') {
                break;
            } else {
                System.out.println("Wrong Input...!");
            }
        }
    }

}
