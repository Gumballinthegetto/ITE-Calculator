package GUI.panel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.button.NumberButton;
import GUI.display.ResultField;
import model.Bitwise;
import net.miginfocom.swing.MigLayout;

public class BitwisePanel extends JPanel implements ActionListener {
    
    private NumberButton keypad;
    private ResultField resultField;
    private JTextField displayField;
    private String bitwiseKeypad[] = {
        "AND", "OR", "XOR",
        "<<", ">>", "~",
        "=", "+/-"
    };

    private JButton bitwiseBtns[] = new JButton[8];
    private int firstNum = 0, secondNum = 0;
    private int result;
    private int operator = 0;
    private Bitwise bitwise;

    public BitwisePanel() {
        super(new MigLayout("insets 10 10 1 10, fill", "[][][][][]", "[][]10[]8[]8[]8[]"));

        initComponents();
    }

    private void initComponents() {

        bitwise = new Bitwise();

        keypad = new NumberButton();
        resultField = new ResultField();

        displayField = keypad.getDisplayField();

        for (int i = 0; i < bitwiseBtns.length; i++) {
            bitwiseBtns[i] = new JButton(bitwiseKeypad[i]);
            bitwiseBtns[i].setFont(new Font("Operator Mono", Font.PLAIN, 18));
            bitwiseBtns[i].addActionListener(this);
        }

        add(resultField, "h 40!, span, grow, wrap");

        add(displayField, "h 60!, span 5, growx, growy, wrap");

        add(keypad.getAC(), "w 140!, h 65!");
        add(keypad.getBtn7(), "h 65!, w 70!");
        add(keypad.getBtn8(), "h 65!, w 70!");
        add(keypad.getBtn9(), "h 65!, w 70!");
        add(bitwiseBtns[7], "w 140!, h 65!, wrap");

        add(bitwiseBtns[2], "w 140!, h 65!");
        add(keypad.getBtn4(), "h 65!, w 70!");
        add(keypad.getBtn5(), "h 65!, w 70!");
        add(keypad.getBtn6(), "h 65!, w 70!");
        add(bitwiseBtns[4], "w 140!, h 65!, wrap");

        add(bitwiseBtns[1], "w 140!, h 65!");
        add(keypad.getBtn1(), "h 65!, w 70!");
        add(keypad.getBtn2(), "h 65!, w 70!");
        add(keypad.getBtn3(), "h 65!, w 70!");
        add(bitwiseBtns[3], "w 140!, h 65!, wrap");

        add(bitwiseBtns[0], "w 140!, h 60!");
        add(keypad.getBtn0(), "h 60!, w 70!");
        add(bitwiseBtns[6], "h 60!, span 2, growx");
        add(bitwiseBtns[5], "w 140!, h 60!, wrap");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString();

        switch (cmd) {
            case "AND":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Integer.parseInt(displayField.getText().toString());
                    bitwise.setNumA(firstNum);
                    operator = 1;
                    displayField.setText("");
                }
                break;
            case "OR":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Integer.parseInt(displayField.getText().toString());
                    bitwise.setNumA(firstNum);
                    operator = 2;
                    displayField.setText("");
                }
                break;
            case "XOR":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Integer.parseInt(displayField.getText().toString());
                    bitwise.setNumA(firstNum);
                    operator = 3;
                    displayField.setText("");
                }
                break;
            case "<<":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Integer.parseInt(displayField.getText().toString());
                    bitwise.setNumA(firstNum);
                    operator = 4;
                    displayField.setText("");
                }
                break;
            case ">>":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Integer.parseInt(displayField.getText().toString());
                    bitwise.setNumA(firstNum);
                    operator = 5;
                    displayField.setText("");
                }
                break;
            case "~":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Integer.parseInt(displayField.getText().toString());
                    bitwise.setNumA(firstNum);
                    result = bitwise.findBitwiseInversion();
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf("BitInversion of " + firstNum + " = " + result));
                }
                break;
            case "+/-":
                int neg = Integer.parseInt(displayField.getText().toString());
                neg *= -1;
                displayField.setText(String.valueOf(neg));
                break;
            default:
        }

        if (!displayField.getText().equalsIgnoreCase("=")) {
            switch (operator) {
                case 1:
                    if (!displayField.getText().isEmpty()) {
                        secondNum = Integer.parseInt(displayField.getText().toString());
                        bitwise.setNumB(secondNum);
                        result = bitwise.findBitwiseAND();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " AND " + secondNum + " = " + result));
                    }
                    break;
                case 2:
                    if (!displayField.getText().isEmpty()) {
                        secondNum = Integer.parseInt(displayField.getText().toString());
                        bitwise.setNumB(secondNum);
                        result = bitwise.findBitwiseOR();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " OR " + secondNum + " = " + result));
                    }
                    break;
                case 3:
                    if (!displayField.getText().isEmpty()) {
                        secondNum = Integer.parseInt(displayField.getText().toString());
                        bitwise.setNumB(secondNum);
                        result = bitwise.findBitwiseXOR();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " XOR " + secondNum + " = " + result));
                    }
                    break;
                case 4:
                    if (!displayField.getText().isEmpty()) {
                        secondNum = Integer.parseInt(displayField.getText().toString());
                        bitwise.setNumB(secondNum);
                        result = bitwise.findBitwiseLeftShift();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " << " + secondNum + " = " + result));
                    }
                    break;
                case 5:
                    if (!displayField.getText().isEmpty()) {
                        secondNum = Integer.parseInt(displayField.getText().toString());
                        bitwise.setNumB(secondNum);
                        result = bitwise.findBitwiseRightShift();
                        displayField.setText(String.valueOf(result));
                        resultField.setText(String.valueOf(firstNum + " >> " + secondNum + " = " + result));
                    }
                    break;
                default:
            }
        }
    }
}
