package structural_patterns.facade.account;

import structural_patterns.facade.debt.Debt;

public class Account {
	
	 private long id;
	 private String username;
	 private String password;
	 private Debt debt;
	 
	public Account(long id, String username, String password, Debt debt) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.debt = debt;
	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Debt getDebt() {
		return debt;
	}
	 
	
	 
	

}
