import java.util.ArrayList;
import java.util.List;

public class TrainService {
    private List<Ticket> tickets = new ArrayList<>();

    public void purchaseTicket(String from, String to, String userFirstName, String userLastName,
                                String userEmail, int price, String section) {
        // Implement logic to create and store a new ticket
    }

    public Ticket getReceiptDetails(String userEmail) {
        // Implement logic to retrieve and return receipt details for the user
    }

    public List<String> getUsersBySection(String section) {
        // Implement logic to retrieve and return users and their seats for the specified section
    }

    public void removeUser(String userEmail) {
        // Implement logic to remove a user from the train
    }

    public void modifyUserSeat(String userEmail, String newSeat) {
        // Implement logic to modify a user's seat
    }
}
