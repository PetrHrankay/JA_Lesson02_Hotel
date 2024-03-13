package engeto.ja.lesson02.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private Guest guest;
    private Room room;
    private LocalDate startOfReservation;
    LocalDate endOfReservation;
    private List<Guest> otherGuests;
    private boolean isVacationStay;

    public Booking(Guest guest, Room room, LocalDate startOfReservation, LocalDate endOfReservation, List<Guest> otherGuests, boolean isVacationStay) {
        this.guest = guest;
        this.room = room;
        this.startOfReservation = startOfReservation;
        this.endOfReservation = endOfReservation;
        this.otherGuests = otherGuests;
        this.isVacationStay = isVacationStay;
    }

    public Booking(Guest guest, Room room, LocalDate startOfReservation, LocalDate endOfReservation, boolean isVacationStay) {
        this.guest = guest;
        this.room = room;
        this.startOfReservation = startOfReservation;
        this.endOfReservation = endOfReservation;
        this.otherGuests = new ArrayList<>();
        this.isVacationStay = isVacationStay;
    }

    // region Getters and Setters

    public void addGuest(Guest guest) {
        if (otherGuests == null) {
            otherGuests = new ArrayList<>();
        }
        otherGuests.add(guest);
    }


    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartOfReservation() {
        return startOfReservation;
    }

    public void setStartOfReservation(LocalDate startOfReservation) {
        this.startOfReservation = startOfReservation;
    }

    public LocalDate getEndOfReservation() {
        return endOfReservation;
    }

    public void setEndOfReservation(LocalDate endOfReservation) {
        this.endOfReservation = endOfReservation;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public boolean isVacationStay() {
        return isVacationStay;
    }

    public void setVacationStay(boolean vacationStay) {
        isVacationStay = vacationStay;
    }




    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d. M. yyyy");
        return guest + "--> " + room + " " + "---" + "From: " + startOfReservation.format(dateFormatter) + "   To: " +
                endOfReservation.format(dateFormatter) + "---";
    }
}