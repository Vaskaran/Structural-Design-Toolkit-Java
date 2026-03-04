package adapter.common;

import java.util.Random;

public class Student extends Person {
	public Student(String name, int age) {
		super(name, age, generateId());
	}

	private static String generateId() {
		int number = new Random().nextInt(1, 1000);
		return "S_" + number;
	}
}