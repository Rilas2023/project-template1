package com.project_name.testingDrivenDevelopement.test;


import com.project_name.testingDrivenDevelopement.pages.DynamicTablePage;

import com.project_name.testingDrivenDevelopement.pages.NotificationMessagePage;
import com.project_name.testingDrivenDevelopement.pages.WebInputPage;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.*;
import org.junit.runner.OrderWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.WebDriverWait;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WebInputTest {


  @BeforeEach
    public void navigateToHomePage(){

        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
    }

    @Test
    @Order(4)
    public void webInputVerification()  {


        Assertions.assertTrue(WebInputPage.verifyInputDataAgainstOutputData());
    }

    @Test
@Order(3)
    public void notificationMessageVerificationA() {
        try {
            Assertions.assertTrue(NotificationMessagePage.notificationMessageVerification());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Order(1)
    @Test
    public void dynamicTableURLAssertion() {
        Assertions.assertTrue(DynamicTablePage.dynamicTableAccess());
    }

    @Order(2)
    @Test
    public void memoryAvgOfInternetExplorer() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("DynamicTablePage.memory_avg() = " + DynamicTablePage.memory_avg());
    }


    @After  //comment after
    public  void tearDown(){
        Driver.closeDriver();
    }
}
