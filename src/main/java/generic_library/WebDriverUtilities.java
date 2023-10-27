package generic_library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	// 1 .handling doubleClick

		public void doubleclick(WebDriver driver,WebElement ele)	{
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();
	}
		//2.handling rightClick
		public void rightClick(WebDriver driver,WebElement ele)	{
			Actions a= new Actions(driver);
			a.contextClick(ele).perform();
	}	
	   //3.Drag and Drop
			public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2)	{
				Actions a= new Actions(driver);
				a.dragAndDrop(ele1,ele2).perform();	
	}
	   //4.Screenshot	
		 public void ss(WebDriver driver)throws Throwable	{
			 TakesScreenshot ts = (TakesScreenshot)driver;
		        File src =ts.getScreenshotAs(OutputType.FILE);
		        File dest = new File("./snaps/flipkart.png");
		        FileUtils.copyFile(src, dest);
	}
	   // 5.MouseOvering
			
			public void MouseOvering(WebDriver driver,WebElement ele)	{
			Actions a= new Actions(driver);
			a.moveToElement(ele).perform();	
			}	
	 //6.reading data from property file
			public String PropertyFile(String key) throws Throwable{
		    Properties p= new Properties();
			FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties") ;
			p.load(fis);
			return p.getProperty(key);
			}
	   //7.Drop down
			public void dropDown(WebElement ele, String text) {
				Select s= new Select(ele);
				s.selectByVisibleText(text);
			}
	   //8.handling frame
			public void frames(WebDriver driver,String value) {
				driver.switchTo().frame(value);
			}
		//9. handling Default content	
			public void frames(WebDriver driver) {
				driver.switchTo().defaultContent();
			}
		// 10.handling Child Browser
			public void childBrowser(WebDriver driver) {
				Set<String> child = driver.getWindowHandles();
				for(String b:child) {
					driver.switchTo().window(b);
				}
			}
		//11.handling Scrolling	
				public void Scrolling(WebDriver driver, WebElement ele)	{	
					JavascriptExecutor js= (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView", ele);
				}
		//12.handling pop up
			 public void popup(WebDriver driver) {
				 driver.switchTo().alert().accept();
			 }
			
}



