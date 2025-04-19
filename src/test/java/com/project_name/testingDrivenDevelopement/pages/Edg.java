package com.project_name.testingDrivenDevelopement.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edg {

    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");
    }
}
