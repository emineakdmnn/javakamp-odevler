package Concretes;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirsName()+" "+gamer.getLastName()+ " :"+" "+game.getName()+" Oyununu Satýn Aldý.");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirsName()+" "+gamer.getLastName()+ " :"+" "+campaign.getGameName()+" oyununun kampyasýndan yararlandý." );
		
	}

}
