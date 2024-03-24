package com.project_name.tdd.test;

import com.project_name.tdd.pom.WebInputPom;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

public class WebInputTest {


    @Before
    public void navigateToHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
    }
    @Test
            public void test1() throws InterruptedException {


    }
}
