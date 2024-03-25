package com.project_name.testingDrivenDevelopement.pages;

import com.project_name.testingDrivenDevelopement.fils.NotificationMessageXML;

public class NotificationMessagePage {


    static NotificationMessageXML notificationMessage = new NotificationMessageXML();



    public  static boolean notificationMessageVerification(){

       notificationMessage.notificationMessage.click();
       notificationMessage.clickHere.click();
        String actualUnsuccessfulMessage = notificationMessage.UnsuccessfulMessage.getText();
        String expectedUnsuccessfulMessage = NotificationMessageXML.expectedUnsuccessfulMessage;
        return expectedUnsuccessfulMessage.equals(actualUnsuccessfulMessage);
    }


}
