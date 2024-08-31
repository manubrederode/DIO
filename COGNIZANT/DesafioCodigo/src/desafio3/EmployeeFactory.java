package desafio3;

public class EmployeeFactory {

    public static Employee createEmployee(int hoursWorked, double hourlyRate) {
        return new Employee(hoursWorked, hourlyRate);
    }

}
