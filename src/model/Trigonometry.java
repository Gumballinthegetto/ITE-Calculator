package model;
/**
 *  Trigonometry model - contains datas and business logics of Trigonometry class
 */
public class Trigonometry {

    private int numInt;
    private double numDouble;
    /*
     * Setter methods
     */
    public void setNumInt(int numInt) {
        this.numInt = numInt;
    }
    public void setNumDouble(double numDouble) {
        this.numDouble = numDouble;
    }
    /*
     * Getter methods
     */
    public int getNumInt() {
        return this.numInt;
    }
    public double getNumDouble() {
        return this.numDouble;
    }

    /**
     * Sin (degree) - method to find sin of any degrees 
     * @return result of sin(degree) as double
     */
    public double findSin() {
        return Math.sin(Math.toRadians(numDouble));
    }

    /**
     * Sind (radian) - method to find sinh of any radians
     * @return result of sinh(radian) as double
     */
    public double findSind() {
        return Math.sinh(numDouble);
    }

    /**
     * Cos (degree) - method to find cos of any degrees
     * @return result of cos(degree) as double
     */
    public double findCos() {
        return Math.cos(Math.toRadians(numDouble));
    }

    /**
     * Cosd (radian) - method to find cosh of any radians
     * @return result of cosd(radian) as double
     */
    public double findCosd() {
        return Math.cosh(numDouble);
    }

    /**
     * Tan (degree) - method to find tan of any degrees
     * @return result of tan(degree) as double
     */
    public double findTan() {
        return Math.tan(Math.toRadians(numDouble));
    }

    /**
     * Tand (radians) - method to find tanh of any radians
     * @return result of tand(radian) as double
     */
    public double findTand() {
        return Math.tanh(numDouble);
    }

    /**
     * Square2 (int) - method to find square 2 of any integers 
     * @return result of sqaure2 as int
     */
    public int findSquare2Int() {
        return numInt * numInt;
    }

    /**
     * Square2 (double) - method to find square 2 of any numbers 
     * @return result of sqaure2 as double
     */
    public double findSquare2Double() {
        return Math.pow(numDouble, 2);
    }

    /**
     * Sqaure3 (int) - method to find sqaure 3 of any integers
     * @return result of square3 as int
     */
    public int findSquare3Int() {
        return numInt * numInt * numInt;
    }

    /**
     * Sqaure3 (double) - method to find sqaure 3 of any numbers
     * @return result of sqaure3 as double
     */
    public double findSquare3Double() {
        return Math.pow(numDouble, 3);
    }

    /**
     * Degree to Radian - method to convert degree to radian
     * @return result of degree to radian as double
     */
    public double degreeToRadian() {
        return Math.toRadians(numDouble);
    }
}