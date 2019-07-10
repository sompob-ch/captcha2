package com.sompob.captcha2;

import org.junit.Assert;
import org.junit.Test;

public class CaptchaTest {

    @Test
    public void firstPatternShouldBeReturnOnePlus1(){
        Captcha captcha = new Captcha();
        Assert.assertEquals("One + 1",captcha.toString());
    }

}
