package com.softtekservice;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class LinksServiceImpl implements ILinksService {

	@Override
	public String generateWishMessage() {
		LocalDateTime idt = LocalDateTime.now();
		int hour = idt.getHour();
		 return hour<12?"goodMorning":hour<16?"Good Afternoon":hour<20?"Good evening":"Good night";
		
//		if (hour < 12) {
//			return "Good Morning";
//		} else if (hour < 16) {
//			return "Good afternoon";
//		} else if (hour < 20) {
//			return "Good evening";
//		} else {
//			return "good night";
//		}

	}

	@Override
	public Set<String> fetchAllLanguages() {
		
		 Locale[] locales =Locale.getAvailableLocales();
		 HashSet<String> labgSet = new HashSet<String>();
		 for(Locale l :locales) 
		 {
			 labgSet.add(l.getDisplayLanguage());
	     }

		return labgSet;
	}

}
