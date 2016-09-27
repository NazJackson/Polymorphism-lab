package io.zipcoder.pets;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nazhirjackson on 9/26/16.
 */
public class PetTest {

@Test
    public void speakTest(){
    Pet bob = new Pet("Billy", "Pet");
    String expected = "Speaking";
    String actual = bob.speak();
    Assert.assertEquals("You should get Billy", expected, actual);

}


}
