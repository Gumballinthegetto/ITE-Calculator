package controller;

import model.MoneyExchange;
import view.MainView;
import view.MoneyExchangeView;

public class MoneyExchangeController {
    
    private MoneyExchange moneyExchangeModel;
    private MoneyExchangeView moneyExchangeView;
    private MainView mainView;
    private int rielToOtherChoice, othersToRielChoice;
    private double result;

    public MoneyExchangeController(MoneyExchangeView view, MainView mainView) {
        this.moneyExchangeModel = new MoneyExchange();
        this.moneyExchangeView = view;
        this.mainView = mainView;
    }

    public void updateRielToOthersModel() {
        
        double doubleAmount;

        doubleAmount = moneyExchangeView.getDoubleAmount();

        moneyExchangeModel.setDoubleAmount(doubleAmount);

        rielToOtherChoice = mainView.getChoice();

        switch (rielToOtherChoice) {
            case 1:
                result = moneyExchangeModel.rielToDollar();
                moneyExchangeView.setResult(result);
                break;
            case 2:
                result = moneyExchangeModel.rielToEuro();
                moneyExchangeView.setResult(result);
                break;
            case 3:
                result = moneyExchangeModel.rielToFranc();
                moneyExchangeView.setResult(result);
                break;
            case 4:
                result = moneyExchangeModel.rielToPound();
                moneyExchangeView.setResult(result);
                break;
            case 5:
                result = moneyExchangeModel.rielToBaht();
                moneyExchangeView.setResult(result);
                break;
        }
    }

    public void updateOthersToRielModel() {

        double doubleAmount;

        doubleAmount = moneyExchangeView.getDoubleAmount();

        moneyExchangeModel.setDoubleAmount(doubleAmount);

        othersToRielChoice = mainView.getChoice();

        switch (othersToRielChoice) {
            case 1:
                result = moneyExchangeModel.dollarToRiel();
                moneyExchangeView.setResult(result);
                break;
            case 2:
                result = moneyExchangeModel.euroToRiel();
                moneyExchangeView.setResult(result);
                break;
            case 3:
                result = moneyExchangeModel.francToRiel();
                moneyExchangeView.setResult(result);
                break;
            case 4:
                result = moneyExchangeModel.poundToRiel();
                moneyExchangeView.setResult(result);
                break;
            case 5:
                result = moneyExchangeModel.bahtToRiel();
                moneyExchangeView.setResult(result);
                break;
        }
    }

    public void updateRielToOthersView() {
        rielToOtherChoice = mainView.getChoice();

        switch (rielToOtherChoice) {
            case 1:
                moneyExchangeView.displayRielToDollarView(moneyExchangeModel.getDoubleAmount());
                break;
            case 2:
                moneyExchangeView.displayRielToEuroView(moneyExchangeModel.getDoubleAmount());
                break;
            case 3:
                moneyExchangeView.displayRielToFrancView(moneyExchangeModel.getDoubleAmount());
                break;
            case 4:
                moneyExchangeView.displayRielToPoundView(moneyExchangeModel.getDoubleAmount());
                break;
            case 5:
                moneyExchangeView.displayRielToBahtView(moneyExchangeModel.getDoubleAmount());
                break;
        }
    }

    public void updateOthersToRielView() {
        othersToRielChoice = mainView.getChoice();
        
        switch (othersToRielChoice) {
            case 1:
                moneyExchangeView.displayDollarToRielView(moneyExchangeModel.getDoubleAmount());
                break;
            case 2:
                moneyExchangeView.displayEuroToRielView(moneyExchangeModel.getDoubleAmount());
                break;
            case 3:
                moneyExchangeView.displayFrancToRielView(moneyExchangeModel.getDoubleAmount());
                break;
            case 4:
                moneyExchangeView.displayPoundToRielView(moneyExchangeModel.getDoubleAmount());
                break;
            case 5:
                moneyExchangeView.displayBahtToRielView(moneyExchangeModel.getDoubleAmount());
                break;
        }
    }
}
