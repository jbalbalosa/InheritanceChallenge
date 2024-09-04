package PACKAGE_NAME;

public class Employee extends Worker {

    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeId) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
    }

    public Employee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
