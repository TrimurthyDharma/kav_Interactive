package Liscio_AddNew_Package;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Liscio_AddNew_Class {
	WebDriver driver;
	Actions ac;
	Robot r;
	JavascriptExecutor js;
	@BeforeTest()
	public void login() throws Exception
	{
     	System.setProperty("webdriver.edge.driver", "C:\\Users\\kavin\\Documents\\Automation Testing\\Selenium\\Projects\\LIscio_Project_Folder\\Liscio_Project\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavin\\Documents\\Automation Testing\\Selenium\\Projects\\LIscio_Project_Folder\\Liscio_Project\\Drivers\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://anisri.liscio.me/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("trimurthy.dharma+3333@gmail.com");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Liscio@369");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='loginSubmit']")).click();
		//Thread.sleep(10000);
		//driver.close();
		
	}
	
	@Test()
	public void New_Message() throws Exception
	{
		
		
		driver.findElement(By.xpath("//a[@href='/message/new/modal']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@class='inputHelper dropdown-toggle noCaret']")).click();
		//Thread.sleep(8000);
		
		WebElement recipient = driver.findElement(By.className("Select-placeholder"));
		Thread.sleep(8000);
		 ac = new Actions(driver);
		    ac.moveToElement(recipient).click().perform();
		    Thread.sleep(15000);
		    r = new Robot();
		    //r.keyPress(KeyEvent.VK_DOWN);
		    r.keyPress(KeyEvent.VK_ENTER);
		    driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary btn btn-secondary']")).click();
			//Thread.sleep(5000);
		    driver.findElement(By.name("subject")).sendKeys("kav interactive");
			Thread.sleep(5000);
		    driver.findElement(By.xpath("//div[@class='notranslate public-DraftEditor-content']")).sendKeys("hi ,I am trimurthy");
			//Thread.sleep(5000);
			js =(JavascriptExecutor)driver;
			js.executeScript("scroll(0, 100)");
			
			WebElement send = driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show div.modal-dialog.customModal.customModal--w990.customModal--nopadding div.modal-content div.modalFooter.modal-footer div.modalFooter--inner.justify-content-between div.btn-wrap.btn--leftspace > button.btn.btn-primary"));
			ac.moveToElement(send).doubleClick().perform();	
		
		
	}
	
	
	@Test
	public void New_Task() throws Throwable 
	{
		//driver.findElement(By.xpath("//a[@id='
	    Thread.sleep(15000);
	    driver.findElement(By.xpath("//*[@id='addnew_button']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@id='addnew_modal']//span[contains(text(),'Task')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[contains(text(),'Request Information')]")).click();
	    WebElement account = driver.findElement(By.className("Select-placeholder"));
	    ac.moveToElement(account).click().perform();
	    Thread.sleep(8000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(8000);
	    WebElement contact = driver.findElement(By.className("Select-placeholder"));
	    Thread.sleep(8000);
	    ac.moveToElement(contact).click().perform();
	    Thread.sleep(8000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(8000);
	    driver.findElement(By.name("taskTitle")).sendKeys("i love india");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='notranslate public-DraftEditor-content']")).sendKeys("Hi,I am trimurthy");
	    Thread.sleep(5000);
	    js.executeScript("document.querySelector('div.container-fluid div.wrapper div.center-wrapper.col-lg-10.col-sm-12.col-md-12.m-auto.with-disabled-inputs:nth-child(4) div.miscellaneous div.row:nth-child(6) div.col-12.form-group.formbtn.justify-content-end.btn--leftspace div.btn-wrap.btn--leftspace > button.btn.btn-primary.task-form-submit:nth-child(2)').click()");
	  
	    Thread.sleep(10000);
		
	}
	
	@AfterTest
	public void Logout() throws Throwable
	{
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='logout_button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='icon-logout']")).click();
        Thread.sleep(10000);
       // driver.switchTo().alert().accept();
	}
	
	
	
	
	

}
