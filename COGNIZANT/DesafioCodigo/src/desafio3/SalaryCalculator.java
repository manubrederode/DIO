package desafio3;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Entrada de dados do usuário
        int hoursWorked = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();


        // Utilizando o Factory Method para criar um objeto Employee
        Employee employee = EmployeeFactory.createEmployee(hoursWorked, hourlyRate);
        
        // Calculando o salário e exibindo o resultado
        double salary = employee.calculateSalary();
        System.out.printf("Salario total: %.1f%n", salary);
    }

}
