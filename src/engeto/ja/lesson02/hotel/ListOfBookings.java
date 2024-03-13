package engeto.ja.lesson02.hotel;

import java.sql.SQLOutput;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> allBookings;

    public ListOfBookings() {
        this.allBookings = new ArrayList<>();
    }

    public List<Booking> getAllBookings() {
        return allBookings;
    }

    public void setAllBookings(List<Booking> allBookings) {
        this.allBookings = allBookings;
    }

    public void addBooking(Booking booking) {
        allBookings.add(booking);

    }

    public void printAllBookings() {
        for (Booking booking : allBookings) {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d. M. yyyy");
            System.out.println("Reservation for :" + booking.getGuest().getName() + " " +
                    booking.getGuest().getSurname());
            System.out.println("Room number " + booking.getRoom().getRoomNumber());
            System.out.println("From: " + booking.getStartOfReservation().format(dateFormatter));
            System.out.println("To: " + booking.getEndOfReservation().format(dateFormatter));
            List<Guest> otherGuests = booking.getOtherGuests();
            if (otherGuests != null && !otherGuests.isEmpty()) {
                System.out.println("Other guest: " + otherGuests.getFirst().getName() + " " +
                        otherGuests.getFirst().getSurname());
            }
            else System.out.println("No other guests");
            System.out.println();
        }
    }
}
