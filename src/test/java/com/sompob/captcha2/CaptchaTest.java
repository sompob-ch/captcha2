package com.sompob.captcha2;

import org.junit.Assert;
import org.junit.Test;

public class CaptchaTest {

    @Test
    public void firstPatternShouldBeReturnOnePlus1(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("One + 1",captcha.toString());
    }

    @Test
    public void firstPatternShouldBeReturnNinePlus1(){
        Captcha captcha = new Captcha(1,9,1,1);
        Assert.assertEquals("Nine + 1",captcha.toString());
    }

    @Test
    public void firstPatternGetLeftOperandShouldBeOne(){
        Captcha captcha = new Captcha(1,1,1,1);
        String actual = captcha.getLeft();
        Assert.assertEquals("One",actual);
    }

    @Test
    public void firstPatternGetLeftOperandShouldBeNine(){
        Captcha captcha = new Captcha(1,9,1,1);
        String actual = captcha.getLeft();
        Assert.assertEquals("Nine",actual);
    }

    @Test
    public void secondPatternGetLeftOperandShouldBe1(){
        Captcha captcha = new Captcha(2,1,1,1);
        String actual = captcha.getLeft();
        Assert.assertEquals("1",actual);
    }

    @Test
    public void firstPatternGetRightOperandShouldBe1(){
        Captcha captcha = new Captcha(1,1,1,1);
        String actual = captcha.getRight();
        Assert.assertEquals("1",actual);
    }

    @Test
    public void secondPatternGetRightOperandShouldBeOne(){
        Captcha captcha = new Captcha(2,1,1,1);
        String actual = captcha.getRight();
        Assert.assertEquals("One",actual);
    }

    @Test
    public void getOperatorShouldBeMinus(){
        Captcha captcha = new Captcha(1,1,2,1);
        String actual = captcha.getOperators();
        Assert.assertEquals("-",actual);
    }

}
