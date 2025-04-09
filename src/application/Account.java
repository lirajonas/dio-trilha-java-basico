package application;

public class Account {

	private int number;
	private String agency;
	private String holder;
	private double balance;
	
	public Account(int number, String agency, String holder, double balance) {
		this.number = number;
		this.agency = agency;
		this.holder = holder;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getAgency() {
		return agency;
	}

	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Olá, "
				+ holder
				+ ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agency
				+ ", conta "
				+ number
				+ " e o seu saldo R$ "
				+ balance
				+ " já está disponível para saque.";
	}
	
}
