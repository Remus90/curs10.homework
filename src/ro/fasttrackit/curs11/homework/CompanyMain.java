package ro.fasttrackit.curs11.homework;

import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company(
                "Fasttrackit",
                List.of(new Person("Florin", 40, "manager")));
        new Person("Ana", 25, "hr");
        new Person("Darius", 25, "trainer");
    }

}
