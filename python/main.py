from train_service import TrainService

if _name_ == "_main_":
    train_service = TrainService()

    # Example usage:
    train_service.purchase_ticket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A")
    train_service.purchase_ticket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20, "B")

    print(train_service.get_receipt_details("john.doe@example.com"))

    # View users and their seats in section A
    users_in_section_a = train_service.get_users_by_section("A")
    print("Users in Section A:")
    for user in users_in_section_a:
        print(user)

    # Remove John Doe from the train
    train_service.remove_user("john.doe@example.com")

    # Modify Jane Doe's seat to B12
    train_service.modify_user_seat("jane.doe@example.com", "B12")

    # View users and their seats in section B after modifications
    users_in_section_b = train_service.get_users_by_section("B")
    print("Users in Section B after modifications:")
    for user in users_in_section_b:
        print(user)
