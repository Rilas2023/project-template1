package com.project_name.testingDrivenDevelopement.pages;

import com.project_name.testingDrivenDevelopement.pom.WebInputPom;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class WebInputPage {

   private static WebInputPom webInputPom =new WebInputPom();

//    @Before
//    public void navigateToHomePage() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
//    }

@Test
    public static boolean verifyInputDataAgainstOutputData(){

        webInputPom.webInputButton.click();
        webInputPom.inputNumber.sendKeys(WebInputPom.numbers);
        webInputPom.inputText.sendKeys(WebInputPom.Text);
        webInputPom.inputPassword.sendKeys(WebInputPom.password);
        webInputPom.inputDate.sendKeys(webInputPom.formattedDate);
        webInputPom.displayButton.click();

    List<WebElement> actualInputData = webInputPom.actualInputData;
    List<String> inputList = actualInputData.stream()
            .map(element -> element.getAttribute("value"))
            .collect(Collectors.toList());
    System.out.println("inputList = " + inputList);

    List<WebElement> outputInputData = webInputPom.outputInputData;
    List<String> outputList = outputInputData.stream()
                    .map(WebElement::getText)
                            .collect(Collectors.toList());
    System.out.println("outputList = " + outputList);



return inputList.equals(outputList);
    }
}
