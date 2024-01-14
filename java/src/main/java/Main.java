public class Main {
    public static void main(String[] args) {
        TrainService trainService = new TrainService();

        // Example usage:
        trainService.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A");
        trainService.purchaseTicket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20, "B");

        System.out.println(trainService.getReceiptDetails("john.doe@example.com"));

        // View users and their seats in section A
        List<String> usersInSectionA = trainService.getUsersBySection("A");
        System.out.println("Users in Section A:");
        for (String user : usersInSectionA) {
            System.out.println(user);
        }

        // Remove John Doe from the train
        trainService.removeUser("john.doe@example.com");

        // Modify Jane Doe's seat to B12
        trainService.modifyUserSeat("jane.doe@example.com", "B12");

        // View users and their seats in section B after modifications
        List<String> usersInSectionB = trainService.getUsersBySection("B");
        System.out.println("Users in Section B after modifications:");
        for (String user : usersInSectionB) {
            System.out.println(user);
        }
    }
}
