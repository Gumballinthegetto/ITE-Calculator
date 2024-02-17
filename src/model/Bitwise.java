package model;

public class Bitwise {
    
    private int numA;
    private int numB;

    public void setNumA(int numA) {
        this.numA = numA;
    }
    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumA() {
        return this.numA;
    }
    public int getNumB() {
        return this.numB;
    }

    public int findBitwiseAND() {
        return this.numA & this.numB;
    }

    public int findBitwiseOR() {
        return this.numA | this.numB;
    }

    public int findBitwiseXOR() {
        return this.numA ^ numB;
    }

    public int findBitwiseLeftShift() {
        return this.numA << this.numB;
    }

    public int findBitwiseRightShift() {
        return this.numA >> this.numB;
    }

    public int findBitwiseInversion() {
        return ~ this.numA;
    }
}
