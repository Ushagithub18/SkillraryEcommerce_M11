package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
//Declaration
	// address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skillrary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search textfield
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	//address of searchIcon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchIcon;
	
	//initialization
		public SkillraryHomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
    
		//utilization
		public WebElement getGearsbtn() {
			return gearsbtn;
		}

		

		public WebElement getSkillrarydemoapp() {
			return skillrarydemoapp;
		}

		

		public WebElement getSearchTf() {
			return searchTf;
		}

		

		public WebElement getSearchIcon() {
			return searchIcon;
		}
		//bussiness libraries
		
		public void gearsButton() {
			gearsbtn.click();
		}
		
		public void Skillrarydemoapp() {
			skillrarydemoapp.click();
			
		}
		
		public void searchTextField(String data) {
			searchTf.sendKeys(data);
		
		
			
		}
}
