package HomePageObjects;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[1]/a[@title='Women']")
	private WebElement tabWomen;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]/a[@title='Dresses']")
	private WebElement tabDresses;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]/a[@title='T-shirts']")
	private WebElement tabTshirts;
	
	@FindBy(xpath="//*[@id='center_column']/h1/span[1]")
	private WebElement WomenDisplay;
	
	@FindBy(xpath="//*[@id='center_column']/h1/span[1]")
	private WebElement DressesDisplay;
	
	@FindBy(xpath="//*[@id='center_column']/h1/span[1]")
	private WebElement TshirtsDisplay;
	
	@FindBy(id="newsletter-input")
	private WebElement SubscriptionBox;
	
	@FindBy(name="submitNewsletter")
	private WebElement submitbtn;
	
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement Alertmessage;
	
	
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean getWomenTab(){
		return elementFound(tabWomen);
		 
		}
	public boolean getDressesTab(){
		return elementFound(tabDresses);
		}
	public boolean getTshirtTab(){
		return elementFound(tabTshirts);
		}

	public void ClickWomen(){
		tabWomen.click();
		}
	
	public void ClickDresses(){
		tabDresses.click();
	}
	
	public void ClickTshirts(){
		tabTshirts.click();
	}
	public boolean DisplayDresses(){
		return elementFound(DressesDisplay);
	}
	
	public boolean DisplayTShirts(){
		return elementFound(TshirtsDisplay);
	}
	
	public boolean DisplayWomenCode(){
		return elementFound(WomenDisplay);
	}
	
	
	
	
	public void setNewsletter(String email){
	setText(SubscriptionBox, email);
	submitbtn.click();
	}
	
	public String setAlertmessage(){
		return Alertmessage.getText();
	}
	
	
	
	
}
