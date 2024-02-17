import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import GUI.panel.MainPanel;
/**
 *  InterfaceITECalculator  - a whole GUI liked interface for this semester calculator (in progess)
 *                            which consists of panels such as:
 *                            1. Arithmetic Panel           (done)
 *                            2. Trigonometry Panel         (done)
 *                            3. Bitwise Panel              (done)
 *                            4. MoneyExchange Panel        (done)
 *                            5. Storage Conversion         (done)
 *                            6. Number System Conversion   (done)
 *                            7. Binary Arithmetic        (done, not yet implement algorithm to panel)
 *                            8. Set Theory               (done, not yet implement algorithm to panel)
 */
public class InterfaceITECalculator {
    public static void main(String[] args) {
        try {
            // set the brushed metal look and feel, if desired
            System.setProperty("apple.awt.brushMetalLook", "true");
  
            // use the mac system menu bar
            System.setProperty("apple.laf.useScreenMenuBar", "true");
  
            // set the "About" menu item name
            System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiStar");
  
            // use smoother fonts
            System.setProperty("apple.awt.textantialiasing", "true");

            // ref: http://developer.apple.com/releasenotes/Java/Java142RNTiger/1_NewFeatures/chapter_2_section_3.html
            System.setProperty("apple.awt.graphics.EnableQ2DX","true");
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }

    private static void createGUI() {
        JFrame frame = new JFrame("Beyond Calculator!");

        frame.getContentPane().add(new MainPanel(), BorderLayout.CENTER);
        frame.setIconImage(new ImageIcon("src/GUI/image/calculator.png").getImage());
        frame.setSize(560, 500);
        frame.setLocation(450, 150);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
