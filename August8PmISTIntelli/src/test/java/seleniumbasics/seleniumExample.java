package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExample {
    public static void main(String[] args) {
        WebDriver derver = new ChromeDriver();
        derver.get("https://login.salesforce.com/");
        derver.findElement(By.id("username")).sendKeys("niki");
        derver.findElement(By.id("password")).sendKeys("123");
        derver.findElement(By.id("Login")).click();
    }
}
