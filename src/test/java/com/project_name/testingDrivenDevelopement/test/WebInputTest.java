package com.project_name.testingDrivenDevelopement.test;

import com.project_name.testingDrivenDevelopement.pages.WebInputPage;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WebInputTest {


    @Before
    public void navigateToHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
    }
    @Test
    public void webInputVerification()  {

        Assert.assertTrue(WebInputPage.verifyInputDataAgainstOutputData());
        BrowserUtils.sleep(2);
      //  Driver.getDriver().close();
    }
}
