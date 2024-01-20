import java.util.ArrayList;
import java.util.List;

public class TrainService {
    private List<Ticket> tickets = new ArrayList<>();

    public void purchaseTicket(String from, String to, String userFirstName, String userLastName,
                                String userEmail, int price, String section) {
        Ticket ticket = new Ticket(from, to, userFirstName, userLastName, userEmail, price, section);
        tickets.add(ticket);
    }

    public Ticket getReceiptDetails(String userEmail) {
        for (Ticket ticket : tickets) {
            if (ticket.getUserEmail().equals(userEmail)) {
                return tickets;
            }
        }
        return null; // User not found
    }

    public List<String> getUsersBySection(String section) {
        List<String> userSeats = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.getSection().equals(section)) {
                userSeats.add(ticket.getUserFirstName() + " " + ticket.getUserLastName() + " - " + ticket.getSeat());
            }
        }
        return userSeats;
    }

    public void removeUser(String userEmail) {
        tickets.removeIf(ticket -> ticket.getUserEmail().equals(userEmail));
    }

    public void modifyUserSeat(String userEmail, String newSeat) {
        for (Ticket ticket : tickets) {
            if (ticket.getUserEmail().equals(userEmail)) {
                ticket.setSeat(newSeat);
                break;
            }
        }
    }
    public List<Ticket> getTickets() {
        return tickets;
    }
}
