package GUI.panel;

import javax.swing.JTabbedPane;

public class MainPanel extends JTabbedPane {

    private static final String ARITHMETIC = "Arithmetic";
    private static final String TRIGONOMETRY = "Trigonometry";
    private static final String BITWISE = "Bitwise";
    private static final String MONEYEXCHANGE = "Money Exchange";
    private static final String STORAGE = "Storage Conversion";
    private static final String NUMBERSYSTEM = "Number System Conversion";
    private static final String BINARYARITHMETIC = "Binary Arithmetic";
    private static final String SETTHEORY = "Set Theory";

    public MainPanel() {
        add(ARITHMETIC, new ArithmeticPanel());
        add(TRIGONOMETRY, new TrigonometryPanel());
        add(BITWISE, new BitwisePanel());
        add(MONEYEXCHANGE, new MoneyExchangePanel());
        add(STORAGE, new StorageConversionPanel());
        add(NUMBERSYSTEM, new NumberSystemConversionPanel());
        add(BINARYARITHMETIC, new BinaryArithmeticPanel());
        add(SETTHEORY, new SetTheoryPanel());
    }
}
