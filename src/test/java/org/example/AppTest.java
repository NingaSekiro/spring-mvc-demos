package org.example;

import junit.framework.TestCase;
import org.example.model.User;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    public void testValidator(){
        User user=new User();
        user.setAge(12);

    }
}
