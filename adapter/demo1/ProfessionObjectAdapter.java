package adapter.demo1;

import adapter.common.PersonInfo;
import adapter.external.Profession;

public class ProfessionObjectAdapter implements PersonInfo {

	private final Profession profession;

	public ProfessionObjectAdapter(Profession profession) {		
		this.profession = profession;
	}

	@Override
	public String getPersonDetails() {
		return profession.getProfessionDetails();
	} 

}
