package kosa.bank;

public class Account {
	private String id;
	private long balance;
	
	public Account() {}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	
	public boolean deposit(long amount) {
		balance=balance+amount;
		return true;
	}
	
	public boolean withdraw(long amount) {
		if (balance>amount) {
			balance=balance-amount;
			return true;
		}
		return false;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	
	
}
