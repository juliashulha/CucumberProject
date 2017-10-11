package generalTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class Login {
        private WebDriver driver;
        private String baseUrl;


        @BeforeTest
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://qa.apps.artygeek.net/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }


        @Test
        public void Test() throws Exception{
            driver.get("http://www.store.demoqa.com");

            // Find the element that's ID attribute is 'account'(My Account)

            driver.findElement(By.xpath(".//*[@id='account']/a")).click();

            // Find the element that's ID attribute is 'log' (Username)

            // Enter Username on the element found by above desc.

            driver.findElement(By.id("log")).sendKeys("testuser_1");

            // Find the element that's ID attribute is 'pwd' (Password)

            // Enter Password on the element found by the above desc.

            driver.findElement(By.id("pwd")).sendKeys("Test@123");

            // Now submit the form. WebDriver will find the form for us from the element

            driver.findElement(By.id("login")).click();

            // Print a Log In message to the screen

            System.out.println("Login Successfully");

            // Find the element that's ID attribute is 'account_logout' (Log Out)

            driver.quit();




        }



    }



