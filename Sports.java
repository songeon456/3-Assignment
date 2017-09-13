import java.util.*;

class Sports {
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n platers in" + getName());
		
	}
}
class Soccer extends Sports{
	@Override
	String getName() {
		return "Soccer Class";
	}
	
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 palyers in"+ getName());		
	}
}
