import engeto.ja.lesson02.hotel.Booking;
import engeto.ja.lesson02.hotel.Guest;
import engeto.ja.lesson02.hotel.Room;

import java.awt.print.Book;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest(
                "Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest(
                "Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(guest1);
        System.out.println(guest2);
        System.out.println();

        Room room1 = new Room(
                1, 1,
                true, true, BigDecimal.valueOf(1000));
        Room room2 = new Room(
                2, 1,
                true, true, BigDecimal.valueOf(1000));
        Room room3 = new Room(
                3, 3, false, true, BigDecimal.valueOf(2400));
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);

        Booking booking1 = new Booking(
                guest1, room1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), false);
        Booking booking2 = new Booking(
                guest1, room3, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), true);
        booking2.addGuest(guest2);
        System.out.println(booking1);
        System.out.println(booking2);
    }
}