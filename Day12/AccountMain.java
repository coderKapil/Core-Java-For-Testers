package Day12;

public class AccountMain {

	public static void main(String[] args) {
	
	Account a1 = new Account();
	
	a1.setAccno(101);
	System.out.println(a1.getAccno());

	a1.setName("Mohan");
	System.out.println(a1.getName());
	
	a1.setAmount(14000);
	System.out.println(a1.getAmount());
	}

}
