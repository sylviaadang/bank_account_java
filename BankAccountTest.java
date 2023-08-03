public class BankAccountTest {
	public static void main(String[] args) {

	BankAccount user1 = new BankAccount();
	BankAccount user2 = new BankAccount();
	user1.deposit("Savings", 30.00);
	user2.deposit("checking", 800.00);
	user1.withdraw("Checking", 3000.00);
	user2.withdraw("checking", 300.00);
	user2.getBalance();
	user1.getBalance();
	}
}
