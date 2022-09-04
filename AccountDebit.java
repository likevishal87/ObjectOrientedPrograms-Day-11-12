import java.util.Scanner;

public class AccountDebit {
	public static void main(String[] args) {
		int amount;
		int debit;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		amount = sc.nextInt();
		System.out.println("Enter the debit");
		debit = sc.nextInt();

		Account1 obj = new Account1(amount, debit);
		obj.debit();

	}

}

class Account1 {
	int AccountBalance;
	int debit;

	public Account1(int AccountBalance, int debit) {

		this.AccountBalance = AccountBalance;
		this.debit = debit;
	}

	@Override
	public String toString() {
		return "Account1 [AccountBalance=" + AccountBalance + "]";
	}

	public int getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}

	void debit() {
		if (AccountBalance < debit) {
			System.out.println("Debit amount exceeded account balance");
		} else {
			System.out.println("Ammount debited is " + debit);
			System.out.println("Remaining balance is " + (AccountBalance - debit));
		}

	}
}
