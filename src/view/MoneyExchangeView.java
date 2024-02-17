package view;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyExchangeView {
    
    private double doubleAmount;
    private double result;

    public void setResult(double result) {
        this.result = result;
    }

    public double getDoubleAmount() {
        return this.doubleAmount;
    }

    Scanner input = new Scanner(System.in);
    DecimalFormat only2FloatingPoints = new DecimalFormat("#.##");

    public void displaySetInputDouble() {
        System.out.print("| Enter any amount: ");
        doubleAmount = input.nextDouble();
        System.out.println("| ~");
    }

    public void displayRielToDollarView(double doubleAmount) {
        displayRielToOthersResult("dollar");
    }

    public void displayRielToEuroView(double doubleAmount) {
        displayRielToOthersResult("euro");
    }

    public void displayRielToFrancView(double doubleAmount) {
        displayRielToOthersResult("franc");
    }

    public void displayRielToPoundView(double doubleAmount) {
        displayRielToOthersResult("pound");
    }

    public void displayRielToBahtView(double doubleAmount) {
        displayRielToOthersResult("baht");
    }

    public void displayDollarToRielView(double doubleAmount) {
        displayOthersToRielResult("dollar");
    }

    public void displayEuroToRielView(double doubleAmount) {
        displayOthersToRielResult("euro");
    }

    public void displayFrancToRielView(double doubleAmount) {
        displayOthersToRielResult("franc");
    }

    public void displayPoundToRielView(double doubleAmount) {
        displayOthersToRielResult("pound");
    }

    public void displayBahtToRielView(double doubleAmount) {
        displayOthersToRielResult("baht");
    }

    private void displayRielToOthersResult(String currency) {
        System.out.println("| " + doubleAmount + " riel " + " = " + only2FloatingPoints.format(result) + " " + currency);
    }

    private void displayOthersToRielResult(String currency) {
        System.out.println("| " + doubleAmount + " " + currency + " = " + only2FloatingPoints.format(result) + " riel");
    }
}
