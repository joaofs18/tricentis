package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.PreencherFormulario;

public class PreencherFormularioSteps {

	WebDriver driver = null;
	PreencherFormulario preencherformulario;

	@Dado("que o usuario acessou a pagina tricentis")
	public void que_o_usuario_acessou_a_pagina_tricentis() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Abrindo página do sistema
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
	}

	@E("preenche todos os campos obrigatorios da aba vehicle")
	public void preenche_todos_os_campos_obrigatorios_da_aba_vehicle() {
		preencherformulario = new PreencherFormulario(driver);

		preencherformulario.selectItemMake();
		preencherformulario.selectItemModel();
		preencherformulario.txtCylinderCapacity();
		preencherformulario.txtEnginePerformance();
		preencherformulario.dateDateOfManufacture();
		preencherformulario.selectItemNumberOfSeats();
		preencherformulario.radioRightHandDriveYes();
		preencherformulario.selectItemNumberOfSeatsMotorcycle();
		preencherformulario.selectItemFuel();
		preencherformulario.txtPayLoad();
		preencherformulario.txtTotalWeight();
		preencherformulario.txtListPrice();
		preencherformulario.txtLicensePlateNumber();
		preencherformulario.txtAnnualMileage();
	}

	@Quando("clicar em next da aba vehicle")
	public void clicar_em_next_da_aba_vehicle() {
		preencherformulario.btnNextEnterInsurantData();
	}

	@Entao("a aba enter insurant data ficara habilitada")
	public void a_aba_enter_insurant_data_ficara_habilitada() {
		preencherformulario.validaAbaInsuratData();
	}

	@Dado("que o usuario esta na aba aba enter insurant data")
	public void que_o_usuario_esta_na_aba_aba_enter_insurant_data() {
		preencherformulario.validaAbaInsuratData();
	}

	@E("preenche todos os campos obrigatorios da aba insurant")
	public void preenche_todos_os_campos_obrigatorios_da_aba_insurant() {
		preencherformulario = new PreencherFormulario(driver);

		preencherformulario.txtFirstname();
		preencherformulario.txtLastname();
		preencherformulario.dateBirthdate();
		preencherformulario.radioGender();
		preencherformulario.txtStreetAddress();
		preencherformulario.txtCountry();
		preencherformulario.txtZipCode();
		preencherformulario.txtCity();
		preencherformulario.selectItemOccupation();
		preencherformulario.chckBoxHobbies();
	}

	@Quando("clicar em next da aba insurant")
	public void clicar_em_next_da_aba_insurant() {
		preencherformulario.btnNextEnterProductData();
	}

	@Entao("a aba enter product data ficara habilitada")
	public void a_aba_enter_product_data_ficara_habilitada() {
		preencherformulario.validaAbaProductData();
	}

	@Dado("que o usuario esta na aba aba enter product data")
	public void que_o_usuario_esta_na_aba_aba_enter_product_data() {
		preencherformulario.validaAbaProductData();
	}

	@E("preenche todos os campos obrigatorios da aba product")
	public void preenche_todos_os_campos_obrigatorios_da_aba_product() {
		preencherformulario = new PreencherFormulario(driver);
		preencherformulario.dateStartDate();
		preencherformulario.selectItemInsuranceSum();
		preencherformulario.selectItemMeritRating();
		preencherformulario.selectItemDamageInsurance();
		preencherformulario.chckboxOptinionalProducts();
		preencherformulario.cmboxCourtesyCar();
	}

	@Quando("clicar em next da aba product")
	public void clicar_em_next_da_aba_product() {
		preencherformulario.btnNextSelectPriceOption();
	}

	@Entao("a aba select price data ficara habilitada")
	public void a_aba_select_price_data_ficara_habilitada() {
		preencherformulario.validaAbaPriceOption();
	}

	@Dado("que o usuario esta na aba aba select price data")
	public void que_o_usuario_esta_na_aba_aba_select_price_data() {
		preencherformulario = new PreencherFormulario(driver);
		preencherformulario.validaAbaPriceOption();
	}

	@E("preenche todos os campos obrigatorios da aba price")
	public void preenche_todos_os_campos_obrigatorios_da_aba_price() {
		preencherformulario.radioSelectUltimate();
	}

	@Quando("clicar em next da aba price")
	public void clicar_em_next_da_aba_price() {
		preencherformulario.btnNextSendQuote();
	}

	@Entao("a aba send quote ficara habilitada")
	public void a_aba_send_quote_ficara_habilitada() {
		preencherformulario.validaAbaSendQuote();
	}

	@Dado("que o usuario esta na aba aba send quote")
	public void que_o_usuario_esta_na_aba_aba_send_quote() {
		preencherformulario.validaAbaSendQuote();

	}

	@E("preenche todos os campos obrigatorios da aba send")
	public void preenche_todos_os_campos_obrigatorios_da_aba_send() {
		preencherformulario = new PreencherFormulario(driver);
		preencherformulario.txtEmail();
		preencherformulario.txtPhone();
		preencherformulario.txtUsername();
		preencherformulario.txtPassword();
		preencherformulario.txtConfirmPassword();
	}

	@Quando("clicar em send da aba send")
	public void clicar_em_send_da_aba_send() {
		preencherformulario.btnSendEmail();
	}

	@Entao("uma mensagem de sucesso e exibida")
	public void uma_mensagem_de_sucesso_e_exibida() {
		preencherformulario.validaSendQuote();

	}

}
