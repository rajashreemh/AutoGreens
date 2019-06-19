package HomePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePageObjects.BasePage;

import HomePageObjects.ProductPage;

public class ProductDetailsTest {
	BasePage bp;
	ProductPage pd;
	
	
	public ProductDetailsTest(){
		bp=new BasePage();
		pd=new ProductPage();
	}
	@Test
	public void verifygetTwitterSharetab(){
		pd.clickmoretab();
		Assert.assertTrue(pd.getTwitterTab(),"Failed");
	
		Assert.assertTrue(pd.getShareTab(),"Failed");
	}
	
	@Test
	public void productdescriptionisgiven(){
		pd.Click1stdresstab();
		Assert.assertTrue(pd.getproductdescp(),"Failed test");
	}
}
