package interfaces;

import persons.PersonA;
import persons.PersonB;

/**
 * @author PabloBerbel
 * 
 * Interfaz simple con dos métodos que tendrán diferentes implementaciones
 * en las siguientes clases:
 * @see PersonA
 * @see PersonB
 *
 */
public interface InterfaceC {
	void changeAge(int number);
	boolean isAdult();
}
