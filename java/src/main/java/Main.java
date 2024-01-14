public class Main {
    public static void main(String[] args) {
        TrainService trainService = new TrainService();

        // Example usage:
        trainService.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A");
        trainService.purchaseTicket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20, "B");

        System.out.println(trainService.getReceiptDetails("john.doe@example.com"));
        System.out.println(trainService.getUsersBySection("A"));

        trainService.removeUser("john.doe@example.com");
        trainService.modifyUserSeat("jane.doe@example.com", "A12");
    }
}
