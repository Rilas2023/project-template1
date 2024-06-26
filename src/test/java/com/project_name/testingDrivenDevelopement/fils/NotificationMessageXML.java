package com.project_name.testingDrivenDevelopement.fils;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationMessageXML {

    public static final String expectedUnsuccessfulMessage = "Action unsuccessful, please try again";

    public NotificationMessageXML() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Notification Message']")
    public WebElement notificationMessage;

    @FindBy(xpath = "//a[.='Click here']")
    public WebElement clickHere;

    @FindBy(xpath = "//b[.='Action unsuccessful, please try again']")
    public WebElement UnsuccessfulMessage;


}
