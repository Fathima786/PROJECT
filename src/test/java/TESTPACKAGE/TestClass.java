package TESTPACKAGE;

import java.io.IOException;

import org.testng.annotations.Test;

import BASEPACKAGE.BaseClass;
import PAGEPACKAGE.PageClass;
import UTILPACKAGE.Searchutils;

public class TestClass extends BaseClass {
	PageClass page;
	
	//click categories and go to mobile phones
	@Test(priority=1)
	public void categoriesphoneclick() throws InterruptedException 
	{
		page=new PageClass(driver);
		page.categories();
	}
	
	//print the list of phones and their price
	@Test(priority=2)
	public void listofphone() throws InterruptedException 
	{
		page=new PageClass(driver);
		page.phonelist();
	}
	
	//print the list of iphones and their price
	@Test(priority=3)
	public void listofiphone() throws InterruptedException
	{
		page=new PageClass(driver);
		page.iphonelist();
	}
	
	//click cars, print the number of car ads and click the first item 
	@Test(priority=4)
	public void carclick() throws InterruptedException
	{
		page=new PageClass(driver);
		page.cars();
	}
	
	//check whether logo displayed or not
	@Test(priority=5)
	public void logo() throws InterruptedException
	{
		page=new PageClass(driver);
		page.logo();
	}
	
	//click motorcycles from the menu
	@Test(priority=6)
	public void motorcycle() throws InterruptedException
	{
		page=new PageClass(driver);
		page.motorcycle();
	}

	//Click scooters under the categories of motorcycle page. Go to the first item and print all the details of it
	@Test(priority=7)
	public void scooterclick() throws InterruptedException
	{
		page=new PageClass(driver);
		page.scooter();
	}
	
	//display the fields in the menu
	@Test(priority=8)
	public void menulist() throws InterruptedException
	{
		page=new PageClass(driver);
		page.menu();
	}
	
	//input multiple locations
	@Test(priority=9)
	public void location() throws InterruptedException
	{
		page=new PageClass(driver);
		String loc="C:\\Users\\user\\Desktop\\search.xlsx";
		String sheet="Sheet1";
		int rowcount=Searchutils.countofrow(loc, sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String text=Searchutils.search(loc, sheet, i, 0);
			
			page.location(text);
		}
	}
	
	//take screenshot of the landed page
	@Test(priority=10)
	public void screenshot() throws InterruptedException, IOException
	{
		page=new PageClass(driver);
		page.screenshot();
	}
}


