package model;

public class StorageConversion {
    
    /*
     * Constant values of each storage unit in bytes
     */
    private final int KILOBYTE = 1024;
    private final int MEGABYTE = KILOBYTE * 1024;
    private final int GIGABYTE = MEGABYTE * 1024;
    private final int TERABYTE = GIGABYTE * 1024;
    private final int PETABYTE = TERABYTE * 1024;

    private double inputSize;

    public void setInputSize(double inputSize) {
        this.inputSize = inputSize;
    } 

    public double getInputSize() {
        return this.inputSize;
    }

    /*
     *  Byte to others
     */
    public double byteToKilobyte() {
        return this.inputSize / KILOBYTE;
    }
    public double byteToMegabyte() {
        return this.inputSize / MEGABYTE;
    }
    public double byteToGigabyte() {
        return this.inputSize / GIGABYTE;
    }
    public double byteToTerabyte() {
        return this.inputSize / TERABYTE;
    }
    public double byteToPetabyte() {
        return this.inputSize / PETABYTE;
    }

    /*
     *  Kilobyte to others
     */
    public double kilobyteTobyte() {
        return this.inputSize * KILOBYTE;
    }
    public double kilobyteToMegabyte() {
        return this.inputSize / KILOBYTE;
    }
    public double kilobyteToGigabyte() {
        return this.inputSize / MEGABYTE;
    }
    public double kilobyteToTerabyte() {
        return this.inputSize / GIGABYTE;
    }
    public double kilobyteToPetabyte() {
        return this.inputSize / TERABYTE;
    }

    /*
     *  Megabyte to others
     */
    public double megabyteToByte() {
        return this.inputSize * MEGABYTE;
    }
    public double megabyteToKiloBtye() {
        return this.inputSize * KILOBYTE;
    }
    public double megabyteToGigaByte() {
        return this.inputSize / KILOBYTE;
    }
    public double megabyteToTeraByte() {
        return this.inputSize / MEGABYTE;
    }
    public double megabyteToPetaBtye() {
        return this.inputSize / GIGABYTE;
    }

    /*
     *  Gigabyte to others
     */
    public double gigabyteToByte() {
        return this.inputSize * GIGABYTE;
    }
    public double gigabyteToKilobyte() {
        return this.inputSize * MEGABYTE;
    }
    public double gigabyteToMegabyte() {
        return this.inputSize * KILOBYTE;
    }
    public double gigabyteToTerabyte() {
        return this.inputSize / KILOBYTE;
    }
    public double gigabyteToPetabyte() {
        return this.inputSize / MEGABYTE;
    }

    /*
     *  Terabyte to others
     */
    public double terabyteToByte() {
        return this.inputSize * TERABYTE;
    }
    public double terabyteToKilobyte() {
        return this.inputSize * GIGABYTE;
    }
    public double terabyteToMegabyte() {
        return this.inputSize * MEGABYTE;
    }
    public double terabyteToGigabyte() {
        return this.inputSize * KILOBYTE;
    }
    public double terabyteToPetabyte() {
        return this.inputSize / KILOBYTE;
    }

    /*
     *  Petabyte to others
     */
    public double petabyteToByte() {
        return this.inputSize * PETABYTE;
    }
    public double petabyteToKilobyte() {
        return this.inputSize * TERABYTE;
    }
    public double petabyteToMegabyte() {
        return this.inputSize * GIGABYTE;
    }
    public double petabyteToGigabyte() {
        return this.inputSize * MEGABYTE;
    }
    public double petabyteToTerabyte() {
        return this.inputSize * KILOBYTE;
    }
}