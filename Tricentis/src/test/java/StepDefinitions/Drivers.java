package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Drivers {
	private static boolean inicializado = false;
	private static WebDriver driver;

	@Before
	public void inicializarDriver() {
		if (!inicializado) {
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
			inicializado = true;
			driver = new ChromeDriver();
			driver.get("http://sampleapp.tricentis.com/101/app.php");
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
