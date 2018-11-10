import entities.Account2;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramUpDowCasting {

	public static void main(String[] args) {

		Account2 acc = new Account2(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

		// UPCASTING

		Account2 acc1 = bacc;
		Account2 acc3 = new BusinessAccount(1003, "João", 0.0, 200.00);
		Account2 acc4 = new SavingsAccount(1004, "Bob", 0.0, 0.1);

		// DOWNCASTING

		BusinessAccount bacc1 = (BusinessAccount) acc3;
		bacc1.loan(100.00);

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(100.00);
			System.out.println("Loan!");
		}
		if (acc4 instanceof SavingsAccount) {
			SavingsAccount acc6 = (SavingsAccount) acc4;
			acc6.updateBalance();
			System.out.println("Update Balance!");
		}
	}
}
