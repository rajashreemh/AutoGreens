package HomePageTest;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import HomePageObjects.BasePage;
import HomePageObjects.HomePage;

public class HomeTests {

	BasePage bp;
	HomePage hp;
	
	int random=new Random().nextInt(50000);
	String email="adfvddx" +random+ "@gmail.com";
	
	public HomeTests(){
		bp=new BasePage();
		hp=new HomePage();
	
	}
	@Test
	public void verifygetTabs(){
	Assert.assertTrue(hp.getDressesTab(),"Failed");
	Assert.assertTrue(hp.getTshirtTab(), "failed");
	Assert.assertTrue(hp.getWomenTab(), "failed");
	}
		
	@Test
		public void VerifynavigatingToPage(){
		hp.ClickDresses();
		Assert.assertTrue(hp.DisplayDresses(),"Failed to display");
		hp.ClickTshirts();
		Assert.assertTrue(hp.DisplayTShirts(),"Failed to display");
		hp.ClickWomen();
		Assert.assertTrue(hp.DisplayWomenCode(),"Failed to display");
		}
		
	@Test
	public void verifySubscriptionAlert(){
		hp.setNewsletter(email);
		String message=hp.setAlertmessage();
		Assert.assertTrue(message.contains("successfully"));
	}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

