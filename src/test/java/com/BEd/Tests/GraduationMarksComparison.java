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

public class GraduationMarksComparison extends BaseClass implements BEdData {

	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";
	int rowCount = constants.fileone.getRowCount(sheetName);

	@Test(priority = 0)
	public void Login() throws Exception {

		BEdLogin login = new BEdLogin(driver);

		BrowserFactoryNew bc = new BrowserFactoryNew();
		bc.Login(MobileNumber, Password);
		Thread.sleep(3000);

		login.EditApplicationForm().click();
		Thread.sleep(1000);
		login.BrochureYes().click();
		Thread.sleep(1000);
		login.SelectCourse(SelectCourse2);
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void ObtainedMarkIslessthanMaxMark() throws Exception {

		BEdCAF Form = new BEdCAF(driver);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Enter Obtained Mark Is less than MaxMark");
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

			constants.fileone.setCellData(sheetName, "Status", 4, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 4, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Are you sure you want to proceed ?");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully Checked Obtained Mark Is less than Max Mark scenario");

	}

	@Test(priority = 2)
	public void ObtainedMarkIsEqualToMaxMark() throws Exception {

		BEdLogin login = new BEdLogin(driver);
		Thread.sleep(3000);
		login.EditApplicationForm().click();
		Thread.sleep(1000);
		login.BrochureYes().click();
		Thread.sleep(1000);
		login.SelectCourse(SelectCourse2);
		Thread.sleep(1000);

		BEdCAF Form = new BEdCAF(driver);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Enter Obtained Mark Equal to Max Mark");
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(GradSecuredMarkEQ);

		Thread.sleep(1000);
		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("Are you sure you want to proceed ?")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 5, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 5, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Are you sure you want to proceed ?");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully Checked Obtained Mark Is Equal To Max Mark scenario");

	}

	@Test(priority = 3)
	public void ObtainedMarkIsGreaterThanMaxMark() throws Exception {

		BEdLogin login = new BEdLogin(driver);
		Thread.sleep(3000);
		login.EditApplicationForm().click();
		Thread.sleep(1000);
		login.BrochureYes().click();
		Thread.sleep(1000);
		login.SelectCourse(SelectCourse2);
		Thread.sleep(1000);

		BEdCAF Form = new BEdCAF(driver);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Enter Obtained Mark greater than Max Mark");
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(GradSecuredMarkG);

		Thread.sleep(1000);
		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("Maximum Mark cannot be less than mark obtained")) {
			System.out.println(msg);
			Form.JavaAcceptAlert();
			Thread.sleep(600);
			Form.PopUpMessageHandle().click();

			constants.fileone.setCellData(sheetName, "Status", 3, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 3, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Maximum Mark cannot be less than mark obtained");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully Checked Obtained Mark Is Greater Than Max Mark scenario");

	}

}