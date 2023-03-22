package MentoringTesting;

import org.testng.annotations.Test;

public class _03_dependency {
    @Test(dependsOnMethods = {"testcase2","testcase3"})
    public void testcase1() {
        System.out.println("this is Test case 1");
    }

    @Test
    public void testcase2() {
        System.out.println("this is Test case 2");
    }

    @Test
    public void testcase3() {
        System.out.println("this is Test case 3");
    }

}
