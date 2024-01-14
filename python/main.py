from train_service import TrainService

if _name_ == "_main_":
    train_service = TrainService()

    train_service.purchase_ticket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A")
    train_service.purchase_ticket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20, "B")

    print(train_service.get_receipt_details("john.doe@example.com"))

    users_in_section_a = train_service.get_users_by_section("A")
    print("Users in Section A:")
    for user in users_in_section_a:
        print(user)

    train_service.remove_user("john.doe@example.com")
    train_service.modify_user_seat("jane.doe@example.com", "A12")

    users_in_section_b = train_service
