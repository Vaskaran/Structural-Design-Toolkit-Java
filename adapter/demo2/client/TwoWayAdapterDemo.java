package adapter.demo2.client;

import java.util.ArrayList;
import java.util.List;

import adapter.common.PersonInfo;
import adapter.common.Student;
import adapter.common.Teacher;
import adapter.demo2.ProfessionClassAdapter;
import adapter.external.Musician;
import adapter.external.Profession;

class TwoWayAdapterDemo {

	public static void main(String[] args) {

		List<PersonInfo> people = new ArrayList<>();
		people.add(new Student("Sam", 25));
		people.add(new Student("Bob", 21));
		people.add(new Teacher("Jack", 45));

		Musician musician = new Musician("Kate", 30);
		ProfessionClassAdapter adapter = new ProfessionClassAdapter(musician.getName(), musician.getAge());
		people.add(adapter);

		// Getting the details
		for (PersonInfo person : people) {
			System.out.println(person.getPersonDetails());
		}

		System.out.println("\nAnalyzing the two-way adapter now.");		
		useTargetInterface(adapter);
		useAdapteeInterface(adapter);
	}
	
	private static void useTargetInterface(PersonInfo personInfo) {
		System.out.println(personInfo.getPersonDetails());		
	}
	private static void useAdapteeInterface(Profession profession) {
		System.out.println(profession.getProfessionDetails());
	}

}
