import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws RemoteException, Exception {
		Campaign c = new Campaign();
		c.setId(1);
		c.setGameId(5);
		c.setGameName("Call of Duty");
		System.out.println(c.getCampaignCode());
		
		//MernisServiceAdapter m = new MernisServiceAdapter();
		Gamer g = new Gamer(1,"Ýrfan","YILDIRIM","25836914723",1972,"irfan@irfan.com");
		//System.out.println(m.CheckIfRealPerson(g));
		
		//UserManager u = new UserManager(new MernisServiceAdapter());
		//u.update(g);
		
		Game game = new Game();
		game.setName("Crysis Remastered");
		game.setPrice(250);
		SaleManager s = new SaleManager();
		s.sale(game, g);
		CampaignManager cm = new CampaignManager();
		Campaign cam = new Campaign();
		cam.setGameName("Call of Duty - Black Ops");
		cam.setDiscount(30);
		s.campaignSale(game, g,cam);
		cm.add(cam);
		cm.delete(cam);
		cm.update(cam);
		
		

	}

}
