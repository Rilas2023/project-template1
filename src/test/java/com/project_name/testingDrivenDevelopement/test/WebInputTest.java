package com.project_name.testingDrivenDevelopement.test;

import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import org.junit.Before;
import org.junit.Test;

public class WebInputTest {


    @Before
    public void navigateToHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
    }
    @Test
            public void test1() throws InterruptedException {


    }
}
