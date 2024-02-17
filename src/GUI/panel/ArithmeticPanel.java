package GUI.panel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.button.NumberButton;
import GUI.display.ResultField;
import model.Arithmetic;
import net.miginfocom.swing.MigLayout;

public class ArithmeticPanel extends JPanel implements ActionListener {
    
    private ResultField resultField;
    private NumberButton keyPad;
    private JTextField displayField;
    private String[] arithmeticKeypad = {
        "%", "mod", "+", 
        "-", "x", "/",
        "sqr", "x^2", "1/x",
        "="
    };
    private int operator = 0;
    private JButton[] arithmeticBtns = new JButton[10];
    private double firstNum = 0, secondNum = 0;
    private double result;
    private Arithmetic arithmetic;
    
    public ArithmeticPanel() {
        super(new MigLayout("insets 10, fill", "[][][][][]", "[][][][][][][]"));
        initComponents();
    }

    private void initComponents() {

        arithmetic = new Arithmetic();

        // keypads
        keyPad = new NumberButton();
        resultField = new ResultField();
        
        displayField = keyPad.getDisplayField();
        
        for (int i = 0; i < arithmeticBtns.length; i++) {
           arithmeticBtns[i] = new JButton(arithmeticKeypad[i]);
           arithmeticBtns[i].setFont(new Font("Operator Mono", Font.PLAIN, 20));
           arithmeticBtns[i].addActionListener(this);
        }
        
        // first row / display input and result
        add(resultField, "h 40!, span, growx, wrap");

        // second row
        add(displayField, "h 60!, span, growx, wrap");

        // third row
        add(arithmeticBtns[2], "w 130!, h 50!");
        add(arithmeticBtns[3], "h 50!, w 70!");
        add(arithmeticBtns[4], "h 50!, w 70!");
        add(arithmeticBtns[5], "h 50!, w 70!");
        add(arithmeticBtns[1], "w 130!, h 50!, wrap");

        // fourth row
        add(arithmeticBtns[6], "w 130!, h 50!");
        add(keyPad.getBtn7(), "h 50!, w 70!");
        add(keyPad.getBtn8(), "h 50!, w 70!");
        add(keyPad.getBtn9(), "h 50!, w 70!");
        add(keyPad.getPosOrNeg(), "w 130!, h 50!, wrap");

        // fifth row
        add(arithmeticBtns[7], "w 130!, h 50!");
        add(keyPad.getBtn4(), "h 50!, w 70!");
        add(keyPad.getBtn5(), "h 50!, w 70!");
        add(keyPad.getBtn6(), "h 50!, w 70!");
        add(arithmeticBtns[0], "w 130!, h 50!, wrap");

        // sixth row
        add(arithmeticBtns[8], "w 130!, h 50!");
        add(keyPad.getBtn1(), "h 50!, w 70!");
        add(keyPad.getBtn2(), "h 50!, w 70!");
        add(keyPad.getBtn3(), "h 50!, w 70!");
        add(keyPad.getDot(), "w 130!, h 50!, wrap");

        // seventh row
        add(keyPad.getAC(), "h 50!, span 2, growx");
        add(keyPad.getBtn0(), "h 50!, w 70!");
        add(arithmeticBtns[9], "h 50!, span 2, growx");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString();
        switch (cmd) {
            /**
             *  Operators +, - , x, /, and mod
             */
            case "+":
                // if display field is not empty, get the first input
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    arithmetic.setNumA(firstNum);
                    operator = 1;
                    displayField.setText("");
                }
                break;
            case "-":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    arithmetic.setNumA(firstNum);
                    operator = 2;
                    displayField.setText("");
                }
                break;
            case "x":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    arithmetic.setNumA(firstNum);
                    operator = 3;
                    displayField.setText("");
                }
                break;
            case "/":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    arithmetic.setNumA(firstNum);
                    operator = 4;
                    displayField.setText("");
                }
                break;
            case "mod":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    arithmetic.setNumA(firstNum);
                    operator = 5;
                    displayField.setText("");
                }
                break;
            /**
             *  Include - sqr (square root), x^2 (pow of 2), 1/x (fraction)
             */
            case "sqr":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    result = Math.sqrt(firstNum);
                    displayField.setText(String.valueOf(result)); 
                    resultField.setText(String.valueOf("Square root of " + firstNum + " = " + result));
                }
                break;
            case "x^2":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    result = firstNum * firstNum;
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf(firstNum + " ^ 2 = " + result));
                }
                break;
            case "1/x":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                }
                break;
            /**
             *  set number to its percentage
             */
            case "%":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    result = firstNum / 100;
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf("Percentage of " + firstNum + " = " + result));
                }
                break;
            default:
        }
        // do operations when "=" got pressed
        if (cmd.equalsIgnoreCase("=")) {
            if (!displayField.getText().isEmpty()) {
                secondNum = Double.parseDouble(displayField.getText().toString());
                arithmetic.setNumB(secondNum);
                switch (operator) {
                    case 1: // case "+"
                        result = arithmetic.sum();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " + " + secondNum + " = " + result));
                        break;
                    case 2: // case "-"
                        result = arithmetic.sub();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " - " + secondNum + " = " + result));
                        break;
                    case 3: // case "x"
                        result = arithmetic.mult();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " x " + secondNum + " = " + result));
                        break;
                    case 4: // case "/"
                        result = arithmetic.div();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " / " + secondNum + " = " + result));
                        break;
                    case 5: // case "mod"
                        result = arithmetic.mod();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " mod " + secondNum + " = " + result));
                        break;
                    default:
                }
            }
        }
    }
}
