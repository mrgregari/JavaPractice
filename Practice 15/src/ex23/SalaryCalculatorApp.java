package ex23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryCalculatorApp {
    public static void main(String[] args) {
        Employee model = new Employee("", 0.0, 0);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        view.setResult("Введите данные о сотруднике и нажмите 'Рассчитать'");

        view.getCalculateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getName();
                double hourlyRate = view.getHourlyRate();
                int hoursWorked = view.getHoursWorked();

                controller.setEmployeeData(name, hourlyRate, hoursWorked);
                controller.updateView();
            }
        });
    }
}
