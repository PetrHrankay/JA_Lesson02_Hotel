import engeto.ja.lesson02.hotel.Guest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest(
                "Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest(
                "Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        System.out.println(guest1);
        System.out.println(guest2);

    }
}