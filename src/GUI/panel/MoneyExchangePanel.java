package GUI.panel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.button.NumberButton;
import GUI.display.ResultField;
import model.MoneyExchange;
import net.miginfocom.swing.MigLayout;

public class MoneyExchangePanel extends JPanel implements ActionListener {
    
    private NumberButton keypad;
    private JTextField displayField;
    private ResultField resultField;
    private JComboBox firstBox, secondBox;
    private JButton convertBtn;
    private JLabel firstLabel, secondLabel;
    private double amount, result;
    private String[] currencies = {
        "USD", "EUR", "CHF",
        "GBP", "THB", "KHR"
    };
    private MoneyExchange moneyExchange;
    private DecimalFormat df;

    public MoneyExchangePanel() {
        super(new MigLayout("insets 10 10 10 0, fill", "[][][][][][][][]", "[][][][][]"));

        moneyExchange = new MoneyExchange();

        df = new DecimalFormat("#.##");

        keypad = new NumberButton();

        resultField = new ResultField();
        resultField.setFont(new Font("Operator Mono", Font.PLAIN, 20));

        convertBtn = new JButton("<>");
        convertBtn.setFont(new Font("Operator Mono", Font.PLAIN, 16));
        convertBtn.setBorderPainted(false);
        convertBtn.addActionListener(this);

        firstBox = new JComboBox<>(currencies);
        secondBox = new JComboBox<>(currencies);

        firstLabel = new JLabel();
        firstLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        secondLabel = new JLabel();
        secondLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        displayField = keypad.getDisplayField();

        add(displayField, "h 50!, span 4, growx");
        add(firstLabel, "h 50!, span 2, growx");
        add(keypad.getAC(), "w 80!, wrap, h 70!");

        add(firstBox, "h 50!, span 2, growx");
        add(keypad.getBtn7(), "h 70!, w 80!, skip 2");
        add(keypad.getBtn8(), "h 70!, w 80!");
        add(keypad.getBtn9(), "wrap, h 70!, w 80!");
        
        add(convertBtn, "h 70!, w 170!, span 2, growx");
        add(keypad.getBtn0(), "h 70!, w 80!, skip");
        add(keypad.getBtn4(), "h 70!, w 80!");
        add(keypad.getBtn5(), "h 70!, w 80!");
        add(keypad.getBtn6(), "wrap, h 70!, w 80!");

        add(secondBox, "h 50!, span 2, growx");
        add(keypad.getBtn1(), "h 70!, w 80!, skip 2");
        add(keypad.getBtn2(), "h 70!, w 80!");
        add(keypad.getBtn3(), "wrap, h 70!, w 80!");

        add(resultField, "h 50!, span 4, growx");
        add(secondLabel, "h 50!, span 2, growx");
        add(keypad.getDot(), "h 70!, w 80!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString();
        
        if (cmd.equalsIgnoreCase("<>")) {
            if (!displayField.getText().isEmpty()) {
                amount = Double.parseDouble(displayField.getText().toString());
                moneyExchange.setDoubleAmount(amount);

                switch (firstBox.getSelectedItem().toString()) {
                    case "KHR":
                        if (secondBox.getSelectedItem().equals("USD")) {
                            result = moneyExchange.rielToDollar();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Riel");
                            secondLabel.setText("Dollar");
                        }
                        else if (secondBox.getSelectedItem().equals("EUR")) {
                            result = moneyExchange.rielToEuro();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Riel");
                            secondLabel.setText("Euro");
                        }
                        else if (secondBox.getSelectedItem().equals("CHF")) {
                            result = moneyExchange.rielToFranc();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Riel");
                            secondLabel.setText("Franc");
                        }
                        else if (secondBox.getSelectedItem().equals("GBP")) {
                            result = moneyExchange.rielToPound();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Riel");
                            secondLabel.setText("Pound");
                        }
                        else if (secondBox.getSelectedItem().equals("THB")) {
                            result = moneyExchange.rielToBaht();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Riel");
                            secondLabel.setText("Baht");
                        }
                        break;
                    case "USD":
                        if (secondBox.getSelectedItem().equals("KHR")) {
                            result = moneyExchange.dollarToRiel();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Dollar");
                            secondLabel.setText("Riel");
                        }
                        break;
                    case "EUR":
                        if (secondBox.getSelectedItem().equals("KHR")) {
                            result = moneyExchange.euroToRiel();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Euro");
                            secondLabel.setText("Riel");
                        }
                        break;
                    case "CHF":
                        if (secondBox.getSelectedItem().equals("KHR")) {
                            result = moneyExchange.francToRiel();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Franc");
                            secondLabel.setText("Riel");
                        }
                        break;
                    case "GBP":
                        if (secondBox.getSelectedItem().equals("KHR")) {
                            result = moneyExchange.poundToRiel();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Pound");
                            secondLabel.setText("Riel");
                        }
                        break;
                    case "THB":
                        if (secondBox.getSelectedItem().equals("KHR")) {
                            result = moneyExchange.bahtToRiel();
                            resultField.setText(String.valueOf(df.format(result)));
                            firstLabel.setText("Baht");
                            secondLabel.setText("Riel");
                        }
                        break;
                    default:
                }
            }
        }
    }
}
