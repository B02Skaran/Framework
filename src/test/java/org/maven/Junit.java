package org.maven;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Junit {
	static WebDriver driver;
@BeforeClass
public static void beforeClass() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}
@AfterClass
public static void afterClass() {
	
}
@After
public void beforeMethod() {
long currentTimeMillis = System.currentTimeMillis();
long seconds = (TimeUnit.SECONDS.toSeconds(currentTimeMillis)%1000);
System.out.println(seconds);
}
@Before
public void afterMethod() {
long currentTimeMillis1 = System.currentTimeMillis();
long seconds = (TimeUnit.SECONDS.toSeconds(currentTimeMillis1)%1000);
System.out.println(seconds);
}
@Test
public void login() {
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("Naveen53");
	WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("C1IZAU");
    WebElement btnlogin = driver.findElement(By.name("login"));
    btnlogin.click();
    WebElement ddnlocation = driver.findElement(By.id("location"));
	Select select = new Select(ddnlocation);
	select.selectByValue("Sydney");
	
	WebElement ddnhotel = driver.findElement(By.id("hotels"));
	Select slthtl = new Select(ddnhotel);
	slthtl.selectByValue("Hotel Sunshine");
	
	WebElement ddnroomselect = driver.findElement(By.id("room_type"));
	Select roomselect = new Select(ddnroomselect);
	roomselect.selectByValue("Super Deluxe");

	WebElement ddnnoofroom = driver.findElement(By.id("room_nos"));
	Select nomem = new Select(ddnnoofroom);
	nomem.selectByIndex(4);
	
	WebElement ddnroomtype = driver.findElement(By.id("adult_room"));
	Select roomtype2 =new Select(ddnroomtype);
	roomtype2.selectByIndex(2);
    
	WebElement searchtext = driver.findElement(By.id("Submit"));
	searchtext.click();
	
	
	WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	radiobtn.click();
	
	WebElement continuebtn = driver.findElement(By.id("continue"));
	continuebtn.click();
	
	WebElement fillbox1 = driver.findElement(By.id("first_name"));
	fillbox1.sendKeys("Baskaran");
	
	WebElement fillbox2 = driver.findElement(By.id("last_name"));
	fillbox2.sendKeys("BOSE");
	
	WebElement fillbox3 = driver.findElement(By.id("address"));
	fillbox3.sendKeys("no. 5 , 5th , street pudhu nagar,medavekkam");
	
	WebElement fillbox4 = driver.findElement(By.id("cc_num"));
	fillbox4.sendKeys("12345678910123456");
	
	WebElement cardtype = driver.findElement(By.id("cc_type"));
	Select cardtype1 = new Select(cardtype);
	cardtype1.selectByIndex(3);
	
	WebElement expdata1 = driver.findElement(By.id("cc_exp_month"));
	Select exp =new Select(expdata1);
	exp.selectByIndex(2);
	
	WebElement expdata2 = driver.findElement(By.id("cc_exp_year"));
	Select exp1 =new Select(expdata2);
	exp1.selectByVisibleText("2022");
	
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("123");
	
	WebElement bookbtn = driver.findElement(By.id("book_now"));
	bookbtn.click();
	WebElement txtorder = driver.findElement(By.xpath("//input[@value='HFIXX22FE8']"));
	String text = txtorder.getAttribute("value");
	System.out.println(text);    
}
}
