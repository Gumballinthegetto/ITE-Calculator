package view;

import java.util.Scanner;

public class TrigonometryView {
    
    private int numInt;
    private double numDouble;
    private int resultInt;
    private double resultDouble;
    /*
     * Setter method
     */
    public void setResultInt(int resultInt) {
        this.resultInt = resultInt;
    }
    public void setResultDouble(double resultDouble) {
        this.resultDouble = resultDouble;
    }
    /*
     * Getter method
     */
    public int getNumInt() {
        return this.numInt;
    }
    public double getNumDouble() {
        return this.numDouble;
    }

    Scanner input = new Scanner(System.in);

    /*
     * Methods to display set inputs
     */
    public void displaySetInputInt() {
        System.out.println("+---------------------------------------------+");
        System.out.print("| Enter your input: ");
        numInt = input.nextInt();
        System.out.println("| ~");
    }
    public void displaySetInputDouble() {
        System.out.println("+---------------------------------------------+");
        System.out.print("| Enter your input: ");
        numDouble = input.nextDouble();
        System.out.println("| ~");
    }

    /*
     * Methods to display view
     */
    public void displaySinView(double numDouble) {
        displayResultDouble(numDouble, "Sin");
    }

    public void displaySindView(double numDouble) {
        displayResultDouble(numDouble, "Sind");
    }

    public void displayCosView(double numDouble) {
        displayResultDouble(numDouble, "Cos");
    }

    public void displayCosdView(double numDouble) {
        displayResultDouble(numDouble, "Cosd");
    }

    public void displayTanView(double numDouble) {
        displayResultDouble(numDouble, "Tan");
    }

    public void displayTandView(double numDouble) {
        displayResultDouble(numDouble, "Tand");
    }

    public void displaySquare2IntView(int numInt) {
        displayResultInt(numInt, "Square2 (int) of");
    }

    public void displaySquare2DoubleView(double numDouble) {
        displayResultDouble(numDouble, "Square2 (double) of");
    }

    public void displaySquare3IntView(int numInt) {
        displayResultInt(numInt, "Square3 (int) of");
    }

    public void displaySquare3DoubleView(double numDouble) {
        displayResultDouble(numDouble, "Sqaure3 (double) of");
    }

    public void displayDegreeToRadianView(double numDouble) {
        displayResultDouble(numDouble, "Degree to Radian of");
    }

    // method to display result
    private void displayResultDouble(double numDouble, String word) {
        System.out.println("| " + word + " (" + numDouble + ") = " + resultDouble);
    }

    private void displayResultInt(int numInt, String word) {
        System.out.println("| " + word + " (" + numInt + ") = " + resultInt);
    }
}
