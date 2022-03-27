package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class PreencherFormulario {

	// Mapeamento Aba Vehicle
	@FindBy(id = "make")
	WebElement cmbox_make;

	@FindBy(id = "model")
	WebElement cmbox_model;

	@FindBy(id = "cylindercapacity")
	WebElement txt_cylindercapacity;

	@FindBy(id = "engineperformance")
	WebElement txt_engineperformance;

	@FindBy(id = "dateofmanufacture")
	WebElement date_dateofmanufacture;

	@FindBy(id = "numberofseats")
	WebElement cmbox_numberofseats;

	@FindBy(xpath = ".//*[@id='insurance-form']/div/section[1]/div[7]/p/label[1]")
	WebElement radio_righthanddriveyes;

	@FindBy(id = "numberofseatsmotorcycle")
	WebElement cmbox_numberofseatsmotorcycle;

	@FindBy(id = "fuel")
	WebElement cmbox_fuel;

	@FindBy(id = "payload")
	WebElement txt_payload;

	@FindBy(id = "totalweight")
	WebElement txt_totalweight;

	@FindBy(id = "listprice")
	WebElement txt_listprice;

	@FindBy(id = "licenseplatenumber")
	WebElement txt_licenseplatenumber;

	@FindBy(id = "annualmileage")
	WebElement txt_annualmileage;

	@FindBy(id = "nextenterinsurantdata")
	WebElement btn_nextenterinsurantdata;

	@FindBy(id = "open")
	WebElement btn_open;
	// Fim Mapeamento Aba Vehicle

	// Mapeamento Aba Insurant
	@FindBy(id = "firstname")
	WebElement txt_firstname;

	@FindBy(id = "lastname")
	WebElement txt_lastname;

	@FindBy(id = "birthdate")
	WebElement date_birthdate;

	@FindBy(xpath = ".//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]")
	WebElement radio_gender;

	@FindBy(id = "streetaddress")
	WebElement txt_streetaddress;

	@FindBy(id = "country")
	WebElement txt_country;

	@FindBy(id = "zipcode")
	WebElement txt_zipcode;

	@FindBy(id = "city")
	WebElement txt_city;

	@FindBy(id = "occupation")
	WebElement cmbox_occupation;

	@FindBy(xpath = ".//*[@id='insurance-form']/div/section[2]/div[10]/p/label[1]/span")
	WebElement chckbox_hobbies;

	@FindBy(id = "website")
	WebElement txt_website;

	@FindBy(id = "nextenterproductdata")
	WebElement btn_nextenterproductdata;

	@FindBy(xpath = "//label[contains(text(),'Start Date')]")
	WebElement lbl_startdate;
	// Fim Mapeamento Aba Insurant

	// Mapeamento Aba Product
	@FindBy(id = "startdate")
	WebElement date_startdate;

	@FindBy(id = "insurancesum")
	WebElement cmbox_insurancesum;

	@FindBy(id = "meritrating")
	WebElement cmbox_meritrating;

	@FindBy(id = "damageinsurance")
	WebElement cmbox_damageinsurance;

	@FindBy(xpath = ".//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]")
	WebElement chckbox_optinionalproducts;

	@FindBy(id = "courtesycar")
	WebElement cmbox_courtesycar;

	@FindBy(id = "nextselectpriceoption")
	WebElement btn_nextselectpriceoption;

	@FindBy(xpath = "//th[contains(text(),'Silver')]")
	WebElement lbl_silver;
	// Fim Mapeamento Aba Product

	// Mapeamento Aba Price
	@FindBy(xpath = ".//*[@id='priceTable']/tfoot/tr/th[2]/label[4]")
	WebElement radio_selectultimate;

	@FindBy(id = "nextsendquote")
	WebElement btn_nextsendquote;

	@FindBy(xpath = "//label[contains(text(),'E-Mail')]")
	WebElement lbl_email;
	// Fim Mapeamento Aba Price

	// Mapeamento Aba Send
	@FindBy(id = "email")
	WebElement txt_email;

	@FindBy(id = "phone")
	WebElement txt_phone;

	@FindBy(id = "username")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "confirmpassword")
	WebElement txt_confirmpassword;

	@FindBy(id = "sendemail")
	WebElement btn_sendemail;

	@FindBy(xpath = "//h2[contains(text(),'Sending e-mail success!')]")
	WebElement lbl_msgsucess;

	// Fim Mapeamento Aba Send

	WebDriver driver;

	public PreencherFormulario(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	// Métodos Aba Vehicle
	public void selectItemMake() {
		Select select = new Select(cmbox_make);
		select.selectByVisibleText("Ford");
	}

	public void selectItemModel() {
		Select select = new Select(cmbox_model);
		select.selectByVisibleText("Moped");
	}

	public void txtCylinderCapacity() {
		txt_cylindercapacity.sendKeys("1");
	}

	public void txtEnginePerformance() {
		txt_engineperformance.sendKeys("2");
	}

	public void dateDateOfManufacture() {
		date_dateofmanufacture.sendKeys("03/23/2022");
	}

	public void selectItemNumberOfSeats() {
		Select select = new Select(cmbox_numberofseats);
		select.selectByVisibleText("3");
	}

	public void radioRightHandDriveYes() {
		radio_righthanddriveyes.click();
	}

	public void selectItemNumberOfSeatsMotorcycle() {
		Select select = new Select(cmbox_numberofseatsmotorcycle);
		select.selectByVisibleText("2");
	}

	public void selectItemFuel() {
		Select select = new Select(cmbox_fuel);
		select.selectByVisibleText("Gas");
	}

	public void txtPayLoad() {
		txt_payload.sendKeys("12");
	}

	public void txtTotalWeight() {
		txt_totalweight.sendKeys("180");
	}

	public void txtListPrice() {
		txt_listprice.sendKeys("1000");
	}

	public void txtLicensePlateNumber() {
		txt_licenseplatenumber.sendKeys("0");
	}

	public void txtAnnualMileage() {
		txt_annualmileage.sendKeys("100");
	}

	public void btnNextEnterInsurantData() {
		btn_nextenterinsurantdata.click();
	}

	public void validaAbaInsuratData() {
		// btn_open.isDisplayed();

	}
	// Fim Métodos Aba Vehicle

	// Métodos Aba Insurant
	public void txtFirstname() {
		txt_firstname.sendKeys("JOAO");
	}

	public void txtLastname() {
		txt_lastname.sendKeys("FERREIRA");
	}

	public void dateBirthdate() {
		date_birthdate.sendKeys("05/18/1990");
	}

	public void radioGender() {
		radio_gender.click();
	}

	public void txtStreetAddress() {
		txt_streetaddress.sendKeys("Vila Basevi Ar 4 Casa 29");
	}

	public void txtCountry() {
		txt_country.sendKeys("Brazil");
	}

	public void txtZipCode() {
		txt_zipcode.sendKeys("73100720");
	}

	public void txtCity() {
		txt_city.sendKeys("Brasilia");
	}

	public void selectItemOccupation() {
		Select select = new Select(cmbox_occupation);
		select.selectByVisibleText("Farmer");
	}

	public void chckBoxHobbies() {
		chckbox_hobbies.click();
	}

	public void btnNextEnterProductData() {
		btn_nextenterproductdata.click();
	}

	public void validaAbaProductData() {
		lbl_startdate.isDisplayed();

	}
	// Fim Métodos Aba Insurant

	// Métodos Aba Product
	public void dateStartDate() {
		date_startdate.sendKeys("05/05/2023");
	}

	public void selectItemInsuranceSum() {
		Select select = new Select(cmbox_insurancesum);
		select.selectByVisibleText("3.000.000,00");
	}

	public void selectItemMeritRating() {
		Select select = new Select(cmbox_meritrating);
		select.selectByVisibleText("Bonus 1");
	}

	public void selectItemDamageInsurance() {
		Select select = new Select(cmbox_damageinsurance);
		select.selectByVisibleText("Full Coverage");
	}

	public void chckboxOptinionalProducts() {
		chckbox_optinionalproducts.click();
	}

	public void cmboxCourtesyCar() {
		Select select = new Select(cmbox_courtesycar);
		select.selectByVisibleText("No");
	}

	public void btnNextSelectPriceOption() {
		btn_nextselectpriceoption.click();
	}

	public void validaAbaPriceOption() {
		lbl_silver.isDisplayed();

	}
	// Fim Métodos Aba Product

	// Métodos Aba Price
	public void radioSelectUltimate() {
		radio_selectultimate.click();
	}

	public void btnNextSendQuote() {
		btn_nextsendquote.click();
	}

	public void validaAbaSendQuote() {
		lbl_email.isDisplayed();

	}
	// Fim Métodos Aba Price

	// Métodos Aba Send
	public void txtEmail() {
		txt_email.sendKeys("joao@gmail.com");
	}

	public void txtPhone() {
		txt_phone.sendKeys("123456789");
	}

	public void txtUsername() {
		txt_username.sendKeys("joaofs");
	}

	public void txtPassword() {
		txt_password.sendKeys("Joao@123");
	}

	public void txtConfirmPassword() {
		txt_confirmpassword.sendKeys("Joao@123");
	}

	public void btnSendEmail() {
		btn_sendemail.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void validaSendQuote() {
		lbl_msgsucess.isDisplayed();

	}

	public void fecharNavegador() {
		driver.quit();
	}
	// Fim Métodos Aba Send

}
