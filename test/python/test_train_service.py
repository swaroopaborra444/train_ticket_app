import unittest
from train_service import TrainService, Ticket

class TestTrainService(unittest.TestCase):

    def test_purchase_ticket(self):
        train_service = TrainService()
        train_service.purchase_ticket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A")
        self.assertEqual(1, len(train_service.tickets))

    def test_get_receipt_details(self):
        train_service = TrainService()
        train_service.purchase_ticket("London", "France", "John", "Doe", "john.doe@example.com", 20, "A")
        self.assertEqual("john.doe@example.com", train_service.get_receipt_details("john.doe@example.com").user_email)

if __name__ == '__main__':
    unittest.main()
