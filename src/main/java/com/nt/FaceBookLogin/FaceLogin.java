package com.nt.FaceBookLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 */
public class FaceLogin {
    public static void main(String[] args) {
       WebDriverManager.chromiumdriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       System.out.println("LOgin page open"+driver.getTitle());
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       WebElement email=driver.findElement(By.id("email"));
       email.sendKeys("saiprasanrh@123");
       WebElement password=driver.findElement(By.id("pass"));
       password.sendKeys("123455");
       WebElement LoginButton =driver.findElement(By.name("login"));
       LoginButton.click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       System.out.println("Incorrect password Title"+driver.getTitle());
       driver.quit();
    System.out.println("Browser is closed");
    
    }
}
