package com.BEd.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PrintCAF {

	WebDriver driver;

	public PrintCAF(WebDriver driver) {

		this.driver = driver;
	}

	By Course = By.id("lblCourse");

	public WebElement Course() {
		return driver.findElement(Course);
	}
	
	By ApplicantType = By.id("lblApplicantsType");

	public WebElement ApplicantType() {
		return driver.findElement(ApplicantType);
	}
	
	By ApplicantName = By.id("lblApplicantsName");

	public WebElement ApplicantName() {
		return driver.findElement(ApplicantName);
	}
	
	
	By MotherName = By.id("lblMothersName");

	public WebElement MotherName() {
		return driver.findElement(MotherName);
	}
	
	
	By FatherName = By.id("lblFathersName");

	public WebElement FatherName() {
		return driver.findElement(FatherName);
	}
	
	
	
	
	By Gender = By.id("lblGender");

	public WebElement Gender() {
		return driver.findElement(Gender);
	}
	
	
	
	By Email = By.id("lblEmail");

	public WebElement Email() {
		return driver.findElement(Email);
	}
	
	
	
	By MobileNumber = By.id("lblMobileNo");

	public WebElement MobileNumber() {
		return driver.findElement(MobileNumber);
	}
	
	
	
	By AlternateNumber = By.id("lblAlterMobNo");

	public WebElement AlternateNumber() {
		return driver.findElement(AlternateNumber);
	}
	
	
	
	By MartialStatus = By.id("lblMaritalStatus");

	public WebElement MartialStatus() {
		return driver.findElement(MartialStatus);
	}
	
	
	
	By Quota = By.id("lblQuota");

	public WebElement Quota() {
		return driver.findElement(Quota);
	}
	
	
	By HighSecondary = By.id("lblPassedAppeared");

	public WebElement HighSecondary() {
		return driver.findElement(HighSecondary);
	}
	
	
	By Address1 = By.id("lblCAddressLine1");

	public WebElement Address1() {
		return driver.findElement(Address1);
	}
	
	
	By Address2 = By.id("lblCAddressLine2");

	public WebElement Address2() {
		return driver.findElement(Address2);
	}
	
	
	By State = By.id("lblCState");

	public WebElement State() {
		return driver.findElement(State);
	}
	
	
	By District = By.id("lblCDistrict");

	public WebElement District() {
		return driver.findElement(District);
	}
	
	
	
	By PinCode = By.id("lblCPinCode");

	public WebElement PinCode() {
		return driver.findElement(PinCode);
	}
	
	
	
	By StreamName = By.id("lblStreamName");

	public WebElement StreamName() {
		return driver.findElement(StreamName);
	}
	
	
	//*[@id="grdQualification"]/tbody/tr[2]/td[1]
	

	
	By PrintCAF = By.partialLinkText("Print CAF");

	public WebElement PrintCAF() {
		return driver.findElement(PrintCAF);
	}
	
	
	By PrintButton = By.id("grdStrength_ctl02_btnPrint");

	public WebElement PrintButton() {
		return driver.findElement(PrintButton);
	}
	
	
	By ExamPassed = By.xpath("//*[@id='grdQualification']/tbody/tr[2]/td[1]");

	public WebElement ExamPassed() {
		return driver.findElement(ExamPassed);
	}
	
	
	By CollegeBoard = By.id("grdQualification_ctl02_lblBoard");

	public WebElement CollegeBoard() {
		return driver.findElement(CollegeBoard);
	}
	
	
	
	By ExamType = By.id("grdQualification_ctl02_lblExamtype");

	public WebElement ExamType() {
		return driver.findElement(ExamType);
	}
	
	
	
	By YOP = By.xpath("//*[@id='grdQualification']/tbody/tr[2]/td[4]");

	public WebElement YOP() {
		return driver.findElement(YOP);
	}
	
	
	
	By RollNumberr = By.xpath("//*[@id='grdQualification']/tbody/tr[2]/td[5]");

	public WebElement RollNumberr() {
		return driver.findElement(RollNumberr);
	}
	
	
	
	By MaxMark = By.xpath("//*[@id='grdQualification']/tbody/tr[2]/td[6]");

	public WebElement MaxMark() {
		return driver.findElement(MaxMark);
	}
	
	
	By SecMark = By.xpath("//*[@id='grdQualification']/tbody/tr[2]/td[7]");

	public WebElement SecMark() {
		return driver.findElement(SecMark);
	}
	
	
	
	
	
	
	
	
	
	
	//*[@id="grdQualification"]/tbody/tr[3]/td[1]
	
	
	
	
	By TwelthExamPassed = By.xpath("//*[@id='grdQualification']/tbody/tr[3]/td[1]");

	public WebElement TwelthExamPassed() {
		return driver.findElement(TwelthExamPassed);
	}
	
	
	By TwelthCollegeBoard = By.id("grdQualification_ctl03_lblBoard");

	public WebElement TwelthCollegeBoard() {
		return driver.findElement(TwelthCollegeBoard);
	}
	
	
	
	By TwelthExamType = By.id("grdQualification_ctl03_lblExamtype");

	public WebElement TwelthExamType() {
		return driver.findElement(TwelthExamType);
	}
	
	
	
	By TwelthYOP = By.xpath("//*[@id='grdQualification']/tbody/tr[3]/td[4]");

	public WebElement TwelthYOP() {
		return driver.findElement(TwelthYOP);
	}
	
	
	
	By TwelthRollNumberr = By.xpath("//*[@id='grdQualification']/tbody/tr[3]/td[5]");

	public WebElement TwelthRollNumberr() {
		return driver.findElement(TwelthRollNumberr);
	}
	
	
	
	By TwelthMaxMark = By.xpath("//*[@id='grdQualification']/tbody/tr[3]/td[6]");

	public WebElement TwelthMaxMark() {
		return driver.findElement(TwelthMaxMark);
	}
	
	
	By TwelthSecMark = By.xpath("//*[@id='grdQualification']/tbody/tr[3]/td[7]");

	public WebElement TwelthSecMark() {
		return driver.findElement(TwelthSecMark);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*[@id="grdQualification"]/tbody/tr[4]/td[1]
	
	
	
	By GraduationExamPassed = By.xpath("//*[@id='grdQualification']/tbody/tr[4]/td[1]");

	public WebElement GraduationExamPassed() {
		return driver.findElement(GraduationExamPassed);
	}
	
	
	By GraduationCollegeBoard = By.id("grdQualification_ctl04_lblBoard");

	public WebElement GraduationCollegeBoard() {
		return driver.findElement(GraduationCollegeBoard);
	}
	
	
	
	By GraduationExamType = By.id("grdQualification_ctl04_lblExamtype");

	public WebElement GraduationExamType() {
		return driver.findElement(GraduationExamType);
	}
	
	
	
	By GraduationYOP = By.xpath("//*[@id='grdQualification']/tbody/tr[4]/td[4]");

	public WebElement GraduationYOP() {
		return driver.findElement(GraduationYOP);
	}
	
	
	
	By GraduationRollNumberr = By.xpath("//*[@id='grdQualification']/tbody/tr[4]/td[5]");

	public WebElement GraduationRollNumberr() {
		return driver.findElement(GraduationRollNumberr);
	}
	
	
	
	By GraduationMaxMark = By.xpath("//*[@id='grdQualification']/tbody/tr[4]/td[6]");

	public WebElement GraduationMaxMark() {
		return driver.findElement(GraduationMaxMark);
	}
	
	
	By GraduationSecMark = By.xpath("//*[@id='grdQualification']/tbody/tr[4]/td[7]");

	public WebElement GraduationSecMark() {
		return driver.findElement(GraduationSecMark);
	}
	
	
	
	
	By PGExamPassed = By.xpath("//*[@id='grdQualification']/tbody/tr[5]/td[1]");

	public WebElement PGExamPassed() {
		return driver.findElement(PGExamPassed);
	}
	
	
	By PGCollegeBoard = By.id("grdQualification_ctl05_lblBoard");

	public WebElement PGCollegeBoard() {
		return driver.findElement(PGCollegeBoard);
	}
	
	
	
	By PGExamType = By.id("grdQualification_ctl05_lblExamtype");

	public WebElement PGExamType() {
		return driver.findElement(PGExamType);
	}
	
	
	
	By PGYOP = By.xpath("//*[@id='grdQualification']/tbody/tr[5]/td[4]");

	public WebElement PGYOP() {
		return driver.findElement(PGYOP);
	}
	
	
	
	By PGRollNumberr = By.xpath("//*[@id='grdQualification']/tbody/tr[5]/td[5]");

	public WebElement PGRollNumberr() {
		return driver.findElement(PGRollNumberr);
	}
	
	
	
	By PGMaxMark = By.xpath("//*[@id='grdQualification']/tbody/tr[5]/td[6]");

	public WebElement PGMaxMark() {
		return driver.findElement(PGMaxMark);
	}
	
	
	By PGSecMark = By.xpath("//*[@id='grdQualification']/tbody/tr[5]/td[7]");

	public WebElement PGSecMark() {
		return driver.findElement(PGSecMark);
	}
	
	
	
	
	
	
	
	
	
}