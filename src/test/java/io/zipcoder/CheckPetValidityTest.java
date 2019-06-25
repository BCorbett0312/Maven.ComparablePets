package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPetValidityTest {
    Bird testBird;

    @Before
    public void setup(){
        testBird = new Bird("Birdie");
    }

    @Test
     public void checkValidTest(){
        String expected = "Bird";
        String actual = testBird.type;
        assertEquals(expected, actual);
    }


}