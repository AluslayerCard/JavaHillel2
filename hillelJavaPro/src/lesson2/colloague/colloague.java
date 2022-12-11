package lesson2.colloague;

public class colloague {

    private final int age;
    private final String PIB;
    private final String job;
    private final String email;
    private final long number;

    public colloague(String PIB, String job, String email, int number, int age) {
        this.PIB = PIB;
        this.job = job;
        this.email = email;
        this.number = number;
        this.age = age;
        System.out.println(PIB + ' ' + job + ' ' + email + ' ' + number +' ' + age);
    }

}
