package persons;

import interfaces.InterfaceA;
import interfaces.InterfaceC;

public class PersonA implements InterfaceA, InterfaceC{
	private String name;
	private int age;
	private String nif;
	private char favoriteLetter;
	
	public PersonA(String name, int age, String nif, char favoriteLetter) {
		this.name = name;
		this.age = age;
		this.nif = nif;
		this.favoriteLetter = favoriteLetter;
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
	
	public char getFavoriteLetter() {
		return favoriteLetter;
	}

	public void setFavoriteLetter(char favoriteLetter) {
		this.favoriteLetter = favoriteLetter;
	}

	@Override
	public void changeAge(int number) {
		this.age *= number;
	}

	@Override
	public boolean isAdult() {
		int age = 18;
		return this.age >= age;
	}

}
