package com.project_name.testingDrivenDevelopement.pages;

import com.project_name.testingDrivenDevelopement.fils.WebInputXML;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class WebInputPage {

    private static WebInputXML webInputPom = new WebInputXML();

//    @Before
//    public void navigateToHomePage() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
//    }

    public static boolean verifyInputDataAgainstOutputData() {

        webInputPom.webInputButton.click();

        webInputPom.inputNumber.sendKeys(WebInputXML.numbers);
        webInputPom.inputText.sendKeys(WebInputXML.Text);
        webInputPom.inputPassword.sendKeys(WebInputXML.password);
        webInputPom.inputDate.sendKeys(webInputPom.formattedDate);
        webInputPom.displayButton.click();

        List<WebElement> actualInputData = webInputPom.actualInputData;

        List<String> inputList = actualInputData.stream()
                .map(element -> element.getAttribute("value"))
                .collect(Collectors.toList());

        List<WebElement> outputInputData = webInputPom.outputInputData;

        List<String> outputList = outputInputData.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        System.out.println("outputList = " + outputList);
        return inputList.equals(outputList);
    }
}
