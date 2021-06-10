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

public class YOPComparisons12thGraduation extends BaseClass implements BEdData {

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
	public void YOPBetween12thAndGraduationWithValidData() throws Exception {

		BEdCAF Form = new BEdCAF(driver);
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().info("Entering valid YOP for Graduation");
		Form.GraduationYOP(GraduationYOP);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(GradSecuredMark);
		Thread.sleep(1000);
		Form.PGExamPassed(PGExamName);
		Thread.sleep(1000);
		Form.PGBoard(PGBoardName);
		Thread.sleep(1000);
		Form.PGYOP(PGYOP);
		Thread.sleep(1000);
		Form.PGRollNo().sendKeys(PGRollNumber);
		Thread.sleep(1000);
		Form.PGMaxMark().clear();
		Form.PGMaxMark().sendKeys(PGMaxMark);
		Thread.sleep(1000);
		Form.PGObtainedMark().clear();
		Form.PGObtainedMark().sendKeys(PGSecuredMark);
		Thread.sleep(1000);

		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("Are you sure you want to proceed ?")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 9, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 9, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Are you sure you want to proceed ?");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully Checked YOP Between 12th And Graduation with valid data scenario");

	}

	@Test(priority = 2)
	public void YOPBetween12thAndGraduationWithIdenticalData() throws Exception {

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
		ExtentFactory.getInstance().getExtent().info("Entering YOP for Graduation same as 12th");
		Form.GraduationYOP(TwelthYOP);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(GradSecuredMark);
		Thread.sleep(1000);
		Form.PGExamPassed(PGExamName);
		Thread.sleep(1000);
		Form.PGBoard(PGBoardName);
		Thread.sleep(1000);
		Form.PGYOP(PGYOP);
		Thread.sleep(1000);
		Form.PGRollNo().sendKeys(PGRollNumber);
		Thread.sleep(1000);
		Form.PGMaxMark().clear();
		Form.PGMaxMark().sendKeys(PGMaxMark);
		Thread.sleep(1000);
		Form.PGObtainedMark().clear();
		Form.PGObtainedMark().sendKeys(PGSecuredMark);
		Thread.sleep(1000);
		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("Graduation Year Of Passing should be 3 years after Plus Two Year Of Passing")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 10, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 10, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Graduation Year Of Passing should be 3 years after Plus Two Year Of Passing");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully Checked YOP Between 12th And Graduation with Identical data scenario");

	}

	@Test(priority = 3)
	public void YOPBetween12thAndGraduationWithInvalidData() throws Exception {

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
		ExtentFactory.getInstance().getExtent().info("Entering YOP for Graduation as less than 12th");
		Form.GraduationYOP(YOPLessThan12th);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(GradSecuredMark);
		Thread.sleep(1000);
		Form.PGExamPassed(PGExamName);
		Thread.sleep(1000);
		Form.PGBoard(PGBoardName);
		Thread.sleep(1000);
		Form.PGYOP(PGYOP);
		Thread.sleep(1000);
		Form.PGRollNo().sendKeys(PGRollNumber);
		Thread.sleep(1000);
		Form.PGMaxMark().clear();
		Form.PGMaxMark().sendKeys(PGMaxMark);
		Thread.sleep(1000);
		Form.PGObtainedMark().clear();
		Form.PGObtainedMark().sendKeys(PGSecuredMark);
		Thread.sleep(1000);
		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("Graduation Year Of Passing should be 3 years after Plus Two Year Of Passing")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 11, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 11, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Graduation Year Of Passing should be 3 years after Plus Two Year Of Passing");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent()
				.info("Successfully Checked YOP Between 12th And Graduation with Invalid data scenario");

	}

	@Test(priority = 2)
	public void YOPBetween12thAndGraduationWithDiffLessThan3years() throws Exception {

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
		ExtentFactory.getInstance().getExtent().info("Entering YOP with difference of less than a year");
		Form.GraduationYOP(YOPDiffLessThan3yr);
		Thread.sleep(1000);
		Form.GraduationRollNo().clear();
		Form.GraduationRollNo().sendKeys(GradRollNumber);
		Thread.sleep(1000);
		Form.GraduationMaxMark().clear();
		Form.GraduationMaxMark().sendKeys(GradMaxMark);
		Thread.sleep(1000);
		Form.GraduationObtainedMark().clear();
		Form.GraduationObtainedMark().sendKeys(GradSecuredMark);
		Thread.sleep(1000);
		Form.PGExamPassed(PGExamName);
		Thread.sleep(1000);
		Form.PGBoard(PGBoardName);
		Thread.sleep(1000);
		Form.PGYOP(PGYOP);
		Thread.sleep(1000);
		Form.PGRollNo().sendKeys(PGRollNumber);
		Thread.sleep(1000);
		Form.PGMaxMark().clear();
		Form.PGMaxMark().sendKeys(PGMaxMark);
		Thread.sleep(1000);
		Form.PGObtainedMark().clear();
		Form.PGObtainedMark().sendKeys(PGSecuredMark);
		Thread.sleep(1000);
		Form.Submit().click();
		Thread.sleep(600);

		String msg = Form.GetMsg();
		Thread.sleep(600);
		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");
		if (msg.equals("Graduation Year Of Passing should be 3 years after Plus Two Year Of Passing")) {
			System.out.println(msg);
			Form.JavaDismissAlert();

			constants.fileone.setCellData(sheetName, "Status", 12, "Pass");
		} else {
			constants.fileone.setCellData(sheetName, "Status", 12, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(msg, "Graduation Year Of Passing should be 3 years after Plus Two Year Of Passing");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent().info(
				"Successfully Checked YOP Between 12th And Graduation with Difference less than 2 years scenario");

	}

}