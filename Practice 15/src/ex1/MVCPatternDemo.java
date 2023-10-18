package ex1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        // Обновляем имя студента через контроллер
        controller.setStudentName("John");

        // Обновляем номер студента через контроллер
        controller.setStudentRollNo("101");

        // Снова выводим обновленные данные через контроллер и вид
        controller.updateView();
    }
    public static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Ivan");
        student.setRollNo("10");
        return student;
    }
}
