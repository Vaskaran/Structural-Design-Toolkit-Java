package adapter.demo1.client;

import adapter.common.PersonInfo;
import adapter.common.Student;
import adapter.common.Teacher;
import adapter.external.Musician;
import adapter.demo1.ProfessionObjectAdapter;

import java.util.ArrayList;
import java.util.List;

class AdapterDemo1 {

	public static void main(String[] args) {

		List<PersonInfo> people = new ArrayList<>();
		people.add(new Student("Sam", 25));
		people.add(new Student("Bob", 21));
		people.add(new Teacher("Jack", 45));

		people.add(new ProfessionObjectAdapter(new Musician("Kate", 30)));

		// Getting the details
		for (PersonInfo person : people) {
			System.out.println(person.getPersonDetails());
		}
	}

}
