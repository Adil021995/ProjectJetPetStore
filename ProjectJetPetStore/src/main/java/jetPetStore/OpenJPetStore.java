package jetPetStore;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenJPetStore 
{
  public static WebDriver driver;
  String driverPath = "F:\\SELENIUM - jarfiles\\ChromeDriver\\chromedriver-win32\\chromedriver.exe";
  public OpenJPetStore obj;
  public File src;
  public FileInputStream fis;
  public static Properties pro;
  
  public static JavascriptExecutor jse;
  public void OpenUrl() throws Exception
  {
	  obj = new OpenJPetStore();
	  src = new File("D:\\Maven-SeleniumProjects\\Project - JetpetStore\\ProjectJetPetStore\\Repo.properties");
	  fis = new FileInputStream(src);
	  pro = new Properties();
	  pro.load(fis);
	  
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  obj.OpenURL(driver, pro.getProperty("Url"));
	  
	  jse = (JavascriptExecutor)driver;
	  Thread.sleep(3000);
	  jse.executeScript("window.scrollBy(0 , 300)");
  }
  public void OpenURL(WebDriver driver , String URL)
  {
	  driver.get(URL);
  }
}
