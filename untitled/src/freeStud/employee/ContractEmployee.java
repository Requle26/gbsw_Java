package freeStud.employee;

public class ContractEmployee extends Employee {
    private int time;
    private int hourMoney;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getHourMoney() {
        return hourMoney;
    }

    public void setHourMoney(int hourMoney) {
        this.hourMoney = hourMoney;
    }

    public ContractEmployee(String employeeName, int time, int hourMoney) {
        super(employeeName);
        this.time = time;
        this.hourMoney = hourMoney;
    }

    @Override
    public String getEmployeeName() {
        return super.getEmployeeName();
    }

    @Override
    public void setEmployeeName(String employeeName) {
        super.setEmployeeName(employeeName);
    }

    @Override
    int calculateSalary() {
        return getTime() * getHourMoney();
    }
}
