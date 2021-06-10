package com.BEd.ObjectRepository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BEdLogin {

	WebDriver driver;

	public BEdLogin(WebDriver driver) {

		this.driver = driver;
	}

	public String GetMsg() {
		String msg = driver.switchTo().alert().getText();
		return msg;
	}

	public void JavaDismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public void JavaAcceptAlert() {
		driver.switchTo().alert().accept();
	}

	By mobile = By.id("txtSMobileNo");

	public WebElement MobileNo() {
		return driver.findElement(mobile);
	}

	By password = By.id("txtSPwd");

	public WebElement Password() {
		return driver.findElement(password);
	}

	By captcha = By.id("txtRandno");

	public WebElement Captcha() {
		return driver.findElement(captcha);
	}

	By signin = By.id("btnSIGNIN");

	public WebElement SignIn() {
		return driver.findElement(signin);
	}

	// Registration Page

	By RegName = By.id("txtName");

	public WebElement Name() {
		return driver.findElement(RegName);
	}

	By RegEmail = By.id("txtmail");

	public WebElement Email() {
		return driver.findElement(RegEmail);
	}

	By Pw = By.id("txtPwd");

	public WebElement Passwordd() {
		return driver.findElement(Pw);
	}

	By CPw = By.id("txtConfirmPwd");

	public WebElement ConfirmPasswordd() {
		return driver.findElement(CPw);
	}

	By Sub = By.id("btnSubmit");

	public WebElement Submit() {
		return driver.findElement(Sub);
	}

	By RegOTP = By.id("btnOTP");

	public WebElement GenerateOTP() {
		return driver.findElement(RegOTP);
	}

	By applBtn = By.xpath("//span[contains(text(),'Application Form')]");

	public WebElement ApplicationFormButton() {
		return driver.findElement(applBtn);
	}
	
	By editBtn = By.xpath("//span[contains(text(),'Edit Application Form ')]");

	public WebElement EditApplicationForm() {
		return driver.findElement(editBtn);
	}

	// Forget Password
	By ForgetPw = By.partialLinkText("Forgot Password?");

	public WebElement ForgetPassword() {
		return driver.findElement(ForgetPw);
	}

	// Message Handle

	By MsgCapture = By.id("popup_message");

	public WebElement PopuupMessage() {
		return driver.findElement(MsgCapture);
	}

	By MsgHandle = By.id("popup_ok");

	public WebElement PopuupMessageHandle() {
		return driver.findElement(MsgHandle);
	}

	By NewUser = By.id("A1");

	public WebElement NewUserResistration() {
		return driver.findElement(NewUser);
	}

	// Resistration Tab Handle

	public void TabHandle() throws InterruptedException {
		NewUserResistration().click();
		Thread.sleep(200);
		String parent = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String child = itr.next();
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
	}
	
	
	
	
	By LableCpatchaMsg = By.id("lblCapMsg");

	public WebElement LableCpatchaMsg() {
		return driver.findElement(LableCpatchaMsg);
	}
	
	By close = By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/button");

	public WebElement Close() {
		return driver.findElement(close);
	}
	
	By Bryes = By.id("rbtnIBYes");

	public WebElement BrochureYes() {
		return driver.findElement(Bryes);
	}
	
	By Brno = By.id("rbtnIBNo");

	public WebElement BrochureNo() {
		return driver.findElement(Brno);
	}
	
	By course = By.id("ddlCourse");

	public void SelectCourse(String c) {
		Select x = new Select(driver.findElement(course));
		x.selectByVisibleText(c);
	}
	
	
	
	By OtherSelectcourse = By.id("ddlCourse");

	public WebElement Othercourse() {
		return driver.findElement(OtherSelectcourse);
	}
	
	
	
	
	
	

}
