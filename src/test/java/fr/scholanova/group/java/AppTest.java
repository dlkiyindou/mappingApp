package fr.scholanova.group.java;

import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath*:Spring/applicationContext-test.xml"
})
public class AppTest {
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
}
