# train_ticket_app/python/main.py
from train_service import TrainService

if __name__ == "__main__":
    train_service = TrainService()

    # Example usage:
    train_service.purchase_ticket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A")
    train_service.purchase_ticket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20, "B")

    print(train_service.get_receipt_details("john.doe@example.com"))
    print(train_service.get_users_by_section("A"))

    train_service.remove_user("john.doe@example.com")
    train_service.modify_user_seat("jane.doe@example.com", "A12")

