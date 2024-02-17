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
import model.SetTheory;
import net.miginfocom.swing.MigLayout;

public class SetTheoryPanel extends JPanel implements ActionListener {
    
    private DisplayField displayField;
    private ResultField resultField;
    private SetTheory setTheory;
    private JLabel firstLabel, secondLabel, resultLabel;
    private JTextField setADisplayField, setBDisplayField;
    private JButton convertBtn, resetBtn;
    private JComboBox setBox;
    private String[] setItems = { "Union", "Intersection", "Difference" };

    public SetTheoryPanel() {
        super(new MigLayout("insets 10, fill", "[][][][][][]", "[][][][][]"));
        initComponents();
    }

    private void initComponents() {

        firstLabel = new JLabel("Set A:");
        firstLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        firstLabel.setHorizontalAlignment(JLabel.CENTER);
        secondLabel = new JLabel("Set B:");
        secondLabel.setHorizontalAlignment(JLabel.CENTER);
        secondLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        resultLabel = new JLabel();
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        resultLabel.setFont(new Font("Operator Mono", Font.PLAIN, 18));

        setADisplayField = new DisplayField();
        setBDisplayField = new DisplayField();

        convertBtn = new JButton("Convert");
        convertBtn.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        convertBtn.addActionListener(this);
        resetBtn = new JButton("Reset");
        resetBtn.setFont(new Font("Operator Mono", Font.PLAIN, 18));
        resetBtn.addActionListener(this);

        resultField = new ResultField();
        resultField.setFont(new Font("Operator Mono", Font.PLAIN, 20));

        setBox = new JComboBox<>(setItems);

        add(firstLabel, "span 2, growx, h 60!");
        add(setADisplayField, "span 4, growx, h 60!, wrap");

        add(secondLabel, "span 2, growx, h 60!");
        add(setBDisplayField, "span 4, growx, h 60!, wrap");

        add(setBox, "span 2, growx, skip 4, h 60!, wrap");

        add(resultLabel, "span 2, growx, h 60!");
        add(resultField, "span 4, growx, h 60!, wrap");

        add(convertBtn, "skip 2, span 2, growx, h 60!");
        add(resetBtn, "span 2, growx, h 60!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
