package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligibilityForCreditCard();
		System.out.println("Is Tom eligible for Credit Card? " +tom.eligibleForCreditCard);
		sarah.firstName="Sarah";
		sarah.lastName="Smith";
		sarah.age=40;
		sarah.accountBalance=30000;
		sarah.testEligibilityForCreditCard();
		System.out.println("Is Sarah eligible for Credit Card? " +sarah.eligibleForCreditCard);

	}

}
