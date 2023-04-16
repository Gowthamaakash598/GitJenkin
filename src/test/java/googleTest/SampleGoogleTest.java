package googleTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleGoogleTest {
   
	
	public void validateBing() throws IOException{
		  WebDriverManager.chromedriver().setup();
		  WebDriver wd=new ChromeDriver();
		  wd.get("https://www.google.com/");
		  
		  WebElement input=wd.findElement(By.name("q"));
		  input.sendKeys("chennai");
		  input.submit();
		  
		  File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src, new File("C:/VcentryBatch/Batch253/I1_GitHubTest/screenshot/google.png"));
			wd.quit();


		  
	  }
}
