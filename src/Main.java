import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// write your code here

		Account a1=new Account();
		a1.setAccountNbr("111-11");
		a1.setBalance(1000);

		Account a2=new Account();
		a2.setAccountNbr("222-22");
		a2.setBalance(2000);


		Person p = new Person();
		p.setName("Victor");
		p.setpNbr("961101");

		p.addAccount(a1);
		a1.setOwner(p);

		p.addAccount(a2);
		a2.setOwner(p);

/*
        System.out.println("TEST 1:");
        System.out.println(p.getName() + " äger följande konton:");{
            for (Account tmp : p.getAccounts().values()){
                System.out.print(tmp.getAccountNbr() + " -->");
                System.out.print(" balance: " +tmp.getBalance() +" -->");
                System.out.println(" owner:" + tmp.getOwner().getName());
            }
        }



 */
		PersonRegister personRegister = new PersonRegister();
		HashMap<String,Person> personHashMap= new HashMap<>();
		personRegister.setPersonHashMap(personHashMap);
		//Test

		personRegister.addPerson(p);

		a1=new Account();
		a1.setAccountNbr("333-33");
		a1.setBalance(3300);

		a2=new Account();
		a2.setAccountNbr("4444-44");
		a2.setBalance(4400);



		p = new Person();
		p.setName("Isac");
		p.setpNbr("991010");

		p.addAccount(a1);
		a1.setOwner(p);

		p.addAccount(a2);
		a2.setOwner(p);

		personRegister.addPerson(p);
		System.out.println("TEST 2");

		for (Person tmp:personRegister.getPersonHashMap().values()) {
			System.out.println(tmp.getName() + ", pNbr:" + tmp.getpNbr());
			for (Account a: tmp.getAccounts().values()){
				System.out.print(a.getAccountNbr() + " ---> ");
				System.out.print(" balance: " + a.getBalance()+  " ---> ");
				System.out.println(" owner: " + a.getOwner().getName());

			}
			System.out.println("Total Balance: " + tmp.totBalance());
			System.out.println();
		}

		System.out.println("Test av metod findAccount i class PersonRegister, pNbr: 991010 accountNbr: 333-33");
		Account a = personRegister.findAccount("991010","333-33");
		System.out.print(a.getAccountNbr() +  " ---> ");
		System.out.print("balance: " + a.getBalance());
		System.out.println(" ---> owner: " + a.getOwner().getName());

		System.out.println();

		System.out.println("Test av metod findPerson i PersonRegister, pNbr:961101");
		Person p1 = personRegister.findPerson("961101");
		System.out.println(p1.getName() + ", pNbr: "+ p1.getpNbr());

		personRegister.removePerson("961101");
		System.out.println(personRegister.findPerson("961101"));


	}
}
