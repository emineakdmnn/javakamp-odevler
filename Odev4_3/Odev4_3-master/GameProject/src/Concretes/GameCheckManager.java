package Concretes;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GameCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
