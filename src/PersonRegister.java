import java.util.HashMap;

public class PersonRegister {
	private HashMap<String, Person> personHashMap;

	public HashMap<String, Person> getPersonHashMap() {
		return personHashMap;
	}

	public void setPersonHashMap(HashMap<String, Person> personHashMap) {
		this.personHashMap = personHashMap;
	}

	public void addPerson(Person person){
		personHashMap.put(person.getpNbr(),person);
	}
	public Person findPerson(String pNbr){
		Person p;
		p=personHashMap.get(pNbr);
		return p;
	}
	public Person removePerson(String pNbr){
		Person p;
		p=personHashMap.get(pNbr);
		personHashMap.remove(pNbr);
		return p;
	}
	public Account findAccount(String pNbr, String accountNbr){
		Person p;
		Account a;
		p=personHashMap.get(pNbr);
		a=p.findAccount(accountNbr);
		return a;
	}
}
