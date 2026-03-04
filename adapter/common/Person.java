package adapter.common;

public abstract class Person implements PersonInfo {
	protected String name;
	protected int age;
	protected String id;

	public Person(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String getPersonDetails() {
		return "Name: " + name + ", Age: " + age + ", ID: " + id;
	}

	// Getters will be used in the class adapter (Demo2)
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getIdentificationNumber() {
		return id;
	}
}
