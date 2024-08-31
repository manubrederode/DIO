package desafio3;

public class Employee {

    private int hoursWorked;
    private double hourlyRate;

    public Employee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

}
