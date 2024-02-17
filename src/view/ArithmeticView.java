package view;

import java.util.Scanner;

/**
 * Arithmetic View - contains inputs from user and class interface to display to user
 */
public class ArithmeticView {

    private double numA, numB, result;
    /*
     * Setter method
     */
    public void setResult(double result) {
        this.result = result;
    }
    /*
     * Getter methods
     */
    public double getNumA() {
        return this.numA;
    }
    public double getNumB() {
        return this.numB;
    }

    Scanner input = new Scanner(System.in);

    // method to display inputs
    public void displaySetInputs() {
        System.out.println("+---------------------------------------------+");
        try {
            System.out.print("| Enter your first input: ");
            numA = input.nextDouble();
            System.out.print("| Enter your second input: ");
            numB = input.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("| ~");
    }

    /*
     * Methods to display view
     */
    public void displaySumView(double numA, double numB) {
        displayResult('+');
    }

    public void displayDiffView(double numA, double numB) {
        displayResult('-');
    }

    public void displayMultView(double numA, double numB) {
        displayResult('x');
    }

    public void displayDivView(double numA, double numB) {
        displayResult('/');
    }
    
    public void displayModView(double numA, double numB) {
        displayResult('%');
    }

    // method to display result
    private void displayResult(char operationSymbol) {
        System.out.println("| " + numA + " " + operationSymbol + " " + numB + " = " + result);
    }
}
