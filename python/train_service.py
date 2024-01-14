# train_ticket_app/python/train_service.py
class TrainService:
    def __init__(self):
        self.tickets = []

    def purchase_ticket(self, from_location, to_location, user_first_name, user_last_name,
                        user_email, price, section):
        # Implement logic to create and store a new ticket

    def get_receipt_details(self, user_email):
        # Implement logic to retrieve and return receipt details for the user

    def get_users_by_section(self, section):
        # Implement logic to retrieve and return users and their seats for the specified section

    def remove_user(self, user_email):
        # Implement logic to remove a user from the train

    def modify_user_seat(self, user_email, new_seat):
        # Implement logic to modify a user's seat

