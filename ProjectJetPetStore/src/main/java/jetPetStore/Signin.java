package jetPetStore;

import org.openqa.selenium.By;

public class Signin extends OpenJPetStore 
{
   public void login() throws Exception
   {
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("LoginUserName"))).clear();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("LoginPassword"))).clear();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("LoginUserName"))).sendKeys(pro.getProperty("UserNameValue"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("LoginPassword"))).sendKeys(pro.getProperty("NewPasswordValue"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("LoginButton"))).click();
   }
}
