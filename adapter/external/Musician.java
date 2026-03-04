package adapter.external;

public class Musician implements Profession {

	private final String name;
	private final int age;
	private final String occupation;

	public Musician(String name, int age) {
		this.name = name;
		this.age = age;
		this.occupation = "Musician";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getProfessionDetails() {
		return "Name: " + name + ", Age: " + age + ", Occupation: " + occupation;
	}

	// Added for Q&A
	@Override
	public String getHobby() {
		return "playing with music";
	}
}