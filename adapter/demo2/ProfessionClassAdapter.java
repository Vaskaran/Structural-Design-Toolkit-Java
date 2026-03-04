package adapter.demo2;

import adapter.common.PersonInfo;
import adapter.external.Musician;

public class ProfessionClassAdapter extends Musician implements PersonInfo {

	public ProfessionClassAdapter(String name, int age) {
		super(name, age);
	}

	@Override
	public String getPersonDetails() {
		// delegate to adaptee behavior
		return getProfessionDetails();
	}

}
