import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;


public class SeleniumTest {

	private WebDriver driver;
	private String baseUrl;
 
	@Before
	public void setUp() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		String chromeFilePath = this.getClass().getResource("chromedriver.exe").getPath();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, chromeFilePath);

		driver = new ChromeDriver(options);
		baseUrl = "http://mae0003.github.io/movie/2017/05/28/manchesterbythesea";
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl + "/index.html");
		Thread.sleep(5000);
		driver.findElement(By.className("textArea")).clear();
		Thread.sleep(5000);
		driver.findElement(By.className("textArea")).sendKeys("セレニウム男");
		Thread.sleep(5000);
		
		Optional.of(123).orElseThrow(() -> new IllegalArgumentException("baseUrl"));
	}
}
