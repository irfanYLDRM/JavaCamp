package Concrete;

import Abstract.BaseSaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager extends BaseSaleManager {

	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " isimli oyun " + gamer.getNationalId() + " T.C. Kimlik Numaralý " +
				gamer.getFirstName() + " " + gamer.getLastName() + " tarafýndan " +
				campaign.getCampaignCode() + " indirim kodu ve " +
				(game.getPrice()-game.getPrice()*campaign.getDiscount()/100) + "-TL indirimli fiyatýyla satýn alýndý.");
	}

}
