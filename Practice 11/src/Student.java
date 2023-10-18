public class Student implements Comparable<Student>{
    private int iDNumber;
    private String name;
    private int GPA;

    public Student(int iDNumber, String name, int GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student: idNumber = " + iDNumber + ", name = " + name + ", GPA = " + GPA;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        if (this.iDNumber == anotherStudent.iDNumber){
            return 0;
        }
        else if (this.iDNumber < anotherStudent.iDNumber) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
