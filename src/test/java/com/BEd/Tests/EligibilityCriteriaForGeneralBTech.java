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

public class EligibilityCriteriaForGeneralBTech extends BaseClass implements BEdData {

	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";
	int rowCount = constants.fileone.getRowCount(sheetName);

	@Test(priority = 0)
	public void Login() throws Exception {

		BEdLogin login = new BEdLogin(driver);

		BrowserFactoryNew bc = new BrowserFactoryNew();
		bc.Login(MobileNumberBtechG, Password);
		Thread.sleep(3000);

		login.EditApplicationForm().click();
		Thread.sleep(1000);
		login.BrochureYes().click();
		Thread.sleep(1000);
		login.SelectCourse(SelectCourse2);
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void BtechWithMoreThan55Percentage() throws Exception {

		BEdCAF Form = new BEdCAF(driver);
		Thread.sleep(1000);
		Form.GraduationExamPassed(BtechExamName);
		Thread.sleep(1000);
		Form.GraduationBoard(BtechBoardName);
		Thread.sleep(1000);
		Form.GraduationYOP(BtechYOP);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Entering more than 55 percentage marks in Btech");
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

			constants.fileone.setCellData(sheetName, "Status", 21, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 21, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Are you sure you want to proceed ?");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully checked Btech With More Than 55 Percentage scenario");
	}

	@Test(priority = 6)
	public void BtechWithLessThan55Percentage() throws Exception {

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
		Form.GraduationExamPassed(BtechExamName);
		Thread.sleep(1000);
		Form.GraduationBoard(BtechBoardName);
		Thread.sleep(1000);
		Form.GraduationYOP(BtechYOP);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Entering less than 55 percentage marks in Btech");
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(SecuredMarkL50);
		Thread.sleep(1000);

		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("B.tech Percentage cannot be less than 55")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 22, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 22, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "B.tech Percentage cannot be less than 55");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully checked Btech With less than 55 Percentage scenario");
	}

}