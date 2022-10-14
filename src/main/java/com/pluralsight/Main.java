package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.pluralsight.com");

        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);

        WebElement imageLink = driver.findElements(By.linkText("Images")).get(0);
        imageLink.click();

        WebElement imageElement =  driver.findElements(By.cssSelector("img[class ='rg_i Q4LuWd']")).get(0);
        imageElement.click();

        driver.getPageSource().contains("Some text that you want to search for");

    }
}