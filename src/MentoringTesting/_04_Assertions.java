package MentoringTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Assertions {
    @Test
    public void testcase() {
        String text1="java is a programe languge";
        String text2="java is a programe languge";
        Assert.assertTrue(text1==text2);
    }
    @Test
    public void testcasetwo() {
        String s1="java";
        String s2=new String("Java");
        Assert.assertEquals(s1,s2,"içerik aynı degil");
    }
}
