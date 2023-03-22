package MentoringTesting;

import org.testng.annotations.Test;

public class _02_priority {
    @Test(priority = 1)
    public void mango(){
        System.out.println("I am mango");
    }
    @Test(priority = 2)
    public void aphone(){
        System.out.println("I am apple");
    } @Test
    public void watermelon(){
        System.out.println("I am watermelon");
    }
}
