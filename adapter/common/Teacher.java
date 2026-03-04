package adapter.common;

import java.util.Random;

public class Teacher extends Person {
	public Teacher(String name, int age) {
		super(name, age, generateId());
	}
	private static String generateId() {
		int number = new Random().nextInt(1, 10);
		return "T_" + number;
	}
}
