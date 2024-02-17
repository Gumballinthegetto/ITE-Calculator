package model;
/**
 * Arithmetic Model - contain datas and business logics of Arithmetic class
 */
public class Arithmetic {

    private double numA;
    private double numB;
 
    public void setNumA(double numA) {
        this.numA = numA;
    }
    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getNumA() {
        return this.numA;
    }
    public double getNumB() {
        return this.numB;
    }

    /**
     * Summation - method to add two numbers (numA, numB)
     * @return result of two double numbers (numA + numB)
     */
    public double sum() {
        return this.numA + this.numB;
    }
    /**
     * Subtraction - method to subtruct two numbers (numA, numB)
     * @return result of two double numbers (numA - numB)
     */
    public double sub() {
        return this.numA - this.numB;
    }
    /**
     * Multiplication - method to multiply two numbers (numA, numB)
     * @return result of two double numbers (numA * numB)
     */
    public double mult() {
        return this.numA * this.numB;
    }
    /**
     * Division - method to divide two numbers (numA, numB)
     * @return result of two double numbers (numA / numB)
     */
    public double div() {
        return this.numA / this.numB;
    }
    /**
     * Modulo - method to get remainder from two numbers (numA, numB)
     * @return resulf of two double numbers (numA % numB)
     */
    public double mod() {
        return this.numA % this.numB;
    }
}