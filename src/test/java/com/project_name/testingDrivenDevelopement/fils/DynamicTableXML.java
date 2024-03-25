package com.project_name.testingDrivenDevelopement.fils;

import com.project_name.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicTableXML {
    public DynamicTableXML() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static final String expectedUrl = "https://practice.expandtesting.com/dynamic-table";
    public static final String internet_Explorer = "Internet Explorer";
    public static final String fireFox = "FireFox";
    public static final String system = "System";
    public static final String chrome = "Chrome";

    @FindBy(xpath = "//a[.='Dynamic Table']")
    public WebElement dynamic_table_link;

    @FindBy(xpath = "//td[.='Internet Explorer']/following-sibling::td[contains(text(),'MB') and not(contains(text(),'/s'))]")
    public WebElement memoryOfInternetExplorer;

    @FindBy(xpath = "//td[.='System']/following-sibling::td[contains(text(),'MB') and not(contains(text(),'/s'))]")
    public WebElement memoryOfSystem;

    @FindBy(xpath = "//td[.='Chrome']/following-sibling::td[contains(text(),'MB') and not(contains(text(),'/s'))]")
    public WebElement memoryOfChrome;

    @FindBy(xpath = "//td[.='FireFox']/following-sibling::td[contains(text(),'MB') and not(contains(text(),'/s'))]")
    public WebElement memoryOfFireFox;

    public String  memory(String Name) {

        return Driver.getDriver().findElement(By.xpath("//td[.='"+Name+"']/following-sibling::td[contains(text(),'MB') and not(contains(text(),'/s'))]")).getText();

    }


}
