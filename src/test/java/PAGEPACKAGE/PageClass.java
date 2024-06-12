package PAGEPACKAGE;

import java.time.Duration;
import java.util.List;
import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {
	
	static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/div/div[1]/div[1]/span[2]/button")
	WebElement categories;
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/div/div[2]/div/div[3]/div[2]/a")
	WebElement mobilephones;
	
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/section/div/div/div[5]/div[2]/div/div[2]/ul/li/a/div/span")
	List <WebElement> mobilelist;
	
	@FindBy(xpath="/html/body/div/div/header/div/div/div[2]/div/div/div[2]/div[1]/form/fieldset/div/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/section/div/div/div[5]/div[2]/div/div[2]/ul/li/a/div/span")
	List <WebElement> iphonelist;
	
	@FindBy(xpath="/html/body/div[1]/div/header/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/input")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"container\"]/header/div/div/div[2]/div/div/div[3]")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/div/div[1]/div[2]/div[1]/a")
	WebElement car;
	
	@FindBy(xpath="//*[@id=\"adsResultsIn\"]")
	WebElement numofcarads;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/section/div/div/div[5]/div[2]/div[1]/div[2]/ul/li[1]/a/div[1]")
	WebElement carspec;
	
	
	@FindBy(xpath="//*[@id=\"container\"]/header/div/div/div[1]/div/a")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/div/div[1]/div[2]/div[2]/a")
	WebElement motorcycle;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/section/div/div/div[5]/div[1]/div/div/div[1]/div[3]/ul/li[2]/ul/li[2]/a")
	WebElement scooter;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/div/div[1]/div[2]/div/a/span")
	List <WebElement> menu;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/section/div/div/div[5]/div[2]/div/div[2]/ul/li[1]/a")
	WebElement scooterspec;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/div[3]/section[1]/div/div/div[1]/div/div/div/span")
	List <WebElement> details;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/div[3]/section[1]/div/div/div[2]/p")
	List <WebElement> description;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/div[4]/div[1]/div/section/h1")
	WebElement scootertitle;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/div[4]/div[1]/div/section/span[1]")
	WebElement scooterprice;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/div[4]/div[1]/div/section/div/div[1]/div/span")
	WebElement scooterloc;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/div[4]/div[6]/strong")
	WebElement adid;
	
	@FindBy(xpath="/html/body/div[1]/div/header/div/div/div[2]/div/div/div[1]/div/div[1]/input")
	WebElement location;
	
	@FindBy(xpath="//*[@id=\"container\"]/header/div/div/div[2]/div/div/div[1]/div/div[1]/span/button")
	WebElement close;
	
	@FindBy(xpath="//*[@id=\"container\"]/header/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/span/b")
	WebElement locationdrop;
	
	
	@FindBy(xpath="/html/body/div[1]/div/header/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div")
	WebElement locationdropclick;
	
	@FindBy(xpath="/html/body/div[1]/div/header/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/span/b")
	WebElement locationdropclicktext;
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void categories() throws InterruptedException
	{
		System.out.println("---------------------------------------------------------");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(categories));
		categories.click();
		System.out.println("CATEGORY CLICKED");
		mobilephones.click();
		System.out.println("CLICKED MOBILE PHONES UNDER CATEGORY");
		Thread.sleep(7000);
	}
	
	public void phonelist() throws InterruptedException
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("----------LIST OF MOBILE PHONES----------");
		for(WebElement ele1:mobilelist)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			wait.until(ExpectedConditions.visibilityOf(ele1));
			String item=ele1.getAttribute("data-aut-id");
			
			if(item.equalsIgnoreCase("itemTitle"))
			{
				System.out.println(" ITEM NAME - "+ele1.getText() );
			}
			
			
			else if(item.equalsIgnoreCase("itemPrice"))
			{
				System.out.print("ITEM PRICE - "+ele1.getText() );
			}
			
		}
		
		
	}
	
	
	
	public void iphonelist() throws InterruptedException
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("----------LIST OF IPHONES----------");
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("iphone");
		searchbutton.click();
		Thread.sleep(10000);
		for(WebElement ele:iphonelist)
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
			String item=ele.getAttribute("data-aut-id");
			
			if(item.equalsIgnoreCase("itemTitle"))
			{
				System.out.println(" ITEM NAME - "+ele.getText() );
			}
			
			
			else if(item.equalsIgnoreCase("itemPrice"))
			{
				System.out.print("ITEM PRICE - "+ele.getText() );
			}
		}
		
	}
	
	public void cars()
	{
		System.out.println("---------------------------------------------------------");
		car.click();
		System.out.println("CARS CLICKED");
		String numofcarad=numofcarads.getText();
		
		System.out.println("NUMBER OF CAR ADS - "+numofcarad);
		
		carspec.click();
		
	}
	
	public void logo()
	{
		System.out.println("---------------------------------------------------------");
		
		Boolean b=logo.isDisplayed();
		
		if(b)
		{
			System.out.println("LOGO IS DISPLAYED");
		}
		else
		{
			System.out.println("LOGO IS NOT DISPLAYED");
		}
		
	}
	
	public void motorcycle()
	{
		System.out.println("---------------------------------------------------------");
		motorcycle.click();
		System.out.println("MOTORCYCLE CLICKED");
	}
	
	public void scooter()
	{
		System.out.println("---------------------------------------------------------");
		Actions act=new Actions(driver);
		act.scrollToElement(scooter);
		
		scooter.click();
		scooterspec.click();
		String id=adid.getText();
		
		System.out.println(" | AD ID - "+id+" | ");
		String title=scootertitle.getText();
		System.out.println(" | TITLE - "+title+" | ");
		String price=scooterprice.getText();
		System.out.println(" | PRICE - "+price+" | ");
		String loc=scooterloc.getText();
		System.out.println(" | LOCATION - "+loc+" | ");
		
		for(WebElement ele:details)
		{
			String text=ele.getAttribute("data-aut-id");
			if(text.contains("key"))
			{
				System.out.print(" | ");
				System.out.print(ele.getText()+ " - ");
			}
			
			else if(text.contains("value"))
			{
				System.out.print(ele.getText());
				System.out.println(" | ");
				
			}

		}
		
		
		
		System.out.println("\n----------DESCRIPTION----------\n");
		for(WebElement ele:description)
		{
			String desp=ele.getText();
			System.out.println(desp);
		}
		
	}
	
	public void menu()
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("----------MENU LIST----------");
		for(WebElement ele:menu)
		{
			String menu=ele.getText();
			System.out.println(menu);
		}
		
	}
	
	
	
	public void location(String text)
	{
		
		System.out.println(text);
		location.clear();
		location.sendKeys(text);
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.elementToBeClickable(locationdropclick));
		locationdropclick.click();
		
	}
	
	public void screenshot() throws IOException
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("SCREENSHOT TAKEN");
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("./Screenshot/s1.png"));
		System.out.println("---------------------------------------------------------");
	}
}
	


