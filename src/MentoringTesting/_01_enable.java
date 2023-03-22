package MentoringTesting;

import org.testng.annotations.Test;

public class _01_enable {
    /*org.seleniumhq.selenium:selenium-java:4.8.1
org.testng:testng:6.14.3*/

    @Test
    public void c_language(){
        System.out.println("C language");
    }
    @Test(enabled = false)
    public void jira(){
        System.out.println("jira ile languaga");
    }  @Test
    public void java(){
        System.out.println("java ile language");
    }
}
