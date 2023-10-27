package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {

	 //Declaration
	// address of select catagory
	@FindBy(name="//select[@name='addresstype']")
	private WebElement selectDd;
	
	//address of feedback
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement feedbackbtn;
	
	//initialization
	public DemoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getSelectDd() {
		return selectDd;
	}

	public WebElement getFeedbackbtn() {
		return feedbackbtn;
	}

	    public void feedbackbtn() {
	    	feedbackbtn.click();	
	}
	

}
