package com.project_name.testingDrivenDevelopement.fils;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragDropXml {

 public  DragDropXml(){

     PageFactory.initElements(Driver.getDriver(), this);
 }

 @FindBy(linkText = "Drag and Drop")
    public WebElement dropAndDragPage;

 @FindBy(id = "column-a")
    public WebElement columnA;

 @FindBy(id = "column-b")
    public WebElement columnB;



}
