package com.softserve.edu.training;
import org.junit.Assert;
import org.junit.Test;

public class TestFile {
    int height = 5;
    int widht = 7;
    int sumStars = 35;

    @Test
    public void uTest(){
        Assert.assertEquals(App.printStar(height,widht), sumStars);
    }

}
