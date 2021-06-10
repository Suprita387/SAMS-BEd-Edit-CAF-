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

public class EligibilityCriteriaForSCBtech extends BaseClass implements BEdData {

	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";
	int rowCount = constants.fileone.getRowCount(sheetName);

	@Test(priority = 0)
	public void Login() throws Exception {

		BEdLogin login = new BEdLogin(driver);

		BrowserFactoryNew bc = new BrowserFactoryNew();
		bc.Login(MobileNumberBtechSC, Password);
		Thread.sleep(3000);

		login.EditApplicationForm().click();
		Thread.sleep(1000);
		login.BrochureYes().click();
		Thread.sleep(1000);
		login.SelectCourse(SelectCourse2);
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void BtechWithMoreThan50Percentage() throws Exception {

		BEdCAF Form = new BEdCAF(driver);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Entering more than 50 percentage marks in Btech");
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

			constants.fileone.setCellData(sheetName, "Status", 27, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 27, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Are you sure you want to proceed ?");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully checked Btech With More Than 50 Percentage scenario");
	}

	@Test(priority = 6)
	public void BtechWithLessThan50Percentage() throws Exception {

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
		ExtentFactory.getInstance().getExtent().info("Entering less than 50 percentage marks in Btech");
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(SecuredMarkL50);
		Thread.sleep(1000);

		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("B.tech Percentage cannot be less than 50")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 28, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 28, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "B.tech Percentage cannot be less than 50");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully checked Btech With less than 50 Percentage scenario");
	}

}