import Adapter.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(new Gamer(1,"Emine","Akduman",1997,"11111111111"));
		
		GameManager gameManager =new GameManager();
		gameManager.add(new Game(1,"ABCD",300.0,10));
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "ABCD", 10));
		
		SaleManager saleManager=new SaleManager();
		saleManager.sale(new Gamer(1, "Emine ", "Akduman", 1997, "111111111"), new Game(1, "ABCD", 300, 10));
		
		SaleManager saleManager2=new SaleManager();
		saleManager2.campaignSale( new Game(1, "ABCD", 300, 10),new Gamer(1, "Emine ", "Akduman", 1997, "111111111"), new Campaign(1, "ABCD", 10));
	}
	
	

}
