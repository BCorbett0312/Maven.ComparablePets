package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DogTest {

    Dog testDog;

    @Before
    public void setup(){

        testDog = new Dog("dogName");
    }

    @Test
    public void speakTest(){
        String expected = "Woof";
        String actual = testDog.speak();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void instanceOfPetTest() {
        assertTrue(testDog instanceof Pet);
    }

    @Test
    public void getNameTest() {
        String expected = "dogName";
        String actual = testDog.getName();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() {
        String expected = "Dog";
        String actual = testDog.getType();
        //assert
        assertEquals(expected, actual);
    }

}
