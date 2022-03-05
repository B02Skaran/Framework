package org.pom;

import java.util.concurrent.TimeUnit;

import org.maven.BaseClass;
import org.openqa.selenium.WebElement;

public class Adactin {
public static void main(String[] args) {
	BaseClass baseclass = new BaseClass();
	baseclass.getDriver();
	baseclass.implicitWait(30, TimeUnit.SECONDS);
	baseclass.maximize();
	baseclass.loadUrl("https://adactinhotelapp.com/");
	WebElement username = baseclass.findLocatorById("username");
	username.sendKeys("Naveen53");
    WebElement userpassword = baseclass.findLocatorById("password");
    userpassword.sendKeys("C1IZAU");
    WebElement btnlogoin = baseclass.findLocatorById("login");
    baseclass.click(btnlogoin);
    WebElement sltlocatiom = baseclass.findLocatorById("location");
    baseclass.selectByIndex(sltlocatiom, 2);
    WebElement hotels = baseclass.findLocatorById("hotels");
    baseclass.selectByIndex(hotels, 2);
    WebElement noofrooms = baseclass.findLocatorById("room_nos");
    baseclass.selectByIndex(noofrooms, 2);
    WebElement adultrooms = baseclass.findLocatorById("adult_room");
    baseclass.selectByIndex(adultrooms, 2);
    WebElement childroom = baseclass.findLocatorById("child_room");
    baseclass.selectByIndex(childroom, 0);
    WebElement searchbtn = baseclass.findLocatorById("Submit");
    searchbtn.click();
    WebElement radiobtn = baseclass.findLocatorById("radiobutton_1");
    baseclass.click(radiobtn);
    WebElement continuebtn = baseclass.findLocatorById("continue");
    baseclass.click(continuebtn);
    WebElement fisrtname = baseclass.findLocatorById("first_name");
    fisrtname.sendKeys("Baskaran");
    WebElement lastname = baseclass.findLocatorById("last_name");
    lastname.sendKeys("E");
    WebElement addresstxt = baseclass.findLocatorById("address");
    addresstxt.sendKeys("no.4 5th st ,medavakkam");
    WebElement   = baseclass.findLocatorById("cc_num");
    
    
    
    
    
    
}
}
