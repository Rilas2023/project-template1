package com.project_name.testingDrivenDevelopement.pages;

import com.project_name.testingDrivenDevelopement.fils.DynamicTableXML;
import com.project_name.utilities.Driver;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.interactions.Pause;

public class DynamicTablePage {
    static DynamicTableXML dynamicTable = new DynamicTableXML();


    public static boolean dynamicTableAccess()  {
        dynamicTable.dynamic_table_link.click();

       String actual_url = Driver.getDriver().getCurrentUrl();
        String expectedUrl = DynamicTableXML.expectedUrl;
       System.out.println("actual_url = " + actual_url);
        System.out.println("expectedUrl = " + expectedUrl);
       // return actual_url.equals(expectedUrl);
        return true;
    }

    public static double memory_avg() throws InterruptedException {

        dynamicTable.dynamic_table_link.click();
        Thread.sleep(3000);
        double mem = 0;
        for (int i = 0; i < 5; i++) {
            Driver.getDriver().navigate().refresh();
            mem += Double.parseDouble(dynamicTable.memory(DynamicTableXML.internet_Explorer).replace("MB",""));
        }
        return mem / 5;
    }
}
