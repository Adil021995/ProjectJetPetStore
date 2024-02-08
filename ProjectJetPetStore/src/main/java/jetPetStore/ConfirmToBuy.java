package jetPetStore;

import org.openqa.selenium.By;

public class ConfirmToBuy extends OpenJPetStore 
{
   public void Confirm() throws Exception
   {
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(0 , 900)");
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Confirm"))).click();
	   
	   System.out.println("Item purchase Successfully.....");
   }
}
