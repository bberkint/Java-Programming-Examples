package Concrete;

import Abstract.CampainService;
import Entity.Campaign;

public class CampaignManager implements CampainService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added : " + campaign.getCampainName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted : " + campaign.getCampainName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated : " + campaign.getCampainName());
		
	}

}
