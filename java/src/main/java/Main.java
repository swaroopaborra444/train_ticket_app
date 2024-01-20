package Main.java;
import java.util.List;
import.java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        TrainService trainService = new TrainService();

        trainService.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A");
        trainService.purchaseTicket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20, "B");

        System.out.println(trainService.getReceiptDetails("john.doe@example.com"));

        List<String> usersInSectionA = trainService.getUsersBySection("A");
        System.out.println("Users in Section A:");
        for (String user : usersInSectionA) {
            System.out.println(user);
        }

        trainService.removeUser("john.doe@example.com");
        trainService.modifyUserSeat("jane.doe@example.com", "A12");

        List<String> usersInSectionB = trainService.getUsersBySection("B");
        System.out.println("Users in Section B after modifications:");
        for (String user : usersInSectionB) {
            System.out.println(user);
        }
    }
}
