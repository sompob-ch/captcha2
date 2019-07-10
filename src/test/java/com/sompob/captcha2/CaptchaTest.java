package com.sompob.captcha2;

import org.junit.Assert;
import org.junit.Test;

public class CaptchaTest {

    @Test
    public void firstPatternShouldBeReturnOnePlus1(){
        Captcha captcha = new Captcha(1,2,1,1);
        Assert.assertEquals("One + 1",captcha.toString());
    }

}
