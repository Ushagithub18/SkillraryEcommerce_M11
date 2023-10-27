package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_library.BaseClass;

public class Testcase2 extends BaseClass  {
     @Test
	public void tc2() {
		
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsButton();
		s.Skillrarydemoapp();
	    utilities.childBrowser(driver);
		DemoSkillraryPage ds= new DemoSkillraryPage(driver);
		ds.feedbackbtn();
		 DownloadInvoicePage dI=new DownloadInvoicePage(driver);
		 dI.downloadInvoiceButton();
}
}