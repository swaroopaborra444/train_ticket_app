import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainServiceTest {

    @Test
    void purchaseTicket() {
        TrainService trainService = new TrainService();
        trainService.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A");
        assertEquals(1, trainService.getTickets().size());
    }

    @Test
    void getReceiptDetails() {
        TrainService trainService = new TrainService();
        trainService.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A");
        assertEquals("john.doe@example.com", trainService.getReceiptDetails("john.doe@example.com").getUserEmail());
    }
}
