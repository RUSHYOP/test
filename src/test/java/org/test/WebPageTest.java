package org.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebPageTest {
    @Test
    public void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https:/hianime.to/home");
        driver.manage().window().maximize();
    }
}

