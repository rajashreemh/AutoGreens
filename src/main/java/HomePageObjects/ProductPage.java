package HomePageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

		@FindBy(xpath = "(//a[@title='View'])[1]")
		private WebElement Moretab;

		@FindBy(xpath = "//p[@class='socialsharing_product list-inline no-print']/button[1]")
		private WebElement TweetTab;

		@FindBy(xpath = "//p[@class='socialsharing_product list-inline no-print']/button[2]")
		private WebElement Sharetab;
		
		@FindBy(xpath = "//ul[@id='homefeatured']/li[1]//div[@class='right-block']/h5/a[1]")
		private WebElement firstdresstab;
		
		@FindBy(xpath="//div[@id='short_description_content']")
		private WebElement productdescp;
		
	     public ProductPage(){
			PageFactory.initElements(driver, this);
		}

		public boolean getTwitterTab() {
			return elementFound(TweetTab);
		}

		public boolean getShareTab() {
			return elementFound(Sharetab);
		}

		public void clickmoretab() {
			Moretab.click();
		}

		public void Click1stdresstab(){
			firstdresstab.click();	
		}
		
		public boolean getproductdescp() {
			return elementFound(productdescp);
		}
	}


