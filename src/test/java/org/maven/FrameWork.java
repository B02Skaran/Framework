package org.maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWork {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    WebElement usernamebox = driver.findElement(By.id("email"));
    usernamebox.sendKeys("baskaran0202@gmail.com");
    TakesScreenshot usernamebox1=(TakesScreenshot) driver;
    File screenshotAs = usernamebox.getScreenshotAs(OutputType.FILE);
    File dest =new File("D:\\New folder\\screen2.png");
    FileUtils.copyFile(screenshotAs, dest);
    boolean canRead = screenshotAs.canRead();
    System.out.println(canRead);
    
    
    
    
    
    
	
	
	
}
}
