class HotelBooking {
    private String guestName;
    private String roomType;
    private String choice;

    HotelBooking() {
        this.guestName = "Guest007";
        this.roomType = "Super Deluxe";
        this.choice = "night";
    }

    HotelBooking(String guestName, String roomType, String choice) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.choice = choice;
    }

    HotelBooking(HotelBooking previousGuest) {
        this.guestName = previousGuest.guestName;
        this.roomType = previousGuest.roomType;
        this.choice = previousGuest.choice;
    }

    public void display() {
        System.out.println("Guest name is " + guestName + ", the opted room is " + roomType + " and choice is " + choice);
    }

    public static void main(String[] args) {
        System.out.println("Displaying person's requirement:");
        HotelBooking booking = new HotelBooking();
        booking.display();
    }
}
