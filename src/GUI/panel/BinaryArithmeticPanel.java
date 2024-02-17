package GUI.panel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import GUI.display.DisplayField;
import GUI.display.ResultField;
import model.BinaryArithmetic;
import net.miginfocom.swing.MigLayout;

public class BinaryArithmeticPanel extends JPanel implements ActionListener, ItemListener {
    
    private final String BINARYARITHMETICPANEL = "Binary Arithmetic";
    private final String COMPLEMENTSPANEL = "1's & 2's Complement";

    private DisplayField firstDisplayField, secondDisplayField, compDisplayField;
    private ResultField binaryArithResultField, compResultField;
    private JComboBox firstBox, secondBox, panelBox;
    private BinaryArithmetic binaryArithmetic;
    private JPanel complementsPanel, binaryArithmeticPanel, cardPanel, comboBoxPanel;
    private String[] panelItems = { BINARYARITHMETICPANEL, COMPLEMENTSPANEL };
    private String[] complementItems = {
        "1's complement", "2's complement"
    };
    private String[] binaryArithmeticItems = {
        "+", "-", "x", "/"
    };
    private JButton firstConvertBtn, secondConvertBtn, firstResetBtn, secondResetBtn;

    public BinaryArithmeticPanel() {
        super(new MigLayout("fill", "[][][][]"));
        initComponents();
    }

    private void initComponents() {

        binaryArithmetic = new BinaryArithmetic();

        firstDisplayField = new DisplayField();
        secondDisplayField = new DisplayField();
        compDisplayField = new DisplayField();

        binaryArithResultField = new ResultField();
        binaryArithResultField.setFont(new Font("Operator Mono", Font.PLAIN, 20));
        compResultField = new ResultField();
        compResultField.setFont(new Font("Operator Mono", Font.PLAIN, 20));

        firstConvertBtn = new JButton("Convert");
        firstConvertBtn.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        secondConvertBtn = new JButton("Convert");
        secondConvertBtn.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        firstResetBtn = new JButton("Reset");
        firstResetBtn.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        secondResetBtn = new JButton("Reset");
        secondResetBtn.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        // first panel
        binaryArithmeticPanel = new JPanel(new MigLayout("fill", "[][][][]", "[][][][][]"));
        firstBox = new JComboBox<>(binaryArithmeticItems);

        binaryArithmeticPanel.add(firstDisplayField, "span, growx, h 80!, wrap");

        binaryArithmeticPanel.add(firstBox, "skip 2, w 150!, wrap");

        binaryArithmeticPanel.add(secondDisplayField, "span, growx, h 80!, wrap");

        binaryArithmeticPanel.add(firstConvertBtn, "span 2, growx, h 50!");
        binaryArithmeticPanel.add(firstResetBtn, "span 2, growx, h 50!, wrap");

        binaryArithmeticPanel.add(binaryArithResultField, "span, growx, h 80!");

        // second panel
        complementsPanel = new JPanel(new MigLayout("insets 10, fill", "[][][][]", "[][][][]"));

        secondBox = new JComboBox<>(complementItems);

        complementsPanel.add(compDisplayField, "span, growx, h 80!, wrap");

        complementsPanel.add(secondBox, "skip 2, w 150!, wrap");

        complementsPanel.add(compResultField, "span, growx, h 80!, wrap");

        complementsPanel.add(secondConvertBtn, "span 2, growx, h 50!");
        complementsPanel.add(secondResetBtn, "span 2, growx, h 50!");

        cardPanel = new JPanel(new CardLayout());
        cardPanel.add(binaryArithmeticPanel, BINARYARITHMETICPANEL);
        cardPanel.add(complementsPanel, COMPLEMENTSPANEL);

        comboBoxPanel = new JPanel();
        panelBox = new JComboBox<>(panelItems);
        panelBox.setEditable(false);
        panelBox.addItemListener(this);
        comboBoxPanel.add(panelBox, BorderLayout.PAGE_START);

        add(comboBoxPanel, "span, growx");
        add(cardPanel, "span, growx");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout layout = (CardLayout)(cardPanel.getLayout());
        layout.show(cardPanel, (String)e.getItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString();

    }
}
