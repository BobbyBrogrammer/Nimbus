package org.example;

import java.time.Period;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    //-------------------How old is Nimbus?-----------------------------------
        LocalDate startDate = LocalDate.of(2025,5,17);
        LocalDate today = LocalDate.now();
        Period period = Period.between(startDate, today);

        System.out.println("Nimbus is: " +period.getYears() + " years, "
                + period.getMonths() + "months and "
                + period.getDays() + " days old.");
        System.out.println("Update");
    //------------------------------------------------------------------------
    }
}
