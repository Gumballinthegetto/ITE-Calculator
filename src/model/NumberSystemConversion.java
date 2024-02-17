package model;

public class NumberSystemConversion {
    
    private String number;
    private String result;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    // Decimal to others
    public String decimalToBinary() {
        result = baseConversion(number, 10, 2);
        return result;
    }
    public String decimalToOctal() {
        result = baseConversion(number, 10, 8);
        return result;
    }
    public String decimalToHex() {
        result = baseConversion(number, 10, 16);
        return result;
    }

    // Binary to others
    public String binaryToDecimal() {
        result = baseConversion(number, 2, 10);
        return result;
    }
    public String binaryToOctal() {
        result = baseConversion(number, 2, 8);
        return result;
    }
    public String binaryToHex() {
        result = baseConversion(number, 2, 16);
        return result;
    }

    // Octal to others
    public String octalToDecimal() {
        result = baseConversion(number, 8, 10);
        return result;
    }
    public String octalToBinary() {
        result = baseConversion(number, 8, 2);
        return result;
    }
    public String octalToHex() {
        result = baseConversion(number, 8, 16);
        return result;
    }

    // Hexadecimal to others
    public String hexToDecimal() {
        result = baseConversion(number, 16, 10);
        return result;
    }
    public String hexToBinary() {
        result = baseConversion(number, 16, 2);
        return result;
    }
    public String hexToOctal() {
        result = baseConversion(number, 16, 8);
        return result;
    }

    private String baseConversion(String number, int from, int to) {
        return Integer.toString(Integer.parseInt(number, from), to);
    }
}
