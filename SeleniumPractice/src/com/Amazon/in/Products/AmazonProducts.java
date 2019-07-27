package com.Amazon.in.Products;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonProducts {
	@BeforeTest
	public void launchBrowser(){
		
		
		
	}
	@BeforeMethod
	public void configBM(){
		System.out.println("Login");
	}
	@AfterMethod
	public void configAM(){
		System.out.println("logout");
	}
	@Test(priority=1)
	public void Iphone10x()
	{Reporter.log("Iphone10x",true);
	int a[]=new int[3];
	a[0]=1;
	a[1]=3;
	System.out.println(a[13]);
			
	}
	@Test(priority=2)
	public void samsung(){
		Reporter.log("samsung",true);
		
	}

}
