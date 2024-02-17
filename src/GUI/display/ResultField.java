package GUI.display;

import java.awt.Font;

import javax.swing.JTextField;

public class ResultField extends JTextField {
    
    public ResultField() {
        initComponent();
    }

    private void initComponent() {
        new JTextField();
        setFont(new Font("Operator Mono", Font.PLAIN, 15));
        setEditable(false);
    }
}
