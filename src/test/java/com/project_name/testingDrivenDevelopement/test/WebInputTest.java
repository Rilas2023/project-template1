package com.project_name.testingDrivenDevelopement.test;

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


<<<<<<< HEAD
    @Before
=======
  @BeforeEach
>>>>>>> origin/master
    public void navigateToHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
    }
    @DisplayName("Delete")
    @Test
<<<<<<< HEAD
    public void webInputVerification()  {

        Assert.assertTrue(WebInputPage.verifyInputDataAgainstOutputData());
=======
    @Order(4)
    public void webInputVerification()  {


        Assertions.assertTrue(WebInputPage.verifyInputDataAgainstOutputData());
>>>>>>> origin/master
    }
@DisplayName("update")
    @Test
<<<<<<< HEAD
    public void notificationMessageVerificationA(){

        Assert.assertTrue(NotificationMessagePage.notificationMessageVerification());
    }
=======
@Order(3)
    public void notificationMessageVerificationA() {
        try {
            Assertions.assertTrue(NotificationMessagePage.notificationMessageVerification());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @DisplayName("post")
    @Order(1)
    @Test
    public void dynamicTableURLAssertion() {
        Assertions.assertTrue(DynamicTablePage.dynamicTableAccess());
    }
@DisplayName("get")
    @Order(2)
    @Test
    public void memoryAvgOfInternetExplorer() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("DynamicTablePage.memory_avg() = " + DynamicTablePage.memory_avg());
    }

>>>>>>> origin/master

    @After  //comment after
    public  void tearDown(){
        Driver.closeDriver();
    }
}
