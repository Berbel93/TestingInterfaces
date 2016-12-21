package interfaces;

import java.util.Random;

import persons.PersonA;

/**
 * @author PabloBerbel
 * 
 * Interfaz funcional con dos métodos estáticos que ya vienen implementados y que usará
 * la clase PersonA. Extiende a InterfaceB y por lo tanto, podrá usar los métodos por
 * defecto implementados en esa interfaz. 
 * El método {@link #hasLargeName(String)} está implementado tanto en InterfaceA como en
 * InterfaceB. Como InterfaceA extiende a Interface B, cualquier clase que implemente 
 * InterfaceA y use este método, llamará al de esta interfaz
 * 
 * @see PersonA
 * @see InterfaceA
 * @see InterfaceB
 */
public interface InterfaceA extends InterfaceB{
	/**
	 * Genera un carácter aleatorio que puede ir desde la 'A' hasta la 'Z'
	 * @return carácter dentro del rango [A-Z]
	 */
	static char generateNifLetter() {
		Random generator = new Random();
		final int firstAsciiLetter = 65;
		final int lettersNumber = 26;
		int randomNumber = generator.nextInt(lettersNumber) + firstAsciiLetter;
		return (char) randomNumber;
	}
	
	/**
	 * Modifica la letra del NIF de la persona pasada como parámetro por una
	 * nueva, pasada también como parámetro
	 * 
	 * @param personA: persona a la que se le va a cambiar el NIF
	 * @param letter: nueva letra para el NIF
	 */
	static void changeNifLetter(PersonA personA, char letter) {
		String oldNif = personA.getNif();
		String newNif = oldNif.substring(0, oldNif.length() - 1) + letter;
		personA.setNif(newNif);
	}
	
	/**
	 * Devuelve true si el nombre de la persona tiene 6 o más caracteres, 
	 * false de lo contrario. Las clases que implementen InterfaceA utilizarán
	 * este método, y no el implementado en InterfaceB
	 * 
	 * @param name: nombre de la persona
	 * @return si el nombre de la persona tiene 6 o más caracteres
	 */
	default boolean hasLargeName(String name) {
		final int number = 6;
		return name.length() >= number;
	}
}
