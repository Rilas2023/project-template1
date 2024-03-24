package com.project_name.tdd.test;

import com.project_name.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    @org.junit.Test
            public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/");
        //comment

        WebElement webInputButton = driver.findElement(By.xpath("//a[normalize-space()='Web inputs']"));
        webInputButton.click();
        WebElement inputNumber = driver.findElement(By.xpath("//input[@id='input-number']"));
        inputNumber.sendKeys("12345");

        WebElement secondInput = driver.findElement(By.xpath("//input[@id='input-text']"));
        secondInput.sendKeys("secondInputBox");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordInput.sendKeys("123456");

        WebElement dateInputBox = driver.findElement(By.xpath("//input[@id='input-date']"));
      //  LocalDate localDate = LocalDate.now();

        dateInputBox.sendKeys("01/05/2024");

        WebElement displayButton = driver.findElement(By.xpath("//button[@id='btn-display-inputs']"));
        displayButton.click();
        List<WebElement> actualData = driver.findElements(By.xpath("//div[@class='row mb-2']"));
      //  System.out.println("actualData = " + actualData);
        actualData.forEach(s-> System.out.println(s.getText()));
        Thread.sleep(3000);

        List<String> listOfData = actualData.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        System.out.println("listOfData = " + listOfData);


        Thread.sleep(3000);
        driver.close();
    }
}
