package Concrete;

import Abstract.PlayerCheckService;
import Entity.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		// TODO Auto-generated method stub
		return true;
	}

}
