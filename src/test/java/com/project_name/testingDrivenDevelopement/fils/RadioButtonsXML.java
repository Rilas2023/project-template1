package com.project_name.testingDrivenDevelopement.fils;

import com.project_name.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonsXML {


    public RadioButtonsXML(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Radio Buttons']")
    public WebElement radioButtonsPageButton;


    public static WebElement radioButtons(String color){
        return
         Driver.getDriver().findElement(By.xpath("//label[.='"+color+"']"));

    }
}
