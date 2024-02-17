package model;

public class BinaryArithmetic {
    
    private String input1, input2;
    private int num1, num2;

    public void setInput1(String input) {
        this.input1 = input;
    }
    public void setInput2(String input) {
        this.input2 = input;
    }

    public String getInput1() {
        return this.input1;
    }
    public String getInput2() {
        return this.input2;
    }

    public String binaryAdd() {
        num1 = Integer.parseInt(input1, 2);
        num2 = Integer.parseInt(input2, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

    public String binarySub() {
        num1 = Integer.parseInt(input1, 2);
        num2 = Integer.parseInt(input2, 2);
        int sub = num1 - num2;
        return Integer.toBinaryString(sub);
    }

    public String binarymult() {
        num1 = Integer.parseInt(input1, 2);
        num2 = Integer.parseInt(input2, 2);
        int mult = num1 * num2;
        return Integer.toBinaryString(mult);
    }

    public String binaryDiv() {
        num1 = Integer.parseInt(input1, 2);
        num2 = Integer.parseInt(input2, 2);
        int div = num1 / num2;
        return Integer.toBinaryString(div);
    }

    public String firstComp() {
        String firstComp = "";

        for (int i = 0; i < input1.length(); i++) {
            firstComp += flip(input1.charAt(i));   
        }
        return firstComp;
    }

    public String secondComp() {
        String secondComp = firstComp();
        int i;

        for (i = input1.length() - 1; i >= 0; i--) {
            if (secondComp.charAt(i) == '1') {
                secondComp = secondComp.substring(0, i) + '0' + secondComp.substring(i + 1);
            } else {
                secondComp = secondComp.substring(0, i) + '1' + secondComp.substring(i + 1);
                break;
            }
        }
        if (i == -1) {
            secondComp = '1' + secondComp;
        }
        return secondComp;
    }

    private char flip(char c) {
        return (c == '0') ? '1' : '0'; // if c == '0', change it to '1' else to '0'
    }
}
