package opencartpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_opencart_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello world");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://demo.opencart.com/");
		
		System.out.println("Title of the page is:"+driver.getTitle());
		
		driver.close();
		
		
		
		
	}

}
