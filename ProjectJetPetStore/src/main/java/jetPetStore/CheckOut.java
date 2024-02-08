package jetPetStore;

import org.openqa.selenium.By;

public class CheckOut extends OpenJPetStore 
{
  public void Buynow() throws Exception
  {
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(0 , 400)");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("SelectCard"))).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("CardNumber"))).clear();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(pro.getProperty("CardNumber"))).sendKeys("879548754875487");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("ExpiryDateOfCard"))).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("ExpiryDateOfCard"))).sendKeys("08/2024");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("BillToContinue"))).click();
  }
}
