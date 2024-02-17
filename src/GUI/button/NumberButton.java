package GUI.button;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import GUI.display.DisplayField;

public class NumberButton implements ActionListener {

    private DisplayField displayField;

    public JTextField getDisplayField() {
        return this.displayField;
    }

    private String[] keypad = {
        "7", "8", "9",
        "4", "5", "6",
        "1", "2", "3",
        "0", ".", "AC",
        "+/-"
    };

    private JButton[] btns = new JButton[13];

    public NumberButton() {
        initComponent();
    }

    private void initComponent() {

        displayField = new DisplayField();

        for (int i = 0; i < btns.length; i++) {
            btns[i] = new JButton(keypad[i]);
            btns[i].setOpaque(false);
            btns[i].setFont(new Font("Operator Mono", Font.PLAIN, 20));
            btns[i].addActionListener(this);
        }
    }

    public JButton getBtn0() {
        return this.btns[9];
    }
    public JButton getBtn1() {
        return this.btns[6];
    }
    public JButton getBtn2() {
        return this.btns[7];
    }
    public JButton getBtn3() {
        return this.btns[8];
    }
    public JButton getBtn4() {
        return this.btns[3];
    }
    public JButton getBtn5() {
        return this.btns[4];
    }
    public JButton getBtn6() {
        return this.btns[5];
    }
    public JButton getBtn7() {
        return this.btns[0];
    }
    public JButton getBtn8() {
        return this.btns[1];
    }
    public JButton getBtn9() {
        return this.btns[2];
    }
    public JButton getDot() {
        return this.btns[10];
    }
    public JButton getAC() {
        return this.btns[11];
    }
    public JButton getPosOrNeg() {
        return this.btns[12];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString();
        switch (cmd) {
            case "0":
                displayField.setText(displayField.getText() + "0");
                break;
            case "1":
                displayField.setText(displayField.getText() + "1");
                break;
            case "2":
                displayField.setText(displayField.getText() + "2");
                break;
            case "3":
                displayField.setText(displayField.getText() + "3");
                break;
            case "4":
                displayField.setText(displayField.getText() + "4");
                break;
            case "5":
                displayField.setText(displayField.getText() + "5");
                break;
            case "6":
                displayField.setText(displayField.getText() + "6");
                break;
            case "7":
                displayField.setText(displayField.getText() + "7");
                break;
            case "8":
                displayField.setText(displayField.getText() + "8");
                break;
            case "9":
                displayField.setText(displayField.getText() + "9");
                break;
            case ".":
                if (!displayField.getText().contains(".")) {
                    displayField.setText(displayField.getText() + ".");
                }
                break;
            case "AC":
                displayField.setText("");
                break;
            case "+/-":
                double neg = Double.parseDouble(displayField.getText().toString());
                neg *= -1;
                displayField.setText(String.valueOf(neg));
                break;
            default:
        } 
    }
}
