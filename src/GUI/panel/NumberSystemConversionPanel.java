package GUI.panel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.display.DisplayField;
import GUI.display.ResultField;
import model.NumberSystemConversion;
import net.miginfocom.swing.MigLayout;

public class NumberSystemConversionPanel extends JPanel implements ActionListener {
    
    private JTextField displayField;
    private ResultField resultField;
    private JLabel firstLabel, secondLabel, slashLabel1, slashLabel2;
    private JComboBox firstBox, secondBox;
    private String number, result;
    private JButton[] numberSystemBtns = new JButton[8];
    private String[] numberSystemComps = {
        "a", "b", "c",
        "d", "e", "f",
        "Convert", "Reset"
    };
    private String[] bases = {
        "2 (Binary)", "8 (Octal)",
        "10 (Demical)", "16 (Hex)"
    };
    private NumberSystemConversion numberSystemConversion;

    public NumberSystemConversionPanel() {
        super(new MigLayout("insets 30 0 0 0, fill", "[][][][][][][][]", "[][][][][]"));
        initComponents();
    }

    private void initComponents() {

        numberSystemConversion = new NumberSystemConversion();

        resultField = new ResultField();
        resultField.setFont(new Font("Operator Mono", Font.PLAIN, 20));

        displayField = new DisplayField();

        firstLabel = new JLabel("From base:");
        firstLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        secondLabel = new JLabel("To base:");
        secondLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        slashLabel1 = new JLabel("|");
        slashLabel1.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        slashLabel2 = new JLabel("|");
        slashLabel2.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        firstBox = new JComboBox<>(bases);
        secondBox = new JComboBox<>(bases);

        for (int i = 0; i < numberSystemComps.length; i++) {
            numberSystemBtns[i] = new JButton(numberSystemComps[i]);
            numberSystemBtns[i].setFont(new Font("Operator Mono", Font.PLAIN, 18));
            numberSystemBtns[i].addActionListener(this);
        }

        add(displayField, "span 4, growx, wrap, h 50!");
        
        add(firstLabel, "span 2, growx, h 50!");
        add(firstBox, "span 2, growx, h 50!");
        add(slashLabel1, "h 50!");
        add(numberSystemBtns[0], "h 50!, w 70!");
        add(numberSystemBtns[1], "h 50!, w 70!");
        add(numberSystemBtns[2], "h 50!, w 70!, wrap");

        add(secondLabel, "span 2, growx, h 50!");
        add(secondBox, "span 2, growx, h 50!");
        add(slashLabel2, "h 50!");
        add(numberSystemBtns[3], "h 50!,  w 70!");
        add(numberSystemBtns[4], "h 50!, w 70!");
        add(numberSystemBtns[5], "h 50!, w 70!, wrap");

        add(resultField, "span 4, growx, wrap, h 50!");
        
        add(numberSystemBtns[6], "h 50!, span 2, growx");
        add(numberSystemBtns[7], "h 50!, span 2, growx, wrap");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString();
        
        switch (cmd) {
            case "a":
                displayField.setText(displayField.getText() + "a");
                break;
            case "b":
                displayField.setText(displayField.getText() + "b");
                break;
            case "c":
                displayField.setText(displayField.getText() + "c");
                break;
            case "d":
                displayField.setText(displayField.getText() + "d");
                break;
            case "e":
                displayField.setText(displayField.getText() + "e");
                break;
            case "f":
                displayField.setText(displayField.getText() + "f");
                break;
            case "Reset":
                displayField.setText("");
                break;
            default:
        }

        if (cmd.equalsIgnoreCase("Convert")) {
            if (!displayField.getText().isEmpty()) {
                number = displayField.getText();
                numberSystemConversion.setNumber(number);
                switch (firstBox.getSelectedItem().toString()) {
                    case "2 (Binary)":
                        switch (secondBox.getSelectedItem().toString()) {
                            case "8 (Octal)":
                                result = numberSystemConversion.binaryToOctal();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "10 (Demical)":
                                result = numberSystemConversion.binaryToDecimal();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "16 (Hex)":
                                result = numberSystemConversion.binaryToHex();
                                resultField.setText(String.valueOf(result));
                                break;
                            default:
                        }
                    case "8 (Octal)":
                        switch (secondBox.getSelectedItem().toString()) {
                            case "2 (Binary)":
                                result = numberSystemConversion.octalToBinary();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "10 (Decimal)":
                                result = numberSystemConversion.octalToDecimal();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "16 (Hex)":
                                result = numberSystemConversion.octalToHex();
                                resultField.setText(String.valueOf(result));
                                break;
                            default:
                        }
                    case "10 (Decimal)":
                        switch (secondBox.getSelectedItem().toString()) {
                            case "2 (Binary)":
                                result = numberSystemConversion.decimalToBinary();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "8 (Octal)":
                                result = numberSystemConversion.decimalToOctal();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "16 (Hex)":
                                result = numberSystemConversion.decimalToHex();
                                resultField.setText(String.valueOf(result));
                                break;
                            default:
                        }
                    case "16 (Hex)":
                        switch (secondBox.getSelectedItem().toString()) {
                            case "2 (Binary)":
                                result = numberSystemConversion.hexToBinary();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "8 (Octal)":
                                result = numberSystemConversion.hexToOctal();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "10 (Decimal)":
                                result = numberSystemConversion.hexToDecimal();
                                resultField.setText(String.valueOf(result));
                                break;
                            default:
                        }
                    default:
                }
            }
        }
    }
}
