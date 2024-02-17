package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.model.User;
import org.example.util.ValidateUtil;

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
