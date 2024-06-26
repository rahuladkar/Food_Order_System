package One_To_Many_Has_A_Relationship.Task02;

import java.util.Comparator;

public class Sort_By_ID_Comparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getID() - o2.getID();
    }
}
