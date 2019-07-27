package com.Amazon.in.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * 
 * @author Latha
 *
 */
public class Browser {
//	private Object by;

	/* driver is global static and public varaible*/
	
@Test
public void openAmazon(){
	Reporter.log("verify Amazon pageis opened ",true);
//System.setProperty("Webdriver.gecko.driver","C:\\Web driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.amazon.in");
//WebElement custDrop=driver.findElement(By.id("nav-link-shopall"));

WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Amazon Prime Video']")));

Actions act=new Actions(driver);
WebElement exp=driver.findElement(By.xpath("//span[text()='Amazon Prime Video']"));
act.moveToElement(exp);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='All Videos']")));
WebElement ett=driver.findElement(By.xpath("//span[text()='All Videos']"));
act.moveToElement(ett).click();
act.perform();


}}
