package application;

public class ATMClient {
	private String accNum;
	private String pin;
	private double balance = 0.0;
	private String[] history = new String[5];
	int i = 0;

	public ATMClient(String accNum, String pin, double balance) {

		this.accNum = accNum;
		this.pin = pin;
		this.balance = balance;
	}

	public double getBalance() {

	
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public double deposit(double amount) {
		balance += amount;
		if (i > 4) {
			i = 4;
			for (int j = 0; j < 4; j++)
				history[j] = history[j + 1];

		}
		history[i] = "DEPOSIT: "+ String.valueOf(amount);
		i++;
		
		return balance;
	}

	public double withdraw(double amount) {
		
		balance -= amount;
		if (i > 4) {
			i = 4;
			for (int j = 0; j < 4; j++)
				history[j] = history[j + 1];

		}
		history[i] = "WITHDRAW: "+ String.valueOf(amount);
		i++;
		
		return balance;
	}

	public boolean check(String number, String password) {
		if (number.equals(accNum) && password.equals(pin))
			return true;
		return false;

	}

	
	
	
	
	public String next() {
		if(i>4)
		{
			Alert.displayAlert("Sorry, There is no Next transaction");
			i--;
		}
	
		return history[i++];
	}
	
	public String previous() {
		
		if(i<=0)
		{
			Alert.displayAlert("Sorry, There is no previous transaction");
			i++;
		}
		return history[--i];
	}
	

	

}
