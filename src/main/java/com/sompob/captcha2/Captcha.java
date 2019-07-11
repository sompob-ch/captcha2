package com.sompob.captcha2;

public class Captcha {

    private int pattern;
    private int leftOperand;
    private int operator;
    private int rightOperand;

    private String listOperator[] = {"","+","-","*","/"};

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.pattern = pattern;
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public int getPattern() {
        return pattern;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }

    @Override
    public String toString() {
        return this.getLeft()+" "+this.getOperators()+" "+this.getRight();
    }

    public String getLeft() {
        if(this.getPattern() == 1){
            return new StringOperand(this.getLeftOperand()).getOperand();
        } else {
            return new NumberOperand(this.getLeftOperand()).getOperand();
        }
    }

    public String getRight() {
        if(this.getPattern() == 1){
            return new NumberOperand(this.getRightOperand()).getOperand();
        } else {
            return new StringOperand(this.getRightOperand()).getOperand();
        }
    }

    public String getOperators(){
        return this.listOperator[this.getOperator()];
    }
}
