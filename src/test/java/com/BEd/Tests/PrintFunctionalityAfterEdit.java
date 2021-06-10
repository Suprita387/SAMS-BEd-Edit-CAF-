package com.BEd.Tests;

import java.util.Iterator;

import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import com.BEd.GenericLibrary.constants;
import com.BEd.ObjectRepository.BaseClass;

import com.BEd.ObjectRepository.PrintCAF;
import com.BEd.browser.BrowserFactoryNew;
import com.BEd.ObjectRepository.BEdData;

public class PrintFunctionalityAfterEdit extends BaseClass implements BEdData {

	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";
	int rowCount = constants.fileone.getRowCount(sheetName);

	@Test(priority = 0)
	public void Login() throws Exception {

		PrintCAF Form = new PrintCAF(driver);

		BrowserFactoryNew bc = new BrowserFactoryNew();
		bc.Login(MobileNumberAfterPrint, Password);
		Thread.sleep(3000);

		Form.PrintCAF().click();
		Thread.sleep(300);
		Form.PrintButton().click();

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

	@Test(priority = 1)
	public void PrintFunctionality() throws Exception {

		PrintCAF Print = new PrintCAF(driver);
		Thread.sleep(1000);

		String Course = Print.Course().getText();
		String ApplicantType = Print.ApplicantType().getText();
		String Name = Print.ApplicantName().getText();
		String MotherNamee = Print.MotherName().getText();
		String FatherNamee = Print.FatherName().getText();
		String Genderr = Print.Gender().getText();
		String Emaill = Print.Email().getText();
		String MobNo = Print.MobileNumber().getText();
		String AlternateMobNoo = Print.AlternateNumber().getText();
		String MartialStatuss = Print.MartialStatus().getText();
		String Quotaa = Print.Quota().getText();
		String HigherSecondaryy = Print.HighSecondary().getText();
		String Addresss1 = Print.Address1().getText();
		String Addresss2 = Print.Address2().getText();
		String Statee = Print.State().getText();
		String Districtt = Print.District().getText();
		String PinCodee = Print.PinCode().getText();
		String Streamm = Print.StreamName().getText();
		String Exam = Print.ExamPassed().getText();
		String CollegeBoard = Print.CollegeBoard().getText();
		String ExamType = Print.ExamType().getText();
		String YOP = Print.YOP().getText();
		String RollNo = Print.RollNumberr().getText();
		String Max = Print.MaxMark().getText();
		String Sec = Print.SecMark().getText();

		String TwelthExam = Print.TwelthExamPassed().getText();
		String TwelthCollegeBoard = Print.TwelthCollegeBoard().getText();
		String TwelthExamType = Print.TwelthExamType().getText();
		String TwelthYOPP = Print.TwelthYOP().getText();
		String TwelthRollNo = Print.TwelthRollNumberr().getText();
		String TwelthMax = Print.TwelthMaxMark().getText();
		String TwelthSec = Print.TwelthSecMark().getText();

		String GraduationExam = Print.GraduationExamPassed().getText();
		String GraduationCollegeBoard = Print.GraduationCollegeBoard().getText();
		String GraduationExamType = Print.GraduationExamType().getText();
		String GraduationYOPP = Print.GraduationYOP().getText();
		String GraduationRollNo = Print.GraduationRollNumberr().getText();
		String GraduationMax = Print.GraduationMaxMark().getText();
		String GraduationSec = Print.GraduationSecMark().getText();

			if (Course.equalsIgnoreCase(SelectCourse2) && ApplicantType.equalsIgnoreCase(ApplicantType1)
				&& Name.equals(ApplicantName) && MotherNamee.equals(MotherName) && FatherNamee.equals(FatherName)
				&& Genderr.equalsIgnoreCase(GenderF) && Emaill.equals("test@gmail.com")
				&& MobNo.equals("8249816017")
				&& MartialStatuss.equalsIgnoreCase("UNMARRIED") && Quotaa.equalsIgnoreCase(QuotaS)
				&& HigherSecondaryy.equals("Passed") && Addresss1.equals(Add1) && Addresss2.equals(Add2)
				&& Statee.equalsIgnoreCase(StateO) && Districtt.equalsIgnoreCase(District1) && PinCodee.equals(Pincode)
				&& Streamm.equals(StreamNameS) && Exam.equalsIgnoreCase("10th")
				&& CollegeBoard.equalsIgnoreCase(TenthBoard) && ExamType.equals("Annual") && YOP.equals(TenthYOP)
				&& RollNo.equals("123DEF456") && Max.equals(TenthMaxMark) && Sec.equals("450")
				&& TwelthExam.equalsIgnoreCase("+2") && TwelthCollegeBoard.equalsIgnoreCase(TwelthBoardName)
				&& TwelthExamType.equals("Annual") && TwelthYOPP.equals(TwelthYOP) && TwelthRollNo.equals("ABHU5678")
				&& TwelthMax.equals(TenthMaxMark) && TwelthSec.equals("425")
				&& GraduationExam.equalsIgnoreCase("Graduation")
				&& GraduationCollegeBoard.equalsIgnoreCase(GraduationBoardName) && GraduationExamType.equals("Annual")
				&& GraduationYOPP.equals(GraduationYOP) && GraduationRollNo.equals("VGYU7789")
				&& GraduationMax.equals(TenthMaxMark) && GraduationSec.equals("450")) {
			System.out.println("All Data Displayed");
			constants.fileone.setCellData(sheetName, "Status", 47, "Pass");

		} else {
			System.out.println(Course + ApplicantType + Name + MotherNamee + FatherNamee + Genderr + Emaill + MobNo
					 + MartialStatuss + Quotaa + HigherSecondaryy + Addresss1 + Addresss2 + Statee
					+ Districtt);
			constants.fileone.setCellData(sheetName, "Status", 47, "Fail");
		}

	}

}