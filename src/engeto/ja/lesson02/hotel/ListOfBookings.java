package engeto.ja.lesson02.hotel;

import java.util.List;

public class ListOfBookings {
    private List<Booking> allBookings;

    public ListOfBookings(List<Booking> allBookings) {
        this.allBookings = allBookings;
    }

    public List<Booking> getAllBookings() {
        return allBookings;
    }

    public void setAllBookings(List<Booking> allBookings) {
        this.allBookings = allBookings;
    }
}
