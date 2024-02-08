package jetPetStore;

import org.openqa.selenium.By;

public class AddToCart extends OpenJPetStore 
{
  public void AddtoCart() throws Exception
  {
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(0 , 400)");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("Cat"))).click();
	  
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(0 , 300)");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("Persian"))).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("AddCart"))).click();
	  
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(0 , 300)");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("AddtoCart1"))).click();
	  
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(0 , 300)");
	  
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("Quantity")).clear();
//	  driver.findElement(By.xpath("Quantity")).sendKeys("1");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(pro.getProperty("Proceed"))).click();
  }
}
