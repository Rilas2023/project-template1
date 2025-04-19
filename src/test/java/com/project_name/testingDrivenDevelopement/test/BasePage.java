package com.project_name.testingDrivenDevelopement.test;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {

    public   WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

 //   Wait wait = (Wait) SeleniumManager.getInstance();


}


