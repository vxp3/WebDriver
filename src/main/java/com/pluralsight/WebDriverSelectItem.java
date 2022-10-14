package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/V/Documents/Project/WebDriver/src/main/webapp/SelectItemTest.html");

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");
    }
}
