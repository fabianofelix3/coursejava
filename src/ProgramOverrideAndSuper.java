import entities.Account2;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramOverrideAndSuper {

	public static void main(String[] args) {
		
		Account2 acc2 = new Account2(1001, "Alex", 1000.0);
        acc2.withDraw(200.00);
        System.out.println(acc2.getBalance());
        
        Account2 acc3 = new SavingsAccount(1002, "Alex", 1000.0, 0.1);
        acc3.withDraw(200.00);
        System.out.println(acc3.getBalance());
        
        Account2 acc4 = new BusinessAccount(1003, "Alex", 1000.0,500.00);
        acc4.withDraw(200.00);
        System.out.println(acc4.getBalance());

	}
}
