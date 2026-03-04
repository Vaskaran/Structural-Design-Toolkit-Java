package adapter.demo2.client;

import adapter.common.PersonInfo;
import adapter.common.Student;
import adapter.common.Teacher;
import adapter.external.Musician;
import adapter.demo2.ProfessionClassAdapter;

import java.util.ArrayList;
import java.util.List;

class AdapterDemo2 {

	public static void main(String[] args) {

		List<PersonInfo> people = new ArrayList<>();
		people.add(new Student("Sam", 25));
		people.add(new Student("Bob", 21));
		people.add(new Teacher("Jack", 45));

		Musician musician = new Musician("Kate", 30);
		ProfessionClassAdapter adapter = new ProfessionClassAdapter(musician.getName(),  musician.getAge());
		people.add(adapter);

		// Getting the details
		for (PersonInfo person : people) {
			System.out.println(person.getPersonDetails());
		}
	}
}
