class TrainService:
    def __init__(self):
        self.tickets = []

    def purchase_ticket(self, from_location, to_location, user_first_name, user_last_name,
                        user_email, price, section):
        ticket = Ticket(from_location, to_location, user_first_name, user_last_name,
                        user_email, price, section)
        self.tickets.append(ticket)

    def get_receipt_details(self, user_email):
        for ticket in self.tickets:
            if ticket.user_email == user_email:
                return ticket
        return None  # User not found

    def get_users_by_section(self, section):
        user_seats = []
        for ticket in self.tickets:
            if ticket.section == section:
                user_seats.append(f"{ticket.user_first_name} {ticket.user_last_name} - {ticket.seat}")
        return user_seats

    def remove_user(self, user_email):
        self.tickets = [ticket for ticket in self.tickets if ticket.user_email != user_email]

    def modify_user_seat(self, user_email, new_seat):
        for ticket in self.tickets:
            if ticket.user_email == user_email:
                ticket.seat = new_seat
                break
