
public class Account 
	{ 
		private int balance = 1000; 
		
		public int balance() 
		{ 
			return balance; 
		} 
		
		public void withdraw(int amount) throws InSufficientFundsException 
		{ 
			if (amount > balance) 
			{ 
				throw new InSufficientFundsException( String.format("Current balance %d is less than requested amount %d", balance, amount)); 
			} 
			balance = balance - amount; 
		} 
		
		public void deposit(int amount) 
		{ 
			if (amount <= 0) 
			{ 
				throw new IllegalArgumentException( String.format("Invalid deposit amount %s", amount)); 
			} 
		} 
	}
