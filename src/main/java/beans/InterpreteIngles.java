package beans;

public class InterpreteIngles implements Interprete{

	@Override
	public void saludar() {
		System.out.println("Hi! Mi name is ");
	}

	@Override
	public void despedirse() {
		System.out.println("Good Bye...");
	}
}
