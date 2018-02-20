package com.tomekku.projectTwo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeIssues {
	
	public String ActualTimeString1, ActualTimeString2, ActualTimeString3 ;
	Calendar calendar;
	double temporary;
	
	Date timeDate;
	
	void timeSettings() {
	calendar = Calendar.getInstance();
	
	timeDate = calendar.getTime();
	
	SimpleDateFormat ActualTimeStringFormat1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	SimpleDateFormat ActualTimeStringFormat2 = new SimpleDateFormat("YYYY-MM-dd");
	SimpleDateFormat ActualTimeStringFormat3 = new SimpleDateFormat("YYYY-MM-dd HH:mm");
	
	ActualTimeString1 = ActualTimeStringFormat1.format(timeDate);	
	ActualTimeString2 = ActualTimeStringFormat2.format(timeDate);
	ActualTimeString3 = ActualTimeStringFormat3.format(timeDate);
	
	System.out.println(ActualTimeString1);
	System.out.println(ActualTimeString2);
	System.out.println(ActualTimeString3);
	
	}
	

}
