package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        LocalDate startDate = LocalDate.of(2025,5,17);

        LocalDate today = LocalDate.now();

        double daysBetween = ChronoUnit.DAYS.between(startDate, today);

        double weeksBetween = daysBetween / 7.0;

        System.out.println("Antal dagar: " + daysBetween);
        System.out.println("Antal hela veckor: " + weeksBetween);
    }
}
