package com.amazon.tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ExtentReportManager;

public class AddToCartTest {
    WebDriver driver;
    ExtentTest test;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void addProductToCart() {
        test = ExtentReportManager.createTest("Add Product to Cart");
        
        driver.get("https://www.amazon.in");
        test.info("Amazon page opened successfully!");
        
        String title = driver.getTitle();
        test.info("Page title: " + title);
        
        Assert.assertTrue(title.contains("Amazon"), "Title verification failed!");
        test.pass("Test Passed: addProductToCart");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        ExtentReportManager.flushReport();
    }
}
