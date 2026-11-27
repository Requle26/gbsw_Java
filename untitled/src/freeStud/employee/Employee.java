package freeStud.employee;

public abstract class Employee {
    public Employee(String employeeName) {
        this.EmployeeName = employeeName;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    private String EmployeeName;
    abstract int calculateSalary();
}
