package view;

import java.util.Scanner;

public class BitwiseView {
    
    private int numA, numB;
    private int result;

    public void setResult(int result) {
        this.result = result;
    }

    public int getNumA() {
        return this.numA;
    }
    public int getNumB() {
        return this.numB;
    }

    Scanner input = new Scanner(System.in);

    public void displayOneSetInput() {
        System.out.print("| Enter your input: ");
        numA = input.nextInt();
        System.out.println("| ~");
    }

    public void displayTwoSetInput() {
        System.out.print("| Enter your first input: ");
        numA = input.nextInt();
        System.out.print("| Enter your second input: ");
        numB = input.nextInt();
        System.out.println("| ~");
    }

    public void displayBitwiseORView(int numA, int numB) {
        displayResult("BitwiseAND", "|");
    }

    public void displayBitwiseANDView(int numA, int numB) {
        displayResult("BitwiseOR", "&");
    }

    public void displayBitwiseXORView(int numA, int numB) {
        displayResult("BitwiseXOR", "^");
    }

    public void displayLeftShift(int numA, int numB) {
        displayResult("LeftShift", "<<");
    }

    public void displayRightShift(int numA, int numB) {
        displayResult("RightShift", ">>");
    }

    public void displayBitInversion(int numA) {
        System.out.println("| Bit Inversion of ( ~ " + numA + " ) = " + result);
    }

    
    private void displayResult(String keywords, String bitwiseOp) {
        System.out.println("| " + keywords + " of ( " + numA + " " + bitwiseOp + " " + numB + " ) = " + result);
    }
}
