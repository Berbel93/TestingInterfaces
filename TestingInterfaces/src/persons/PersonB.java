package persons;

import interfaces.InterfaceB;
import interfaces.InterfaceC;

public class PersonB implements InterfaceB, InterfaceC{
	private String name;
	private int age;
	private String nif;
	
	public PersonB(String name, int age, String nif) {
		this.name = name;
		this.age = age;
		this.nif = nif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public void changeAge(int number) {
		this.age /= number;
	}

	@Override
	public boolean isAdult() {
		int age = 21;
		return this.age >= age;
	}

}
