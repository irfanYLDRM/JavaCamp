package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getGameName() + " isimli oyun için " + campaign.getCampaignCode() + " kodu ve %" +
							campaign.getDiscount() + " indirim oranýyla kampanya oluþturuldu.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignCode() + " kodlu kampanya silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignCode() + " kodlu kampanya þartlarý güncellendi.");
		
	}

}
