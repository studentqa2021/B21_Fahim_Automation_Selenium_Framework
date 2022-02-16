package com.smoke;

import org.testng.annotations.Test;

import com.generic.MercuryTours_BaseLogin;
import com.report.ExtentReport;

public class MercuryTours_SmokeTest extends ExtentReport {
	
	//public static void main(String[] args) throws Exception {
		//MercuryTours_BaseLogin obj = new MercuryTours_BaseLogin();
		//obj.getLogin();
	//}

	@Test
	public void getLogin() throws Throwable {
		new MercuryTours_BaseLogin().getLogin();
	}


}
