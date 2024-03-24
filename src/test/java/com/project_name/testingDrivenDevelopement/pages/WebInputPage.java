package com.project_name.tdd.pages;

import com.project_name.tdd.pom.WebInputPom;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class WebInputPage {

   private static WebInputPom webInputPom =new WebInputPom();

    @Before
    public void navigateToHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
    }

@Test
    public  void verifyInputDataAgainstOutputData(){

        webInputPom.webInputButton.click();
        webInputPom.inputNumber.sendKeys(WebInputPom.numbers);
        webInputPom.inputText.sendKeys(WebInputPom.Text);
        webInputPom.inputPassword.sendKeys(WebInputPom.password);
      //  LocalDate localDate = LocalDate.now();
       webInputPom.inputDate.sendKeys(WebInputPom.date);
        webInputPom.displayButton.click();
        List<WebElement> actualData = Driver.getDriver().findElements(By.xpath("//input[@class='input-box']"));
      //  System.out.println("actualData = " + actualData);
 //   String value = webInputPom.inputDate.getAttribute("value");
    //System.out.println("value" + value);
   // actualData.forEach(s-> System.out.println(s.getAttribute("value")));


    List<String> listOfValues = actualData.stream()
            .map(element -> element.getAttribute("value"))
            .collect(Collectors.toList());
        System.out.println("listOfData = " + listOfValues);


        BrowserUtils.sleep(2);
        //Driver.getDriver().close();

    }

}
