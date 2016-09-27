package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nazhirjackson on 9/26/16.
 */
public class CatTest {
    @Test
    public void speakTest(){
        Cat bob = new Cat("Billy");
        String expected = "Meow!!!";
        String actual = bob.speak();
        Assert.assertEquals("You should get Meow!!!", expected, actual);

    }
}
