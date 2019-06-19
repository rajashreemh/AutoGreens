package HomePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePageObjects.BasePage;
import HomePageObjects.DressesPage;
import HomePageObjects.HomePage;


public class DressesPageTest {

	DressesPage dp;
	BasePage bp;
	HomePage hp;

	public DressesPageTest() {
		dp = new DressesPage();
		bp = new BasePage();
		hp = new HomePage();
	}

	@Test
	public void verifyifSizeDisplay() {
		hp.ClickDresses();
		Assert.assertTrue(dp.getSmallsizedisplay(), "failed");
		hp.ClickTshirts();
		Assert.assertTrue(dp.getMediumsizedisplay(),"failed");
		hp.DisplayWomenCode();
		Assert.assertTrue(dp.getLargesizedisplay(),"failed");
	}

	@Test
	public void verifyproductcount() {
		Assert.assertTrue(dp.getcountfromheader()==dp.getproductcount(),"Fail");

	}
@Test
public void verifyaddtocart(){
	dp.Click1stdresstab();
	dp.Clickaddtocartbtn();
	Assert.assertTrue(dp.verifyproceedcheckout(),"Failed");
}
}
