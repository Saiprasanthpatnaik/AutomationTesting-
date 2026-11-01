package com.sai.Day1LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
         //Launch browser
	//int i =10;
        driver.get("https://www.google.com");
          //close browser
        driver.quit();
    }
}
