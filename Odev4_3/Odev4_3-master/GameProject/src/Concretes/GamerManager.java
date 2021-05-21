package Concretes;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gameCheckService;
	
	

	public GamerManager(GamerCheckService gameCheckService) {
		
		this.gameCheckService = gameCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gameCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Kiþi Eklendi : "+ gamer.getFirsName());
		}else {
			System.out.println("Kiþi Bulunamadý");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kiþi Silindi : "+gamer.getFirsName());
		
	}

	@Override
	public void update(Gamer gamer) {
	
		System.out.println("Kiþi Güncellendi : "+gamer.getFirsName());
	}

}
