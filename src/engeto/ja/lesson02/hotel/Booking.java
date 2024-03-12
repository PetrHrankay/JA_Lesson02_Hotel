package engeto.ja.lesson02.hotel;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;

    public Booking(Room room, Guest guest, List<Guest> otherGuests) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
    }

    public  Booking(Room room, Guest guest) {
        this(room, guest, new ArrayList<>());
    }

    // region Getters and Setters

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }
    // endregion
}
