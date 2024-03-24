package com.project_name.tdd.pom;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebInputPom {
  public static final String numbers="123456";
  public static final String Text="text";
  public static final String password="123456";
  public static final String date="01/05/2024";



    public WebInputPom(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//a[normalize-space()='Web inputs']" )
    public WebElement webInputButton;

    @FindBy(xpath = "//input[@id='input-number']")
    public WebElement inputNumber;

    @FindBy(xpath = "//input[@id='input-text']")
    public WebElement inputText;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='input-date']")
    public WebElement inputDate;

@FindBy(xpath = "//button[@id='btn-display-inputs']")
    public WebElement displayButton;
}
