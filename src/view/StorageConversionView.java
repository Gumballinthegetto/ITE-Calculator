package view;

import java.util.Scanner;

public class StorageConversionView {
    
    private double inputSize;
    private double result;

    public void setResult(double result) {
        this.result = result;
    }

    public double getInputSize() {
        return this.inputSize;
    }

    Scanner input = new Scanner(System.in);

    public void displaySetInput() {
        try {
            System.out.print("| Enter your input size: ");
            inputSize = input.nextDouble();
            System.out.println("| ~");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     *  Byte
     */
    public void displayByteToKilobyteView(double inputSize) {
        displayResultByteToOthers("kilobyte");
    }
    public void displayByteToMegabyteView(double inputSize) {   
        displayResultByteToOthers("megabyte");
    }
    public void displayByteToGigabyteView(double inputSize) {
        displayResultByteToOthers("gigabyte");
    }
    public void displayByteToTerabyteView(double inputSize) {
        displayResultByteToOthers("terabyte");
    }
    public void displayByteToPetabyteView(double inputSize) {
        displayResultByteToOthers("petabyte");
    }
    /*
     *  Kilobyte
     */
    public void displayKilobyteToByteView(double inputSize) {
        displayResultKilobyteToOthers("byte");
    }
    public void displayKilobyteToMegabyteView(double inputSize) {
        displayResultKilobyteToOthers("megabyte");
    }
    public void displayKilobyteToGigabyteView(double inputSize) {
        displayResultKilobyteToOthers("gigabyte");
    }
    public void displayKilobyteToTerabyteView(double inputSize) {
        displayResultKilobyteToOthers("terabyte");
    }
    public void displayKilobyteToPetabyteView(double inputSize) {
        displayResultKilobyteToOthers("petabyte");
    }
    /*
     *  Megabyte
     */
    public void displayMegabyteToByteView(double inputSize) {
        displayResultMegabyteToOthers("byte");
    }
    public void displayMegabyteToKilobyteView(double inputSize) {
        displayResultMegabyteToOthers("kilobyte");
    }
    public void displayMegabyteToGigabyteView(double inputSize) { 
        displayResultMegabyteToOthers("giagbyte");
    }
    public void displayMegabyteToTerabyteView(double inputSize) {
        displayResultMegabyteToOthers("terabyte");
    }
    public void displayMegabyteToPetabyteView(double inputSize) {
        displayResultMegabyteToOthers("petabyte");
    }
    /*
     *  Gigabyte
     */
    public void displayGigabyteToByte(double inputSize) {
        displayResultGigabyteToOthers("byte");
    }
    public void displayGigabyteToKilobyte(double inputSize) {
        displayResultGigabyteToOthers("kilobyte");
    }
    public void displayGigabyteToMegabyte(double inputSize) {
        displayResultGigabyteToOthers("megabyte");
    }
    public void displayGigabyteToTerabyte(double inputSize) {
        displayResultGigabyteToOthers("terabyte");
    }
    public void displayGigabyteToPetabyte(double inputSize) {
        displayResultGigabyteToOthers("petabyte");
    }
    /*
     *  Terabyte
     */
    public void displayTerabyteTobyte(double inputSize) {
        displayResultTerabyteToOthers("byte");
    }
    public void displayTerabyteToKilobyte(double inputSize) {
        displayResultTerabyteToOthers("kilobyte");
    }
    public void displayTerabyteToMegabyte(double inputSize) {
        displayResultTerabyteToOthers("megabyte");
    }
    public void displayTerabyteToGigabyte(double inputSize) {
        displayResultTerabyteToOthers("gigabyte");
    }
    public void displayTerabyteToPetabyte(double inputSize) {
        displayResultTerabyteToOthers("petabyte");
    }
    /*
     *  Petabyte
     */
    public void displayPetabytetoByte(double inputSize) {
        displayResultPetabyteToOthers("byte");
    }
    public void displayPetabyteToKilobyte(double inputSize) {
        displayResultPetabyteToOthers("kilobyte");
    }
    public void displayPetabyteToMegabyte(double inputSize) {
        displayResultPetabyteToOthers("megabyte");
    }
    public void displayPetabyteToGigabyte(double inputSize) {
        displayResultPetabyteToOthers("gigabyte");
    }
    public void displayPetabyteToTerabyte(double inputSize) {
        displayResultPetabyteToOthers("terabyte");
    }

    private void displayResultByteToOthers(String unit) {
        System.out.println("| " + inputSize + " byte = " + result + " " + unit);
    }
    private void displayResultKilobyteToOthers(String unit) {
        System.out.println("| " + inputSize + " kilobyte = " + result + " " + unit);
    } 
    private void displayResultMegabyteToOthers(String unit) {
        System.out.println("| " + inputSize + " megabyte = " + result + " " + unit);
    }
    private void displayResultGigabyteToOthers(String unit) {
        System.out.println("| " + inputSize + " gigabyte = " + result + " " + unit);
    }
    private void displayResultTerabyteToOthers(String unit) {
        System.out.println("| " + inputSize + " terabyte = " + result + " " + unit);
    }
    private void displayResultPetabyteToOthers(String unit) {
        System.out.println("| " + inputSize + " petabyte = " + result + " " + unit);
    }
}
