package oops;

class BankAccount {

	String accountno;
	double balance;

	BankAccount(String accountno,double balance)
	{
		this.accountno = accountno;
		this.balance = balance;
	}

	void deposit(double amount) {

		if (amount > 0) {
			balance += amount;
			System.out.println("deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount");
		}

	}

	void withdraw(double amount) {
		
		if(amount>0 && amount <= balance) {
			balance -=amount;
			System.out.println("Withdrawn: "+ amount);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}

	double getbalance() {
		return balance;
	}
}

class SavingsAccount extends BankAccount {

	double interestrate;

	SavingsAccount(String accountno, double balance, double intrestrate) {
		super(accountno, balance);
		this.interestrate = intrestrate;

	}
	void addintrestrate(){
		 
		double interest = balance*(interestrate/100);
		balance += interest;
		System.out.println("intrest added"+ interest);
		
		
	}

}

class SalaryAccount extends BankAccount {

	double monthlySalary;

	SalaryAccount(String accountno, double balance, double monthlySalary) {

		super(accountno, balance);
		this.monthlySalary = monthlySalary;

	}

	void creditSalary() {

		balance += monthlySalary;
		System.out.println("Salary Credited: " + monthlySalary);
	}

}

public class manager {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("AK002",8000,87);
		sa.deposit(1000);
		sa.addintrestrate();
		sa.withdraw(2000);
		System.out.println("your account balance: "+ sa.getbalance());
		
		SalaryAccount sa1 = new SalaryAccount("AK003",8322,32422);
		sa1.creditSalary();
		sa1.withdraw(2000);
		System.out.println("salary acc balance: " + sa1.getbalance());

	}

}
