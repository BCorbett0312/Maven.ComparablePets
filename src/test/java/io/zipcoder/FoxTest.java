package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FoxTest {

    Fox testFox;

    @Before
    public void setup(){

        testFox = new Fox("foxName");
    }

    @Test
    public void speakTest(){
        String expected =  "Ring-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!";;
        String actual = testFox.speak();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void instanceOfPetTest() {
        assertTrue(testFox instanceof Pet);
    }

    @Test
    public void getNameTest() {
        String expected = "foxName";
        String actual = testFox.getName();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() {
        String expected = "Fox";
        String actual = testFox.getType();
        //assert
        assertEquals(expected, actual);
    }
}
