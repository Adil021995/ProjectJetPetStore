package jetPetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup extends OpenJPetStore
{
  public void SignupHere() throws Exception
  {
	 WebDriverWait wait = new WebDriverWait(driver , 30);
	 WebElement SignupButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pro.getProperty("Signup"))));
	 SignupButton.click();
	 
	 Thread.sleep(3000);
	 jse.executeScript("window.scrollBy(0 , 400)");
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("UserName"))).sendKeys(pro.getProperty("UserNameValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("NewPassword"))).sendKeys(pro.getProperty("NewPasswordValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("ConfirmPassword"))).sendKeys(pro.getProperty("ConfirmPasswordValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("FirstName"))).sendKeys(pro.getProperty("FirstNameValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("LastName"))).sendKeys(pro.getProperty("LastNameValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("Phone"))).sendKeys(pro.getProperty("PhoneValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("Address1"))).sendKeys(pro.getProperty("Address1Value"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("Address2"))).sendKeys(pro.getProperty("Address2Value"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("City"))).sendKeys(pro.getProperty("CityValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("State"))).sendKeys(pro.getProperty("StateValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("Zip"))).sendKeys(pro.getProperty("ZipValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("Country"))).sendKeys(pro.getProperty("CountryValue"));
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("Language"))).click();
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("FavouriteCatgegory"))).click();
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("EnabledMyList"))).click();
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(pro.getProperty("BannerOption"))).click();
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(pro.getProperty("SaveAccountButton"))).click();
  }
}
