package com.sompob.captcha2;

public class StringOperand {

    private int operand;
    private String array[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public StringOperand(int operand) {
        this.operand = operand;
    }

//    @Override
//    public String toString() {
//        return this.array[this.operand];
//    }

    public String getOperand(){
        return this.array[this.operand];
    }
}
