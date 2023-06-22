package com.softtek.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonServiceimpl implements ISeasonfinderService {

	@Override
	public String findSeason() {
		// get the system date
		LocalDate id= LocalDate.now();
		 // get the current month
		int month =id.getMonthValue();
		
		//find season
		if(month>=7 && month<=9)
			return "rainy season";
		else if(month>=3 && month<=6)
			return "summer season" ;
		else 
			return "winter season";
		
		
	}

}
