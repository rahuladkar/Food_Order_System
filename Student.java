package One_To_Many_Has_A_Relationship.Task02;

import java.util.ArrayList;

public class Student {
    private String name;
    private int ID;
    private ArrayList<Course> courses;

    // getter() and setter()
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    // default constructor
    Student(){}

    // constructor to initialize the attributes
    Student(String name , int ID , ArrayList<Course> courses){
        setName(name);
        setID(ID);
        setCourses(courses);
    }

    // overridden toString()


    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", ID = " + ID +
                ", course = " + courses ;
    }
}
