public class Main {
    public static void main(String[] args) {
        System.out.println("OOP - Inheritance Challenge!");

        SalariedEmployee seJeff = new SalariedEmployee("Jeff","1979-07-24",
                "2024-09-04",901058);

        HourlyEmployee heJing = new HourlyEmployee("Jing","1980-05-22",
                "2024-09-04",910227);

        System.out.println("Salaried Employee");
//        System.out.println(seJeff.toString());
        System.out.println(seJeff.getName() + "'s age is " + seJeff.getAge());
        System.out.println(seJeff.getName() + "'s pay is " + seJeff.collectPay());
        seJeff.setIsRetired(false);
        seJeff.retire();

        System.out.println("\nHourly Employee");
        System.out.println(heJing.getName() + "'s age is " + heJing.getAge());
        System.out.println(heJing.getName() + "'s pay is " + seJeff.collectPay());
        heJing.getDoublePay();
    }

}
