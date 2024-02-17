package model;

public class MoneyExchange {
    
    /*
     * Constant value of Exchange rate of four different currencies for each to Cambodian Riel according to Google
     */
    private final double DOLLAR = 4086.67;
    private final double EURO = 4119.62;
    private final double FRANC = 4183.35;
    private final double POUND = 4844.74;
    private final double BAHT = 111.62;

    private double doubleAmount;

    public void setDoubleAmount(double doubleAmount) {
        this.doubleAmount = doubleAmount;
    }

    public double getDoubleAmount() {
        return this.doubleAmount;
    }

    public double dollarToRiel() {
        return this.doubleAmount * DOLLAR;
    }

    public double euroToRiel() {
        return this.doubleAmount * EURO;
    }

    public double francToRiel() {
        return this.doubleAmount * FRANC;
    }

    public double poundToRiel() {
        return this.doubleAmount * POUND;
    }

    public double bahtToRiel() {
        return this.doubleAmount * BAHT;
    }


    public double rielToDollar() {
        return this.doubleAmount / DOLLAR;
    }

    public double rielToEuro() {
        return this.doubleAmount / EURO;
    }

    public double rielToFranc() {
        return this.doubleAmount / FRANC;
    }

    public double rielToPound() {
        return this.doubleAmount / POUND;
    }

    public double rielToBaht() {
        return this.doubleAmount / BAHT;
    }
}
