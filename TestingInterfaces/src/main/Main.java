package main;

import interfaces.InterfaceA;
import persons.PersonA;
import persons.PersonB;

public class Main {

	public static void main(String[] args) {
		// Inicialización de dos personas
		PersonA personA = new PersonA("Felipe", 17, "21804567F", 'P');
		PersonB personB = new PersonB("Michael", 25, "3023A828D");
		
		System.out.println("---------- Persona A ----------");
		
		// Llamando a un método simple de InterfaceC
		System.out.println("Tengo " + personA.getAge() + 
				" años. ¿Soy adulto? " + change(personA.isAdult())); // Adulto si edad >= 18
		
		// Llamando a un método simple de InterfaceC
		System.out.println("Cambiando edad...");
		personA.changeAge(2); // Edad multiplicada por 2
		
		// Llamando a un método simple de InterfaceC
		System.out.println("Tengo " + personA.getAge() + 
				" años. ¿Soy adulto? " + change(personA.isAdult())); // Adulto
		
		// Llamando a un método por defecto de InterfaceB 
		System.out.println("Mi NIF es " + personA.getNif() + ". ¿Es válido? " + 
				change(personA.isValidNif(personA.getNif()))); // NIF válido
		
		// Llamando a un método por defecto de InterfaceA (que sobreescribe al de InterfaceB)
		System.out.println("Me llamo " + personA.getName() + ". ¿Mi nombre es largo? " 
				+ change(personA.hasLargeName(personA.getName()))); // Nombre largo si >= 6 caracteres
		
		char favoriteLetter = personA.getFavoriteLetter();
		System.out.println("Mi letra favorita es la " + favoriteLetter); // Letra favorita
		System.out.println("Mi viejo NIF es " + personA.getNif()); // Viejo NIF
		
		// Llamando a un método estático de InterfaceA
		char randomLetter = InterfaceA.generateNifLetter(); // Letra aleatoria generada
		System.out.println("He generado una letra aleatoria: " + randomLetter + 
				". ¿Es mi letra favorita? " + change(favoriteLetter == randomLetter));
		
		// Llamando a un método estático de InterfaceA
		System.out.println("Cambiando letra del NIF por mi favorita...");
		InterfaceA.changeNifLetter(personA, favoriteLetter); // Nuevo  NIF
		System.out.println("Mi nuevo NIF es " + personA.getNif());
		
		System.out.println("\n---------- Persona B ----------");
		
		// Llamando a un método simple de InterfaceC
		System.out.println("Tengo " + personB.getAge() + 
				" años. ¿Soy adulto? " + change(personB.isAdult())); // Adulto si edad >= 21
		
		// Llamando a un método simple de InterfaceC
		System.out.println("Cambiando edad...");
		personB.changeAge(2); // Edad dividida por 2
		
		// Llamando a un método simple de InterfaceC
		System.out.println("Tengo " + personB.getAge() + 
				" años. ¿Soy adulto? " + change(personB.isAdult())); // No adulto
		
		// Llamando a un método por defecto de InterfaceB
		System.out.println("Mi NIF es " + personB.getNif() + ". ¿Es válido? " + 
				change(personB.isValidNif(personB.getNif())));
		
		// Llamando a un método por defecto de InterfaceB (personB implementa InterfaceB y por lo
		// tanto se llamará al método de esta interfaz)
		System.out.println("Me llamo " + personB.getName() + ". ¿Mi nombre es largo? " 
				+ change(personB.hasLargeName(personB.getName()))); // Nombre largo si >= 10 caracteres
	}
	
	/**
	 * Recibe un valor booleano y lo convierte a "Sí" si es true o a "No" si es false
	 * @param b: true o false
	 * @return "Sí" o "No"
	 */
	private static String change(boolean b) {
		return b ? "Sí":"No";
	}
	
}
