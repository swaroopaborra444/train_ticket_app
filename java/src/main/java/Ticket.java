public class Ticket {
    private String from;
    private String to;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private int price;
    private String section;
    private String seat;

    public Ticket(String from, String to, String userFirstName, String userLastName,
                  String userEmail, int price, String section) {
        this.from = from;
        this.to = to;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.price = price;
        this.section = section;
        // Assume seat allocation logic here
        this.seat = allocateSeat();
    }

    private String allocateSeat() {
        // Implement logic to allocate a seat in the specified section
        return "A1"; // Placeholder, actual logic would vary
    }

    // Getters
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getPrice() {
        return price;
    }

    public String getSection() {
        return section;
    }

    public String getSeat() {
        return seat;
    }

    // Setters
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
