package com.BEd.Tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BEd.GenericLibrary.constants;
import com.BEd.Listeners.ExtentFactory;
import com.BEd.ObjectRepository.BaseClass;
import com.BEd.browser.BrowserFactoryNew;
import com.BEd.ObjectRepository.BEdCAF;
import com.BEd.ObjectRepository.BEdData;
import com.BEd.ObjectRepository.BEdLogin;

public class EligibilityCriteriaForGeneralArts extends BaseClass implements BEdData {

	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";
	int rowCount = constants.fileone.getRowCount(sheetName);

	@Test(priority = 0)
	public void Login() throws Exception {

		BEdLogin login = new BEdLogin(driver);

		BrowserFactoryNew bc = new BrowserFactoryNew();
		bc.Login(MobileNumberArtsG, Password);
		Thread.sleep(3000);

		login.EditApplicationForm().click();
		Thread.sleep(1000);
		login.BrochureYes().click();
		Thread.sleep(1000);
		login.SelectCourse(SelectCourse2);
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void ArtsWithMoreThan50PercentageInGraduation() throws Exception {

		BEdCAF Form = new BEdCAF(driver);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Entering more than 50 percentage marks in Graduation");
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(GradSecuredMark);
		Thread.sleep(1000);

		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("Are you sure you want to proceed ?")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 17, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 17, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Are you sure you want to proceed ?");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully checked Arts With More Than 50 Percentage In Graduation scenario");
	}

	@Test(priority = 2)
	public void ArtsWithLessThan50PercentageInGraduation() throws Exception {

		BEdLogin login = new BEdLogin(driver);
		Thread.sleep(3000);
		login.EditApplicationForm().click();
		Thread.sleep(1000);
		login.BrochureYes().click();
		Thread.sleep(1000);
		login.SelectCourse(SelectCourse2);
		Thread.sleep(1000);

		BEdCAF Form = new BEdCAF(driver);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Entering less than 50 percentage marks");
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(SecuredMarkL50);
		Thread.sleep(1000);
		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("Please enter PG Details if you have secured less than 50 Percentage in Graduation")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 18, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 18, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg,
				"Please enter PG Details if you have secured less than 50 Percentage in Graduation");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully checked Arts With less than 50 Percentage In Graduation scenario");
	}

}