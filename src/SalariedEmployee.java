package PACKAGE_NAME;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId) {
        super(name, birthDate, endDate, employeeId);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean getIsRetired() {
        return isRetired;
    }

    public void setIsRetired(boolean isRetired) {
        this.isRetired = isRetired;
    }

    public void retire(){
        System.out.println(getName().toString() + " is " + (isRetired ? "Retired" : "Not yet retired"));
    }

//    @Override
//    public String toString() {
//        return "SalariedEmployee{" +
//                "annualSalary=" + annualSalary +
//                ", isRetired=" + isRetired +
//                "} " + super.toString();
//    }
}

