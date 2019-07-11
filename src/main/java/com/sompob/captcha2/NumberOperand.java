package com.sompob.captcha2;

public class NumberOperand {

    private int operand;
    private String array[] = {"0","1","2","3","4","5","6","7","8","9"};

    public NumberOperand(int operand) {
        this.operand = operand;
    }

    public String getOperand(){
        return this.array[this.operand];
    }
}
