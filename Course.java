package One_To_Many_Has_A_Relationship.Task02;

import java.util.Objects;

public class Course {

    private String courseName;
    private String professorName;

    // getter() and setter()
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessorName() {
        return professorName;
    }
    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    // constructor to initialize the attributes
    Course(String courseName , String professorName){
        setCourseName(courseName);
        setProfessorName(professorName);
    }

    // overridden toString()
    @Override
    public String toString() {
        return "courseName = '" + courseName + '\'' +
                ", professorName = '" + professorName + '\'' ;
    }

    // overridden equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) && Objects.equals(professorName, course.professorName);
    }

    // overridden hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(courseName, professorName);
    }
}
