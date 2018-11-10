package entities;

public class SavingsAccount extends Account2 {
	
	private Double interestRate;
	
	public SavingsAccount(){
		super();
	}

	public SavingsAccount(int number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
    public void updateBalance() {
    	balance += balance * interestRate;
    }
}
