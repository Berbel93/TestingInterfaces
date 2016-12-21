package interfaces;

import persons.PersonA;
import persons.PersonB;

/**
 * @author PabloBerbel
 * 
 * Interfaz funcional con dos métodos por defecto que ya vienen implementados y
 * que usarán las siguientes clases:
 * @see PersonA
 * @see PersonB
 */

public interface InterfaceB {
	/**
	 * Devuelve true si el nif pasado como parámetro es válido,
	 * false de lo contrario
	 * 
	 * @param nif: nif de la persona
	 * @return si el nif es válido
	 */
	default boolean isValidNif(String nif) {
		if(nif.length() == 9) {
			for(int i=0; i<nif.length() - 1; i++)
				if(!Character.isDigit(nif.charAt(i)))
					return false;
			return Character.isLetter(nif.charAt(nif.length() - 1));
		}
			
		return false;
	}
	
	/**
	 * Devuelve true si el nombre de la persona tiene 10 o más caracteres, 
	 * false de lo contrario. Para utilizar la implementación de este método,
	 * la clase en cuestión debe implementar esta interfaz y no InterfaceA
	 * 
	 * @param name: nombre de la persona
	 * @return si el nombre de la persona tiene 10 o más caracteres
	 */
	default boolean hasLargeName(String name) {
		final int number = 10;
		return name.length() >= number;
	}

}
