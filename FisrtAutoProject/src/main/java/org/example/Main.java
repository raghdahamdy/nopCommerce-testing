package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting WebDriver setup...");

        WebDriverManager.chromedriver().setup();

        System.out.println("Creating ChromeDriver...");
        WebDriver driver = new ChromeDriver();

        System.out.println("Opening Google...");
        driver.get("https://www.google.com");

        System.out.println("Waiting for 5 seconds...");
        Thread.sleep(5000);

        System.out.println("Closing browser...");
        driver.quit();

        System.out.println("Test finished.");
        }
    }
