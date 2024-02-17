package controller;

import model.Bitwise;
import view.BitwiseView;
import view.MainView;

public class BitwiseController {
    
    private Bitwise bitwiseModel;
    private BitwiseView bitwiseView;
    private MainView mainView;
    private int bitwiseChoice;
    private int result;

    public BitwiseController(BitwiseView view, MainView mainView) {
        this.bitwiseModel = new Bitwise();
        this.bitwiseView = view;
        this.mainView = mainView;
    }

    public void updateModel() {
        int numA, numB;

        numA = bitwiseView.getNumA();
        numB = bitwiseView.getNumB();

        bitwiseModel.setNumA(numA);
        bitwiseModel.setNumB(numB);

        bitwiseChoice = mainView.getChoice();

        switch (bitwiseChoice) {
            case 1:
                result = bitwiseModel.findBitwiseAND();
                bitwiseView.setResult(result);
                break;
            case 2:
                result = bitwiseModel.findBitwiseOR();
                bitwiseView.setResult(result);
                break;
            case 3:
                result = bitwiseModel.findBitwiseXOR();
                bitwiseView.setResult(result);
                break;
            case 4:
                result = bitwiseModel.findBitwiseLeftShift();
                bitwiseView.setResult(result);
                break;
            case 5:
                result = bitwiseModel.findBitwiseRightShift();
                bitwiseView.setResult(result);
                break;
            case 6:
                result = bitwiseModel.findBitwiseInversion();
                bitwiseView.setResult(result);
                break;
        }
    }

    public void updateView() {
        bitwiseChoice = mainView.getChoice();

        switch (bitwiseChoice) {
            case 1:
                bitwiseView.displayBitwiseANDView(bitwiseModel.getNumA(), bitwiseModel.getNumB());
                break;
            case 2:
                bitwiseView.displayBitwiseORView(bitwiseModel.getNumA(), bitwiseModel.getNumB());
                break;
            case 3:
                bitwiseView.displayBitwiseXORView(bitwiseModel.getNumA(), bitwiseModel.getNumB());
                break;
            case 4:
                bitwiseView.displayLeftShift(bitwiseModel.getNumA(), bitwiseModel.getNumB());
                break;
            case 5:
                bitwiseView.displayRightShift(bitwiseModel.getNumA(), bitwiseModel.getNumB());
                break;
            case 6:
                bitwiseView.displayBitInversion(bitwiseModel.getNumA());
                break;
        }
    }
}
