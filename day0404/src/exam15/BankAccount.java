package exam15;

public class BankAccount {
	private int balance; //잔액 
	
	public void deposit(int amount) { //저금을 하는 메소드 
		balance += amount;
	}
	
	public void withdraw(int amount) { //인출하는 메소드 
		if (balance > 0) {
			balance -= amount;
		} else {
			System.out.println("잔액이 없으므로 예금인출이 불가합니다.");
		}
		
	}
	public int getBalance() { //
		return balance;
	}
	
	public void printBalance() {
		System.out.println("현재잔액: "+getBalance());
	}
	
	public void addInterest() {
		balance = (int)(balance + balance*0.075);
		
	}
	
	
}
