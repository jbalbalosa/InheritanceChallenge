package PACKAGE_NAME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getAge(){

        //Declaring the format type
        DateTimeFormatter dformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate bdate = LocalDate.parse(this.birthDate,dformat);

        //Extracting the numeric value
        int year = bdate.getYear();
        int month  = bdate.getMonthValue();
        int day = bdate.getDayOfMonth();

        //Get the current date
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year,month,day);

        //Get the year difference
        return Period.between(birthDate,currentDate).getYears();
    }

    public double collectPay(){
        return 0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("Employee had terminated " + this.endDate);
    }
}

