package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
}
