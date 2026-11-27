package freeStud.employee;

public class Main {
    static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Kim", 3000000, 500000),
                new ContractEmployee("Lee", 160, 15000)
        };

        for (Employee employee : employees) {
            System.out.println(
                    employee.getEmployeeName() + ": " +
                            employee.calculateSalary()
            );
        }
    }
}
