package controller;

import model.Arithmetic;
import view.ArithmeticView;
import view.MainView;
/**
 *  Arithmetic Controller - get inputs from view, update to Arithmetic class, then update back to Arithmetic View class
 */
public class ArithmeticController {
    
    private int arithmeticChoice;
    private Arithmetic arithmeticModel;
    private ArithmeticView arithmeticView;
    private MainView mainView;
    private double result;

    /**
     * Arithmetic Controller Constructor - initially get objects from Arithmetic Model, MainView, and Arithmetic View
     * @param mainView
     * @param arithmeticView
     */
    public ArithmeticController(ArithmeticView arithmeticView, MainView mainView) {
        this.arithmeticModel = new Arithmetic();
        this.mainView = mainView;
        this.arithmeticView = arithmeticView;
    }
    
    /**
     * Update Model - method to update inputs from view to model
     */
    public void updateModel() {
        double numA, numB;

        numA = arithmeticView.getNumA();
        numB = arithmeticView.getNumB();

        arithmeticModel.setNumA(numA);
        arithmeticModel.setNumB(numB);

        arithmeticChoice = mainView.getChoice();

        switch (arithmeticChoice)
        {
            case 1:
                result = arithmeticModel.sum();
                arithmeticView.setResult(result);
                break;
            case 2:
                result = arithmeticModel.sub();
                arithmeticView.setResult(result);
                break;
            case 3:
                result = arithmeticModel.mult();
                arithmeticView.setResult(result);
                break;
            case 4:
                result = arithmeticModel.div();
                arithmeticView.setResult(result);
                break;
            case 5:
                result = arithmeticModel.mod();
                arithmeticView.setResult(result);
                break;
        }
    }

    /**
     * Update view - method to get datas from model back to view
     */
    public void updateView() {
        arithmeticChoice = mainView.getChoice();

        switch (arithmeticChoice)
        {
            case 1:
                arithmeticView.displaySumView(arithmeticModel.getNumA(), arithmeticModel.getNumB());
                break;
            case 2:
                arithmeticView.displayDiffView(arithmeticModel.getNumA(), arithmeticModel.getNumB());
                break;
            case 3:
                arithmeticView.displayMultView(arithmeticModel.getNumA(), arithmeticModel.getNumB());
                break;
            case 4:
                arithmeticView.displayDivView(arithmeticModel.getNumA(), arithmeticModel.getNumB());
                break;
            case 5:
                arithmeticView.displayModView(arithmeticModel.getNumA(), arithmeticModel.getNumB());
                break;
        }
    }
}
