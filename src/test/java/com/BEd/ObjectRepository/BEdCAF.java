package com.BEd.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BEdCAF {

	WebDriver driver;

	public BEdCAF(WebDriver driver) {

		this.driver = driver;
	}
	
	By LogOut = By.xpath("//*[@id='navbar-container']/div[2]/ul/li[2]/a/i");

	public WebElement LogOut() {
		return driver.findElement(LogOut);
	}

	By MsgCapture = By.id("popup_message");

	public WebElement PopUpMessage() {
		return driver.findElement(MsgCapture);
	}

	By MsgHandle = By.id("popup_ok");

	public WebElement PopUpMessageHandle() {
		return driver.findElement(MsgHandle);
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

	public void ScrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)");
	}

	public void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window. scrollBy(0,250)", "");
	}

	public void MouseOverClick(String Data) {
		Actions action1 = new Actions(driver);
		WebElement we = driver.findElement(By.id(Data));
		action1.moveToElement(we).click().perform();
	}

	// Applicant Details

	By applicanttype = By.id("ddlApplicantType");

	public void ApplicantType(String ap) {
		Select x = new Select(driver.findElement(applicanttype));
		x.selectByVisibleText(ap);
	}

	By board = By.id("ddlBoard");

	public void TenthBoard(String br) {
		Select x = new Select(driver.findElement(board));
		x.selectByVisibleText(br);
	}
	
	By br = By.id("ddlBoard");

	public WebElement Board() {
		return driver.findElement(br);
	}

	By yop10 = By.id("ddlYearOfPassing");

	public void TenthYOP(String y1) {
		Select x = new Select(driver.findElement(yop10));
		x.selectByVisibleText(y1);
	}
	
	By yop = By.id("ddlYearOfPassing");

	public WebElement YOP() {
		return driver.findElement(yop);
	}

	By annual = By.id("rbtnAnnual");

	public WebElement Annual() {
		return driver.findElement(annual);
	}

	By supplementary = By.id("rbtnSuppl");

	public WebElement Supplementary() {
		return driver.findElement(supplementary);
	}

	By passed = By.id("rbtnPassed");

	public WebElement GraduationPassed() {
		return driver.findElement(passed);
	}

	By appeared = By.id("rbtnAppered");

	public WebElement GraduationAppeared() {
		return driver.findElement(appeared);
	}

	By RollNumber = By.id("txtRollNo");

	public WebElement TenthRollNo() {
		return driver.findElement(RollNumber);
	}

	By ApplicantName = By.id("txtName");

	public WebElement ApplicantName() {
		return driver.findElement(ApplicantName);
	}

	By MotherName = By.id("txtMotherName");

	public WebElement MotherName() {
		return driver.findElement(MotherName);
	}

	By FatherName = By.id("txtFatherName");

	public WebElement FatherSpouseGuardianName() {
		return driver.findElement(FatherName);
	}

	By gender = By.id("ddlGender");

	public void Gender(String Gen) {
		Select x = new Select(driver.findElement(gender));
		x.selectByVisibleText(Gen);
	}
	
	

	public void ValidDateOfBirth() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='10-Nov-1992'");

	}

	By dob = By.id("txtDOB");

	public WebElement DOB() {
		return driver.findElement(dob);
	}
	
	By SelectDate = By.xpath("//td[@class='day'][contains(text(),'7')]");

	public WebElement SelectDate() {

		return driver.findElement(SelectDate);
	}

	// Male DOB

	public void MaleBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1992'");

	}

	public void MaleBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1992'");

	}

	public void MaleBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1992'");

	}

	// PWD Male DOB

	public void PWDMaleBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1982'");

	}

	public void PWDMaleBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1982'");

	}

	public void PWDMaleBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1982'");

	}

	// Female DOB

	public void FemaleBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1987'");

	}

	public void FemaleBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1987'");

	}

	public void FemaleBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1987'");

	}

	// PWD Female DOB

	public void PWDFemaleBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1982'");

	}

	public void PWDFemaleBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1982'");

	}

	public void PWDFemaleBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1982'");

	}

	// Transgender DOB

	public void TransgenderBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1992'");

	}

	public void TransgenderBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1992'");

	}

	public void TransgenderBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1992'");

	}

	// PWD Transgender DOB

	public void PWDTransgenderBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='29-Aug-1982'");

	}

	public void PWDTransgenderBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1982'");

	}

	public void PWDTransgenderBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1982'");

	}

	// SCST DOB

	public void SCSTBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1987'");

	}

	public void SCSTBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1987'");

	}

	public void SCSTBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1987'");

	}

	// PWD SCST DOB

	public void PWDSCSTBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1982'");

	}

	public void PWDSCSTBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1982'");

	}

	public void PWDSCSTBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1982'");

	}

	// SEBC MALE DOB

	public void SEBCMaleBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1987'");

	}

	public void SEBCMaleBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1987'");

	}

	public void SEBCMaleBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1987'");

	}

	// PWD SEBCMale DOB

	public void PWDSEBCMaleBornBefore() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='30-Aug-1982'");

	}

	public void PWDSEBCMaleBornOn() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='31-Aug-1982'");

	}

	public void PWDSEBCMaleBornAfter() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='01-Sep-1982'");

	}

	By Email = By.id("txtEmail");

	public WebElement Email() {
		return driver.findElement(Email);
	}

	By AadhaarNumber = By.id("txtAadharNo");

	public WebElement AadhaarNumber() {
		return driver.findElement(AadhaarNumber);
	}

	By MobileNumber = By.id("txtMobileNo");

	public WebElement MobileNumber() {
		return driver.findElement(MobileNumber);
	}

	By AlternateMobileNumber = By.id("txtAltMobileNo");

	public WebElement AlternateMobileNumber() {
		return driver.findElement(AlternateMobileNumber);
	}

	By soc = By.id("ddlSoicalCategory");

	public void SocialCategory(String socc) {
		Select x = new Select(driver.findElement(soc));
		x.selectByVisibleText(socc);
	}

	By Reserve = By.id("ddlReserveCategory");

	public void ReserveCategory(String Res) {
		Select x = new Select(driver.findElement(Reserve));
		x.selectByVisibleText(Res);
	}

	// PH

	By UDID = By.id("txtUDIDNo");

	public WebElement UDIDNumber() {
		return driver.findElement(UDID);
	}

	By scribeyes = By.id("rbtnScribeYes");

	public WebElement ScribeNeeded() {
		return driver.findElement(scribeyes);
	}

	By scribeno = By.id("rbtnScribeNo");

	public WebElement ScribeNotNeeded() {
		return driver.findElement(scribeno);
	}

	By disabilitytype = By.id("ddlDisablity");

	public void DisabilityType(String dt) {
		Select x = new Select(driver.findElement(disabilitytype));
		x.selectByVisibleText(dt);
	}

	By disabperc = By.id("txtDisabilityPer");

	public WebElement DisabilityPercent() {
		return driver.findElement(disabperc);
	}

	By locomotor = By.id("ddlLOcmotType");

	public void LocomotorDisability(String loco) {
		Select x = new Select(driver.findElement(locomotor));
		x.selectByVisibleText(loco);
	}

	By rajyasainikyes = By.id("rbtnSanikYes");

	public WebElement RajyaSainikYes() {
		return driver.findElement(rajyasainikyes);
	}

	By rajyasainikno = By.id("rbtnSainikNo");

	public WebElement RajyaSainikNO() {
		return driver.findElement(rajyasainikno);
	}

	By gcyes = By.id("rbtnGCYes");

	public WebElement GreenCardYes() {
		return driver.findElement(gcyes);
	}

	By gcno = By.id("rbtnGCNo");

	public WebElement GreenCardNo() {
		return driver.findElement(gcno);
	}

	By sports = By.id("ddlSportsCategory");

	public void SportsCategory(String sp) {
		Select x = new Select(driver.findElement(sports));
		x.selectByVisibleText(sp);
	}

	By maritalstat = By.id("ddlMaritalStatus");

	public void MaritalStatus(String ms) {
		Select x = new Select(driver.findElement(maritalstat));
		x.selectByVisibleText(ms);
	}

	By quota = By.id("ddlQuota");

	public void Quota(String q) {
		Select x = new Select(driver.findElement(quota));
		x.selectByVisibleText(q);
	}
	
	// Present Address

	By prAddress = By.id("txtPrAddress1");

	public WebElement AddressLine1() {
		return driver.findElement(prAddress);
	}

	By prAdd = By.id("txtPrAddress2");

	public WebElement AddressLine2() {
		return driver.findElement(prAdd);
	}

	By prstate = By.id("ddlPrState");

	public void PresentState(String St) {
		Select x = new Select(driver.findElement(prstate));
		x.selectByVisibleText(St);
	}

	By prdistrict = By.id("ddlPrDistrict");

	public void PresentDistrict(String Dis) {
		Select x = new Select(driver.findElement(prdistrict));
		x.selectByVisibleText(Dis);
	}

	By prPin = By.id("txtPrPIN");

	public WebElement PresentPinCode() {
		return driver.findElement(prPin);
	}

	By same = By.id("chkSameAsPresent");

	public WebElement SameAsPresent() {
		return driver.findElement(same);
	}

	// Permanent Address

	By perAddress = By.id("txtPeAddress1");

	public WebElement PermanentAddressLine1() {
		return driver.findElement(perAddress);
	}

	By perAdd = By.id("txtPeAddress2");

	public WebElement PermanentAddressLine2() {
		return driver.findElement(perAdd);
	}

	By perstate = By.id("ddlPeState");

	public void PermanentState(String pSt) {
		Select x = new Select(driver.findElement(perstate));
		x.selectByVisibleText(pSt);
	}

	By perdistrict = By.id("ddlPeDistrict");

	public void PermanentDistrict(String pDis) {
		Select x = new Select(driver.findElement(perdistrict));
		x.selectByVisibleText(pDis);
	}

	By perPin = By.id("txtPePIN");

	public WebElement PermanentPinCode() {
		return driver.findElement(perPin);
	}

	// Odia Validation

	By odiayes = By.id("rbtnOdiaYes");

	public WebElement OdiaStudied() {
		return driver.findElement(odiayes);
	}

	By odiano = By.id("rbtnOdiaNo");

	public WebElement OdiaNotStudied() {
		return driver.findElement(odiano);
	}

	// Stream

	By stream = By.id("ddlStream");

	public void Stream(String str) {
		Select x = new Select(driver.findElement(stream));
		x.selectByVisibleText(str);
	}
	
	By hons = By.id("ddlPreferenceType");

	public void HonsOrPreference(String hp) {
		Select x = new Select(driver.findElement(hons));
		x.selectByVisibleText(hp);
	}
	
	By sub1 = By.id("ddlSubject1");

	public void Subject1(String s1) {
		Select x = new Select(driver.findElement(sub1));
		x.selectByVisibleText(s1);
	}
	
	By sub2 = By.id("ddlSubject2");

	public void Subject2(String s2) {
		Select x = new Select(driver.findElement(sub2));
		x.selectByVisibleText(s2);
	}
	
	By sub3 = By.id("ddlSubject3");

	public void Subject3(String s3) {
		Select x = new Select(driver.findElement(sub3));
		x.selectByVisibleText(s3);
	}
	
	By s1 = By.id("ddlSubject1");

	public WebElement Sub1() {
		return driver.findElement(s1);
	}
	
	By s2 = By.id("ddlSubject2");

	public WebElement Sub2() {
		return driver.findElement(s2);
	}
	
	By s3 = By.id("ddlSubject3");

	public WebElement Sub3() {
		return driver.findElement(s3);
	}
	
	By lyes = By.id("RadioButton1");

	public WebElement LateralYes() {
		return driver.findElement(lyes);
	}

	By lno = By.id("RadioButton2");

	public WebElement LateralNo() {
		return driver.findElement(lno);
	}

	// Educational Qualifications
	
	By Tenthex = By.id("ddl10th");

	public void TenthExamType(String tene) {
		Select x = new Select(driver.findElement(Tenthex));
		x.selectByVisibleText(tene);
	}
	
	By Tenth = By.id("ddl10th");

	public void TenthExamPassed(String ten) {
		Select x = new Select(driver.findElement(Tenth));
		x.selectByVisibleText(ten);
	}

	By Twelth = By.id("ddlPlusTwo");

	public void TwelthExamPassed(String twe) {
		Select x = new Select(driver.findElement(Twelth));
		x.selectByVisibleText(twe);
	}
	
	By graduation = By.id("ddlGraduation");

	public void GraduationExamPassed(String grad) {
		Select x = new Select(driver.findElement(graduation));
		x.selectByVisibleText(grad);
	}
		
	By pgraduation = By.id("ddlBED");

	public void PGExamPassed(String pgrad) {
		Select x = new Select(driver.findElement(pgraduation));
		x.selectByVisibleText(pgrad);
	}

	By Twelthb = By.id("ddlPlusTwoBoard");

	public void TwelthBoard(String tweb) {
		Select x = new Select(driver.findElement(Twelthb));
		x.selectByVisibleText(tweb);
	}

	By Twelthyop = By.id("ddlPlusTwoYearOfPassing");

	public void TwelthYOP(String twey) {
		Select x = new Select(driver.findElement(Twelthyop));
		x.selectByVisibleText(twey);
	}

	By Twelthroll = By.id("txtPlusTwoRollNo");

	public WebElement TwelthRollNo() {
		return driver.findElement(Twelthroll);
	}
	
	By gradb = By.id("ddlGraduationBoard");

	public void GraduationBoard(String gb) {
		Select x = new Select(driver.findElement(gradb));
		x.selectByVisibleText(gb);
	}

	By gradyop = By.id("ddlGraduationYearofPassing");

	public void GraduationYOP(String grady) {
		Select x = new Select(driver.findElement(gradyop));
		x.selectByVisibleText(grady);
	}

	By gradroll = By.id("txtGraduationRollNo");

	public WebElement GraduationRollNo() {
		return driver.findElement(gradroll);
	}
	
	By pgradb = By.id("ddlBEDBoard");

	public void PGBoard(String pgb) {
		Select x = new Select(driver.findElement(pgradb));
		x.selectByVisibleText(pgb);
	}

	By pgradyop = By.id("ddlYearOfPassingBED");

	public void PGYOP(String pgy) {
		Select x = new Select(driver.findElement(pgradyop));
		x.selectByVisibleText(pgy);
	}

	By pgroll = By.id("txtBEDRollNo");

	public WebElement PGRollNo() {
		return driver.findElement(pgroll);
	}

	By TenthMaxMark = By.id("txtMaxMarkMatric");

	public WebElement TenthMaxMark() {
		return driver.findElement(TenthMaxMark);
	}

	By TwelthMaxMark = By.id("txtMaxMarkPlusTwo");

	public WebElement TwelthMaxMark() {
		return driver.findElement(TwelthMaxMark);
	}
	
	By GradMaxMark = By.id("txtMaxMarkGraduation");

	public WebElement GraduationMaxMark() {
		return driver.findElement(GradMaxMark);
	}
	
	By PGMaxMark = By.id("txtMaxMarkBED");

	public WebElement PGMaxMark() {
		return driver.findElement(PGMaxMark);
	}

	By TenthObtMark = By.id("txtMarkObtainedMatric");

	public WebElement TenthObtainedMark() {
		return driver.findElement(TenthObtMark);
	}

	By TwelthObtMark = By.id("txtMarkObtainedPlusTwo");

	public WebElement TwelthObtainedMark() {
		return driver.findElement(TwelthObtMark);
	}
	
	By GradObtMark = By.id("txtMarkObtainedGraduation");

	public WebElement GraduationObtainedMark() {
		return driver.findElement(GradObtMark);
	}
	
	By PGObtMark = By.id("txtMarkObtainedBED");

	public WebElement PGObtainedMark() {
		return driver.findElement(PGObtMark);
	}

	By declaration = By.id("chkSelect");

	public WebElement DeclarationCheck() {
		return driver.findElement(declaration);
	}
	
	By save = By.id("btnsaveAsDraft");

	public WebElement SaveAsDraft() {
		return driver.findElement(save);
	}
	
	By submit = By.id("btnSave");

	public WebElement Submit() {
		return driver.findElement(submit);
	}
	
	By cancel = By.id("btnCancel");

	public WebElement Cancel() {
		return driver.findElement(cancel);
	}
	
	By confirm = By.id("btnConfirm");

	public WebElement Confirm() {
		return driver.findElement(confirm);
	}
	
	By btm = By.id("btnBackToModify");

	public WebElement BackToModify() {
		return driver.findElement(btm);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	By LableApplicantType = By.id("lblApplicantType");

	public WebElement LableApplicantType() {
		return driver.findElement(LableApplicantType);
	}
	
	
	By LableApplicantName = By.id("lblApplicantName");

	public WebElement LableApplicantName() {
		return driver.findElement(LableApplicantName);
	}
	
	
	By LableMotherName = By.id("lblMotherName");

	public WebElement LableMotherName() {
		return driver.findElement(LableMotherName);
	}
	
	
	By LableFatherName = By.id("lblFatherName");

	public WebElement LableFatherName() {
		return driver.findElement(LableFatherName);
	}
	
	
	
	By LableGender = By.id("lblGender");

	public WebElement LableGender() {
		return driver.findElement(LableGender);
	}
	
	
	By LableAadhar = By.id("lblAadharNo");

	public WebElement LableAadhar() {
		return driver.findElement(LableAadhar);
	}
	
	
	By LableSocialCategory = By.id("lblSocialCategory");

	public WebElement LableSocialCategory() {
		return driver.findElement(LableSocialCategory);
	}
	
	
	By LableAltMobileNumber = By.id("lblAltMobileNo");

	public WebElement LableAltMobileNumber() {
		return driver.findElement(LableAltMobileNumber);
	}
	
	
	By LableMartialStatus = By.id("lblMaritalStatus");

	public WebElement LableMartialStatus() {
		return driver.findElement(LableMartialStatus);
	}
	
	By lblReserveCategory = By.id("lblReserveCategory");

	public WebElement lblReserveCategory() {
		return driver.findElement(lblReserveCategory);
	}
	
	By lblEmail = By.id("lblEmail");

	public WebElement lblEmail() {
		return driver.findElement(lblEmail);
	}
	
	By lblMobileNo = By.id("lblMobileNo");

	public WebElement lblMobileNo() {
		return driver.findElement(lblMobileNo);
	}
	
	By LableQuota = By.id("lblQuota");

	public WebElement LableQuota() {
		return driver.findElement(LableQuota);
	}
	
	
	By LablePresentAddress1 = By.id("lblAddress1C");

	public WebElement LablePresentAddress1() {
		return driver.findElement(LablePresentAddress1);
	}
	
	By LablePresentAddress2 = By.id("lblAddress2C");

	public WebElement LablePresentAddress2() {
		return driver.findElement(LablePresentAddress2);
	}
	
	
	By LableCountry = By.id("lblCountryC");

	public WebElement LableCountry() {
		return driver.findElement(LableCountry);
	}
	
	
	By LableState = By.id("lblStateC");

	public WebElement LableState() {
		return driver.findElement(LableState);
	}
	
	
	By LableDistrict = By.id("lblDistrictC");

	public WebElement LableDistrict() {
		return driver.findElement(LableDistrict);
	}
	
	
	By LablePinCde = By.id("lblPINC");

	public WebElement LablePinCde() {
		return driver.findElement(LablePinCde);
	}
	
	By AltMobileNumber = By.id("txtAltMobileNo");

	public WebElement AltMobileNumber() {
		return driver.findElement(AltMobileNumber);
	}
	
	
	By LableTenthExam = By.id("grdQualification_ctl02_lblExamName");

	public WebElement LableTenthExam() {
		return driver.findElement(LableTenthExam);
	}
	
	
	By LableTenthBoard = By.id("grdQualification_ctl02_lblBoard");

	public WebElement LableTenthBoard() {
		return driver.findElement(LableTenthBoard);
	}
	
	By LableExamType = By.id("grdQualification_ctl02_lblExamtype");

	public WebElement LableExamType() {
		return driver.findElement(LableExamType);
	}
	
	By LableTenthRoll = By.id("grdQualification_ctl02_lblRollNo");

	public WebElement LableTenthRoll() {
		return driver.findElement(LableTenthRoll);
	}
	
	By LableYOP = By.id("grdQualification_ctl02_lblYearOfPassing");

	public WebElement LableYOP() {
		return driver.findElement(LableYOP);
	}
	
	By LableMaxMark = By.id("grdQualification_ctl02_lblMaximumMark");

	public WebElement LableMaxMark() {
		return driver.findElement(LableMaxMark);
	}
	
	By LableSecMark = By.id("grdQualification_ctl02_lblMarkObtained");

	public WebElement LableSecMark() {
		return driver.findElement(LableSecMark);
	}
	
	
	By LableTwelthExam = By.id("grdQualification_ctl03_lblExamName");

	public WebElement LableTwelthExam() {
		return driver.findElement(LableTwelthExam);
	}
	
	
	By LableTwelthBoard = By.id("grdQualification_ctl03_lblBoard");

	public WebElement LableTwelthBoard() {
		return driver.findElement(LableTwelthBoard);
	}
	
	By LableTwelthExamType = By.id("grdQualification_ctl03_lblExamtype");

	public WebElement LableTwelthExamType() {
		return driver.findElement(LableTwelthExamType);
	}
	
	By LableTwelthRoll = By.id("grdQualification_ctl03_lblRollNo");

	public WebElement LableTwelthRoll() {
		return driver.findElement(LableTwelthRoll);
	}
	
	By LableTwelthYOP = By.id("grdQualification_ctl03_lblYearOfPassing");

	public WebElement LableTwelthYOP() {
		return driver.findElement(LableTwelthYOP);
	}
	
	By LableTwelthMaxMark = By.id("grdQualification_ctl03_lblMaximumMark");

	public WebElement LableTwelthMaxMark() {
		return driver.findElement(LableTwelthMaxMark);
	}
	
	By LableTwelthSecMark = By.id("grdQualification_ctl03_lblMarkObtained");

	public WebElement LableTwelthSecMark() {
		return driver.findElement(LableTwelthSecMark);
	}
	
	
	By LableStream = By.id("lblStream");

	public WebElement LableStream() {
		return driver.findElement(LableStream);
	}
	
	By lblPreferenceType = By.id("lblPreferenceType");

	public WebElement lblPreferenceType() {
		return driver.findElement(lblPreferenceType);
	}
	
	By lblSubject1 = By.id("lblSubject1");

	public WebElement lblSubject1() {
		return driver.findElement(lblSubject1);
	}
	
	
	By lblSubject2 = By.id("lblSubject2");

	public WebElement lblSubject2() {
		return driver.findElement(lblSubject2);
	}
	
	
	By lblSubject3 = By.id("lblSubject3");

	public WebElement lblSubject3() {
		return driver.findElement(lblSubject3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	By LableGraduationExam = By.id("grdQualification_ctl04_lblExamName");

	public WebElement LableGraduationExam() {
		return driver.findElement(LableGraduationExam);
	}
	
	
	By LableGraduationBoard = By.id("grdQualification_ctl04_lblBoard");

	public WebElement LableGraduationBoard() {
		return driver.findElement(LableGraduationBoard);
	}
	
	By LableGraduationExamType = By.id("grdQualification_ctl04_lblExamtype");

	public WebElement LableGraduationExamType() {
		return driver.findElement(LableGraduationExamType);
	}
	
	By LableGraduationRoll = By.id("grdQualification_ctl04_lblRollNo");

	public WebElement LableGraduationRoll() {
		return driver.findElement(LableGraduationRoll);
	}
	
	By LableGraduationYOP = By.id("grdQualification_ctl04_lblYearOfPassing");

	public WebElement LableGraduationYOP() {
		return driver.findElement(LableGraduationYOP);
	}
	
	By LableGraduationMaxMark = By.id("grdQualification_ctl04_lblMaximumMark");

	public WebElement LableGraduationMaxMark() {
		return driver.findElement(LableGraduationMaxMark);
	}
	
	By LableGraduationSecMark = By.id("grdQualification_ctl04_lblMarkObtained");

	public WebElement LableGraduationSecMark() {
		return driver.findElement(LableGraduationSecMark);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	By LablePGExam = By.id("grdQualification_ctl05_lblExamName");

	public WebElement LablePGExam() {
		return driver.findElement(LablePGExam);
	}
	
	
	By LablePGBoard = By.id("grdQualification_ctl05_lblBoard");

	public WebElement LablePGBoard() {
		return driver.findElement(LablePGBoard);
	}
	
	By LablePGExamType = By.id("grdQualification_ctl05_lblExamtype");

	public WebElement LablePGExamType() {
		return driver.findElement(LablePGExamType);
	}
	
	By LablePGRoll = By.id("grdQualification_ctl05_lblRollNo");

	public WebElement LablePGRoll() {
		return driver.findElement(LablePGRoll);
	}
	
	By LablePGYOP = By.id("grdQualification_ctl05_lblYearOfPassing");

	public WebElement LablePGYOP() {
		return driver.findElement(LablePGYOP);
	}
	
	By LablePGMaxMark = By.id("grdQualification_ctl05_lblMaximumMark");

	public WebElement LablePGMaxMark() {
		return driver.findElement(LablePGMaxMark);
	}
	
	By LablePGSecMark = By.id("grdQualification_ctl05_lblMarkObtained");

	public WebElement LablePGSecMark() {
		return driver.findElement(LablePGSecMark);
	}

}