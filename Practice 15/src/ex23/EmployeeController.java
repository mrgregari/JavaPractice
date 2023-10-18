package ex23;

import ex23.Employee;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.setResult("Заработная плата: " + model.calculateSalary());
    }

    public void setEmployeeData(String name, double hourlyRate, int hoursWorked) {
        model = new Employee(name, hourlyRate, hoursWorked);
    }
}
