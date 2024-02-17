package controller;
/**
 *  Trogonometry Controller - get inputs from view, update to Trigonometry class, then update back to Trigonometry View class
 */

import model.Trigonometry;
import view.MainView;
import view.TrigonometryView;

public class TrigonometryController {
    
    private int trigonometryChoice;
    private Trigonometry trigonometryModel;
    private TrigonometryView trigonometryView;
    private MainView mainView;
    private int resultInt;
    private double resultDouble;

    public TrigonometryController(TrigonometryView view, MainView mainView) {
        this.trigonometryModel = new Trigonometry();
        this.trigonometryView = view;
        this.mainView = mainView;
    }

    public void updateModel() {
        int numInt;
        double numDouble;

        numInt = trigonometryView.getNumInt();
        numDouble = trigonometryView.getNumDouble();

        trigonometryModel.setNumInt(numInt);
        trigonometryModel.setNumDouble(numDouble);

        trigonometryChoice = mainView.getChoice();

        switch (trigonometryChoice) {
            case 1:
                resultDouble = trigonometryModel.findSin();
                trigonometryView.setResultDouble(resultDouble);
                break;
            case 2:
                resultDouble = trigonometryModel.findSind();
                trigonometryView.setResultDouble(resultDouble);
                break;
            case 3:
                resultDouble = trigonometryModel.findCos();
                trigonometryView.setResultDouble(resultDouble);
                break;
            case 4:
                resultDouble = trigonometryModel.findCosd();
                trigonometryView.setResultDouble(resultDouble);
                break;
            case 5:
                resultDouble = trigonometryModel.findTan();
                trigonometryView.setResultDouble(resultDouble);
                break;
            case 6:
                resultDouble = trigonometryModel.findTand();
                trigonometryView.setResultDouble(resultDouble);
                break;
            case 7:
                resultInt = trigonometryModel.findSquare2Int();
                trigonometryView.setResultInt(resultInt);
                break;
            case 8:
                resultDouble = trigonometryModel.findSquare2Double();
                trigonometryView.setResultDouble(resultDouble);
                break;
            case 9:
                resultInt = trigonometryModel.findSquare3Int();
                trigonometryView.setResultInt(resultInt);
                break;
            case 10:
                resultDouble = trigonometryModel.findSquare3Double();
                trigonometryView.setResultDouble(resultDouble);
                break;
            case 11:
                resultDouble = trigonometryModel.degreeToRadian();
                trigonometryView.setResultDouble(resultDouble);
                break;
        }
    }

    public void updateView() {
        trigonometryChoice = mainView.getChoice();

        switch (trigonometryChoice) {
            case 1:
                trigonometryView.displaySinView(trigonometryModel.getNumDouble());
                break;
            case 2:
                trigonometryView.displaySindView(trigonometryModel.getNumDouble());
                break;
            case 3:
                trigonometryView.displayCosView(trigonometryModel.getNumDouble());
                break;
            case 4:
                trigonometryView.displayCosdView(trigonometryModel.getNumDouble());
                break;
            case 5:
                trigonometryView.displayTanView(trigonometryModel.getNumDouble());
                break;
            case 6:
                trigonometryView.displayTandView(trigonometryModel.getNumDouble());
                break;
            case 7:
                trigonometryView.displaySquare2IntView(trigonometryModel.getNumInt());
                break;
            case 8:
                trigonometryView.displaySquare2DoubleView(trigonometryModel.getNumDouble());
                break;
            case 9:
                trigonometryView.displaySquare3IntView(trigonometryModel.getNumInt());
                break;
            case 10:
                trigonometryView.displaySquare3DoubleView(trigonometryModel.getNumDouble());
                break;
            case 11:
                trigonometryView.displayDegreeToRadianView(trigonometryModel.getNumDouble());
                break;
        }
    }
}