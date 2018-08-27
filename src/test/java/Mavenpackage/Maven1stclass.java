package Mavenpackage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Maven1stclass {
	
	
	@Test
    public void test()
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/3.17");
		
		System.out.println("Lunch the application");
		
		
	}

}
