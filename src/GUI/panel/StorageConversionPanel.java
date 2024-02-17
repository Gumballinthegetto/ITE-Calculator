package GUI.panel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.button.NumberButton;
import GUI.display.ResultField;
import model.StorageConversion;
import net.miginfocom.swing.MigLayout;

public class StorageConversionPanel extends JPanel implements ActionListener {
    
    private NumberButton keypad;
    private ResultField resultField;
    private JLabel firstLabel, secondLabel;
    private JTextField displayField;
    private JComboBox firstBox, secondBox;
    private JButton convertBtn;
    private double size, result;
    private String[] storageUnits = {
        "Byte", "Kilobyte", "Megabyte", 
        "Gigabyte", "Terabyte", "Petabyte"
    };
    private StorageConversion storageConversion;

    public StorageConversionPanel() {
        super(new MigLayout("insets 10 10 10 0, fill", "[][][][][][][][]", "[][][][][]"));

        initComponents();
    }

    private void initComponents() {

        storageConversion = new StorageConversion();
        keypad = new NumberButton();

        resultField = new ResultField();
        resultField.setFont(new Font("Operator Mono", Font.PLAIN, 20));

        displayField = keypad.getDisplayField();

        convertBtn = new JButton("<>");
        convertBtn.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        convertBtn.setBorderPainted(false);
        convertBtn.addActionListener(this);

        firstLabel = new JLabel();
        firstLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        secondLabel = new JLabel();
        secondLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        firstBox = new JComboBox<>(storageUnits);
        secondBox = new JComboBox<>(storageUnits);

        add(keypad.getAC(), "h 70!, w 80!");
        add(firstLabel, "h 50!, skip");
        add(displayField, "h 50!, span 4, growx, wrap");

        add(keypad.getBtn7(), "h 70!, w 80!");
        add(keypad.getBtn8(), "h 70!, w 80!");
        add(keypad.getBtn9(), "h 70!, w 80!");
        add(firstBox, "span 2, growx, skip 2, wrap");

        add(keypad.getBtn4(), "h 70!, w 80!");
        add(keypad.getBtn5(), "h 70!, w 80!");
        add(keypad.getBtn6(), "h 70!, w 80!");
        add(keypad.getBtn0(), "h 70!, w 80!, skip");
        add(convertBtn, "h 70!, w 170!, span 2, growx, wrap");

        add(keypad.getBtn1(), "h 70!, w 80!");
        add(keypad.getBtn2(), "h 70!, w 80!");
        add(keypad.getBtn3(), "h 70!, w 80!");
        add(secondBox, "span 2, growx, skip 2, wrap");

        add(keypad.getDot(), "h 70!, w 80!");
        add(secondLabel, "h 50!, skip");
        add(resultField, "h 50!, span 4, growx");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString();

        if (cmd.equalsIgnoreCase("<>")) {
            if (!displayField.getText().isEmpty()) {
                size = Double.parseDouble(displayField.getText().toString());
                storageConversion.setInputSize(size);

                switch (firstBox.getSelectedItem().toString()) {
                    case "Byte":
                        firstLabel.setText("Byte");
                        switch (secondBox.getSelectedItem().toString()) {
                            case "Kilobyte":
                                secondLabel.setText("Kilobyte");
                                result = storageConversion.byteToKilobyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Megabyte":
                                secondLabel.setText("Megabyte");
                                result = storageConversion.byteToMegabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Gigabyte":
                                secondLabel.setText("Gigabyte");
                                result = storageConversion.byteToGigabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Terabyte":
                                secondLabel.setText("Terabyte");
                                result = storageConversion.byteToTerabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Petabyte":
                                secondLabel.setText("Petabyte");
                                result = storageConversion.byteToPetabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            default:
                        }
                        break;
                    case "Kilobyte":
                        firstLabel.setText("Kilobyte");
                        switch (secondBox.getSelectedItem().toString()) {
                            case "Byte":
                                secondLabel.setText("Byte");
                                result = storageConversion.kilobyteTobyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Megabyte":
                                secondLabel.setText("Megabyte");
                                result = storageConversion.kilobyteToMegabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Gigabyte":
                                secondLabel.setText("Gigabyte");
                                result = storageConversion.kilobyteToGigabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Terabyte":
                                secondLabel.setText("Terabyte");
                                result = storageConversion.kilobyteToTerabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Petabyte":
                                secondLabel.setText("Petabyte");
                                result = storageConversion.kilobyteToPetabyte();
                                break;
                        }
                        break;
                    case "Megabyte":
                        firstLabel.setText("Megabyte");
                        switch (secondBox.getSelectedItem().toString()) {
                            case "Byte":
                                secondLabel.setText("Byte");
                                result = storageConversion.megabyteToByte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Kilobyte":
                                secondLabel.setText("Kilobyte");
                                result = storageConversion.megabyteToKiloBtye();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Gigabyte":
                                secondLabel.setText("Gigabyte");
                                result = storageConversion.megabyteToGigaByte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Terabyte":
                                secondLabel.setText("Terabyte");
                                result = storageConversion.megabyteToTeraByte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Petabyte":
                                secondLabel.setText("Petabyte");
                                result = storageConversion.megabyteToPetaBtye();
                                resultField.setText(String.valueOf(result));
                                break;
                            default:
                        }
                        break;
                    case "Gigabyte":
                        firstLabel.setText("Gigabyte");
                        switch (secondBox.getSelectedItem().toString()) {
                            case "Byte":
                                secondLabel.setText("Byte");
                                result = storageConversion.megabyteToGigaByte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Kilobyte":
                                secondLabel.setText("Kilobyte");
                                result = storageConversion.megabyteToKiloBtye();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Megabyte":
                                secondLabel.setText("Megabyte");
                                result = storageConversion.megabyteToGigaByte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Terabyte":
                                secondLabel.setText("Terabyte");
                                result = storageConversion.megabyteToTeraByte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Petabyte":
                                secondLabel.setText("Petabyte");
                                result = storageConversion.megabyteToPetaBtye();
                                resultField.setText(String.valueOf(result));
                                break;
                        }
                        break;
                    case "Terabyte":
                        firstLabel.setText("Terabyte");
                        switch (secondBox.getSelectedItem().toString()) {
                            case "Byte":
                                secondLabel.setText("Byte");
                                result = storageConversion.terabyteToByte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Kilobyte":
                                secondLabel.setText("Kilobyte");
                                result = storageConversion.terabyteToKilobyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Megabyte":
                                secondLabel.setText("Megabyte");
                                result = storageConversion.terabyteToMegabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Gigabyte":
                                secondLabel.setText("Gigabyte");
                                result = storageConversion.terabyteToGigabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Petabyte":
                                secondLabel.setText("Petabyte");
                                result = storageConversion.terabyteToPetabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            default:
                        }
                        break;
                    case "Petabyte":
                        firstLabel.setText("Petabyte");
                        switch (secondBox.getSelectedItem().toString()) {
                            case "Byte":
                                secondLabel.setText("Byte");
                                result = storageConversion.petabyteToByte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Kilobyte":
                                secondLabel.setText("Kilobyte");
                                result = storageConversion.petabyteToKilobyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Megabyte":
                                secondLabel.setText("Megabyte");
                                result = storageConversion.petabyteToMegabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Gigabyte":
                                secondLabel.setText("Gigabyte");
                                result = storageConversion.petabyteToGigabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            case "Terabyte":
                                secondLabel.setText("Terabyte");
                                result = storageConversion.petabyteToTerabyte();
                                resultField.setText(String.valueOf(result));
                                break;
                            default:
                        }
                        break;
                }
            }
        }
    }
}
