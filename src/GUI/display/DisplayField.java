package GUI.display;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class DisplayField extends JTextField {
   
    public DisplayField() {
        initComponent();
    }

    private void initComponent() {
        new JTextField();
        setHorizontalAlignment(JTextField.LEFT);
        setFont(new Font("Operator Mono", Font.PLAIN, 20));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && !Character.isWhitespace(c)) {
                    e.consume();
                }
            }
        });
    }
}
