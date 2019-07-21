package prueba;

import beans.InterpreteEspanol;
import beans.Traductor;

public class PruebaInterprete {

	public static void main(String[] args) {
		Traductor traductor = new  Traductor();
		InterpreteEspanol interprete = new InterpreteEspanol();
		// Se inyecta manualmente
		// y solamente se puede recibir el inteprete español
		traductor.setInterprete(interprete);
		traductor.setNombre("Juan");
		traductor.hablar();
	}   
}
