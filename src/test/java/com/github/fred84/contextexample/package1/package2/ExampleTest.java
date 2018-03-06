package com.github.fred84.contextexample.package1.package2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTest {

    @TestConfiguration
    public static class TestConfig1 {
        {
            System.out.println("test config1");
        }
    }

    @TestConfiguration
    public static class TestConfig2 {
        {
            System.out.println("test config2");
        }
    }

    @Test
    public void test1() {
        assertTrue(true);
    }
}
