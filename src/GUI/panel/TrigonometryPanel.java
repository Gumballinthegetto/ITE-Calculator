package GUI.panel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.button.NumberButton;
import GUI.display.ResultField;
import model.Trigonometry;
import net.miginfocom.swing.MigLayout;

public class TrigonometryPanel extends JPanel implements ActionListener {

    private NumberButton keypad;
    private ResultField resultField;
    private JTextField displayField;
    private int operator = 0;
    private String trigonometryKeypad[] = {
        "Sin", "Sind", "Cos", 
        "Cosd", "Tan", "Tand", 
        "x^m", "Deg to Rad",
        "="
    };
    private JButton trigonometryBtns[] = new JButton[9];
    private double firstNum = 0, secondNum = 0;
    private double result;
    private Trigonometry trigonometry;

    public TrigonometryPanel() {
        super(new MigLayout("insets 10, fill", "[][][][][]", "[][][][][][][]"));
        initComponents();
    }

    private void initComponents() {
        
        trigonometry = new Trigonometry();

        keypad = new NumberButton();
        resultField = new ResultField();

        displayField = keypad.getDisplayField();
        

        for (int i = 0; i < trigonometryBtns.length; i++) {
            trigonometryBtns[i] = new JButton(trigonometryKeypad[i]);
            trigonometryBtns[i].setFont(new Font("Operator Mono", Font.PLAIN, 18));
            trigonometryBtns[i].addActionListener(this);
        }

        add(resultField, "h 40!, span, grow, wrap");

        add(displayField, "h 60!, span 5, growx, growy, wrap");

        add(trigonometryBtns[6], "spanx 2, growx, h 50!");
        add(trigonometryBtns[7], "spanx 3, growx, h 50!, wrap");

        add(keypad.getAC(), "w 130!, h 50!");
        add(keypad.getBtn7(), "h 50!, w 70!");
        add(keypad.getBtn8(), "h 50!, w 70!");
        add(keypad.getBtn9(), "h 50!, w 70!");
        add(keypad.getPosOrNeg(), "w 130!, h 50!, wrap");

        add(trigonometryBtns[4], "w 130!, h 50!");
        add(keypad.getBtn4(), "h 50!, w 70!");
        add(keypad.getBtn5(), "h 50!, w 70!");
        add(keypad.getBtn6(), "h 50!, w 70!");
        add(trigonometryBtns[5], "w 130!, h 50!, wrap");

        add(trigonometryBtns[2], "w 130!, h 50!");
        add(keypad.getBtn1(), "h 50!, w 70!");
        add(keypad.getBtn2(), "h 50!, w 70!");
        add(keypad.getBtn3(), "h 50!, w 70!");
        add(trigonometryBtns[3], "w 130!, h 50!, wrap");

        add(trigonometryBtns[0], "w 130!, h 50!");
        add(keypad.getBtn0(), "h 50!, w 70!");
        add(keypad.getDot(), "h 50!, w 70!");
        add(trigonometryBtns[8], "h 50!, w 70!");
        add(trigonometryBtns[1], "w 130!, h 50!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString(); 
        switch (cmd) {
            case "Sin":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    trigonometry.setNumDouble(firstNum);
                    result = trigonometry.findSin();
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf("Sin(" + firstNum + ") (Degree) = " + result));
                }
                break;
            case "Sind":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    trigonometry.setNumDouble(firstNum);
                    result = trigonometry.findSind();
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf("Sind(" + firstNum + ") (Radian) = " + result));
                }
                break;
            case "Cos":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    trigonometry.setNumDouble(firstNum);
                    result = trigonometry.findCos();
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf("Cos(" + firstNum + ") (Degree) = " + result));
                }
                break;
            case "Cosd":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    trigonometry.setNumDouble(firstNum);
                    result = trigonometry.findCosd();
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf("Cosd(" + firstNum + ") (Radian) = " + result));
                }
                break;
            case "Tan":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    trigonometry.setNumDouble(firstNum);
                    result = trigonometry.findTan();
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf("Tan(" + firstNum + ") (Degree) = " + result));
                }
                break;
            case "Tand":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    trigonometry.setNumDouble(firstNum);
                    result = trigonometry.findTand();
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf("Tand(" + firstNum + ") (Radian) = " + result));
                }
                break;
            case "x^m":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    operator = 1;
                    displayField.setText("");
                }
                break;
            case "Deg to Rad":
                if (!displayField.getText().isEmpty()) {
                    firstNum = Double.parseDouble(displayField.getText().toString());
                    trigonometry.setNumDouble(firstNum);
                    result = trigonometry.degreeToRadian();
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf(firstNum + " Degree = " + result + " Radian"));
                }
                break;
            default:
        }

        if (cmd.equalsIgnoreCase("=")) {
            secondNum = Double.parseDouble(displayField.getText().toString());
            switch (operator) {
                case 1:
                    result = Math.pow(firstNum, secondNum);
                    displayField.setText(String.valueOf(result));
                    resultField.setText(String.valueOf(firstNum + " ^ " + secondNum + " = " + result));
                    break;
                default:
            }
        }
    }
}
