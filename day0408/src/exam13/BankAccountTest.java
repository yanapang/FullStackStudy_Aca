package exam13;

//사용자 예외선언 
class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String msg) {
		super(msg);
	}
}

class BankAccount {
	private int balance;
	//method
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount+"를 저금하여 잔액이 "+balance+"가 되었습니다.");
	}
	public void withdraw(int amount) throws NegativeBalanceException{
		//오류 처리
		if (amount > balance) {
			throw new NegativeBalanceException("잔액이 부족합니다.");
		}
		balance -= amount;
		System.out.println(amount+"를 출금하여 잔액이 "+balance+"가 되었습니다.");
	}
	
}

public class BankAccountTest {

	public static void main(String[] args) {
		try {
			BankAccount kim = new BankAccount();
			kim.deposit(3000);
			kim.deposit(200000);
			kim.withdraw(20000);
			kim.withdraw(200000);
			
		} catch(NegativeBalanceException e){
			System.out.println("예외발생: "+e.getMessage());
		}
	}

}
