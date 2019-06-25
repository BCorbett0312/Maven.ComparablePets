package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BirdTest {
    Bird testBird;

    @Before
    public void setup(){
        testBird = new Bird("Birdie");
    }

    @Test
    public void speakTest(){
        String expected = "Tweet";
        String actual = testBird.speak();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void instanceOfPetTest() {
        assertTrue(testBird instanceof Pet);
    }

    @Test
    public void getNameTest() {
        String expected = "Birdie";
        String actual = testBird.getName();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() {
        String expected = "Bird";
        String actual = testBird.getType();
        //assert
        assertEquals(expected, actual);
    }




    }
