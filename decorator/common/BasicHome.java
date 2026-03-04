package decorator.common;

public class BasicHome implements Home {
	@Override
	public void create() {
		System.out.println("A home with some basic facilities is made.");
	}
}