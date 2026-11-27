package freeStud.employee;

public class FullTimeEmployee extends Employee {
    private int defaultMoney;
    private int bonusMoney;

    public FullTimeEmployee(String EmployeeName, int defaultMoney, int bounsMoney) {
        super(EmployeeName);
        this.defaultMoney = defaultMoney;
        this.bonusMoney = bounsMoney;
    }

    public int getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(int bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public int getDefaultMoney() {
        return defaultMoney;
    }

    public void setDefaultMoney(int defaultMoney) {
        this.defaultMoney = defaultMoney;
    }

    public FullTimeEmployee(String employeeName) {
        super(employeeName);
    }

    @Override
    int calculateSalary() {
        return getDefaultMoney() + getBonusMoney();
    }

    @Override
    public String getEmployeeName() {
        return super.getEmployeeName();
    }

    @Override
    public void setEmployeeName(String employeeName) {
        super.setEmployeeName(employeeName);
    }
}
