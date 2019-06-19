package HomePageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPage extends BasePage {

	@FindBy(xpath = "//div[@class='layered_filter']/ul[@id='ul_layered_id_attribute_group_1']/li[1]")
	private WebElement Smallsize;

	@FindBy(xpath = "//div[@class='layered_filter']/ul[@id='ul_layered_id_attribute_group_1']/li[2]")
	private WebElement Mediumsize;

	@FindBy(xpath = "//div[@class='layered_filter']/ul[@id='ul_layered_id_attribute_group_1']/li[3]")
	private WebElement Largesize;

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement textheading;
	
	
	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> lstproducts;
	
     @FindBy(xpath="//p[@id='add_to_cart']/button/span")
     private WebElement addtocart;
     
     @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//div[@class='right-block']/h5/a[1]")
		private WebElement firstdresstab;
    
     @FindBy(xpath="//*[@title='Proceed to checkout']/span")
     private WebElement btncheckout; 
     
	public DressesPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean getSmallsizedisplay(){
			return elementFound(Smallsize);
			}
		public boolean getMediumsizedisplay(){
			return elementFound(Mediumsize);
			}
		public boolean getLargesizedisplay(){
			return elementFound(Largesize);
		}
		
		
	public int getcountfromheader() {
		return Integer.parseInt(textheading.getText().split(" ")[2]);
	}
	
     public int getproductcount(){
	return lstproducts.size();
	}
     public void Click1stdresstab(){
			firstdresstab.click();	
		}
     
     public void Clickaddtocartbtn(){
    	 addtocart.click();	
		}
     
     public boolean verifyproceedcheckout(){
    	 isElementVisible(btncheckout);
			return elementFound(btncheckout);
			}
     
     
}
