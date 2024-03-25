package com.project_name.testingDrivenDevelopement.test;

import com.project_name.testingDrivenDevelopement.pages.DynamicTablePage;
import com.project_name.testingDrivenDevelopement.pages.NotificationMessagePage;
import com.project_name.testingDrivenDevelopement.pages.WebInputPage;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebInputTest {


    @Before
    public void navigateToHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
    }

    @Test
    public void webInputVerification() {

        Assert.assertTrue(WebInputPage.verifyInputDataAgainstOutputData());
    }

    @Test
    public void notificationMessageVerificationA() {
        try {
            Assert.assertTrue(NotificationMessagePage.notificationMessageVerification());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void dynamicTableURLAssertion() {
        Assert.assertTrue(DynamicTablePage.dynamicTableAccess());
    }

    @Test
    public void memoryAvgOfInternetExplorer() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("DynamicTablePage.memory_avg() = " + DynamicTablePage.memory_avg());
    }
    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
