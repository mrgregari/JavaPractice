import java.util.Comparator;

public class StudentComparator implements Comparator {

    public int compare(Object student1, Object student2) {
        if (((Student)student1).getGPA() == ((Student)student2).getGPA()){
            return 0;
        } else if (((Student)student1).getGPA() < ((Student)student2).getGPA()) {
            return 1;
        } else {
            return -1;
        }
    }
}
