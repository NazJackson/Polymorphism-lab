package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nazhirjackson on 9/26/16.
 */
public class DogTest {
    @Test
    public void speakTest(){
        Dog bob = new Dog("Billy");
        String expected = "Bark!!";
        String actual = bob.speak();
        Assert.assertEquals("You should get Billy", expected, actual);

    }
}
