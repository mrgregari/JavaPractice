package ex23;

import javax.swing.*;

public class EmployeeView {
    private JFrame frame;
    private JTextField nameField;
    private JTextField hourlyRateField;
    private JTextField hoursWorkedField;
    private JLabel resultLabel;
    private JButton calculateButton; // Добавлено поле для кнопки

    public EmployeeView() {
        frame = new JFrame("Зарплата сотрудника");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.add(new JLabel("Имя:"));
        nameField = new JTextField(10);
        panel.add(nameField);

        panel.add(new JLabel("Почасовая ставка:"));
        hourlyRateField = new JTextField(10);
        panel.add(hourlyRateField);

        panel.add(new JLabel("Отработанные часы:"));
        hoursWorkedField = new JTextField(10);
        panel.add(hoursWorkedField);

        calculateButton = new JButton("Рассчитать");
        panel.add(calculateButton);

        resultLabel = new JLabel("");
        panel.add(resultLabel);

        frame.setVisible(true);
    }

    public String getName() {
        return nameField.getText();
    }

    public double getHourlyRate() {
        return Double.parseDouble(hourlyRateField.getText());
    }

    public int getHoursWorked() {
        return Integer.parseInt(hoursWorkedField.getText());
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    // Добавлен метод для доступа к кнопке
    public JButton getCalculateButton() {
        return calculateButton;
    }
}
