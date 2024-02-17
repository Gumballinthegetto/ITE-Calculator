package controller;

import model.StorageConversion;
import view.MainView;
import view.StorageConversionView;

public class StorageConversionController {
    
    private StorageConversion storageConversionModel;
    private StorageConversionView storageConversionView;
    private MainView mainView;
    private double inputSize, result;
    private int byteToOthersChoice, kilobyteToOthersChoice, megabyteToOthersChoice, gigabyteToOthersChoice, terabyteToOthersChoice, petabyteToOthersChoice; 

    public StorageConversionController(StorageConversionView view, MainView mainView) {
        this.storageConversionModel = new StorageConversion();
        this.storageConversionView = view;
        this.mainView = mainView;
    }

    /*
     *  Model
     */
    public void updateByteToOthersModel() {
        inputSize = storageConversionView.getInputSize();
        storageConversionModel.setInputSize(inputSize);
        byteToOthersChoice = mainView.getChoice();

        switch (byteToOthersChoice) {
            case 1:
                result = storageConversionModel.byteToKilobyte();
                storageConversionView.setResult(result);
                break;
            case 2:
                result = storageConversionModel.byteToMegabyte();
                storageConversionView.setResult(result);
                break;
            case 3:
                result = storageConversionModel.byteToGigabyte();
                storageConversionView.setResult(result);
                break;
            case 4:
                result = storageConversionModel.byteToTerabyte();
                storageConversionView.setResult(result);
                break;
            case 5:
                result = storageConversionModel.byteToPetabyte();
                storageConversionView.setResult(result);
                break;
        }
    }
    public void updateKilobyteToOthersModel() {
        inputSize = storageConversionView.getInputSize();
        storageConversionModel.setInputSize(inputSize);
        kilobyteToOthersChoice = mainView.getChoice();

        switch (kilobyteToOthersChoice) {
            case 1:
                result = storageConversionModel.kilobyteTobyte();
                storageConversionView.setResult(result);
                break;
            case 2:
                result = storageConversionModel.kilobyteToMegabyte();
                storageConversionView.setResult(result);
                break;
            case 3:
                result = storageConversionModel.kilobyteToGigabyte();
                storageConversionView.setResult(result);
                break;
            case 4:
                result = storageConversionModel.kilobyteToTerabyte();
                storageConversionView.setResult(result);
                break;
            case 5:
                result = storageConversionModel.kilobyteToPetabyte();
                storageConversionView.setResult(result);
                break;
        }
    }
    public void updateMegabyteToOthersModel() {
        inputSize = storageConversionView.getInputSize();
        storageConversionModel.setInputSize(inputSize);
        megabyteToOthersChoice = mainView.getChoice();

        switch (megabyteToOthersChoice) {
            case 1:
                result = storageConversionModel.megabyteToByte();
                storageConversionView.setResult(result);
                break;
            case 2:
                result = storageConversionModel.megabyteToKiloBtye();
                storageConversionView.setResult(result);
                break;
            case 3:
                result = storageConversionModel.megabyteToGigaByte();
                storageConversionView.setResult(result);
                break;
            case 4:
                result = storageConversionModel.megabyteToTeraByte();
                storageConversionView.setResult(result);
                break;
            case 5:
                result = storageConversionModel.megabyteToPetaBtye();
                storageConversionView.setResult(result);
                break;
        }
    }
    public void updateGigabyteToOthersModel() {
        inputSize = storageConversionView.getInputSize();
        storageConversionModel.setInputSize(inputSize);
        gigabyteToOthersChoice = mainView.getChoice();

        switch (gigabyteToOthersChoice) {
            case 1:
                result = storageConversionModel.gigabyteToByte();
                storageConversionView.setResult(result);
                break;
            case 2:
                result = storageConversionModel.gigabyteToKilobyte();
                storageConversionView.setResult(result);
                break;
            case 3:
                result = storageConversionModel.gigabyteToMegabyte();
                storageConversionView.setResult(result);
                break;
            case 4:
                result = storageConversionModel.gigabyteToTerabyte();
                storageConversionView.setResult(result);
                break;
            case 5:
                result = storageConversionModel.gigabyteToPetabyte();
                storageConversionView.setResult(result);
                break;
        }
    }
    public void updateTerabyteToOthersModel() {
        inputSize = storageConversionView.getInputSize();
        storageConversionModel.setInputSize(inputSize);
        terabyteToOthersChoice = mainView.getChoice();

        switch (terabyteToOthersChoice) {
            case 1:
                result = storageConversionModel.terabyteToByte();
                storageConversionView.setResult(result);
                break;
            case 2:
                result = storageConversionModel.terabyteToKilobyte();
                storageConversionView.setResult(result);
                break;
            case 3:
                result = storageConversionModel.terabyteToMegabyte();
                storageConversionView.setResult(result);
                break;
            case 4:
                result = storageConversionModel.terabyteToGigabyte();
                storageConversionView.setResult(result);
                break;
            case 5:
                result = storageConversionModel.terabyteToPetabyte();
                storageConversionView.setResult(result);
                break;
        }
    }
    public void updatePetabyteToOthersModel() {
        inputSize = storageConversionView.getInputSize();
        storageConversionModel.setInputSize(inputSize);
        petabyteToOthersChoice = mainView.getChoice();

        switch (petabyteToOthersChoice) {
            case 1:
                result = storageConversionModel.petabyteToByte();
                storageConversionView.setResult(result);
                break;
            case 2:
                result = storageConversionModel.petabyteToKilobyte();
                storageConversionView.setResult(result);
                break;
            case 3:
                result = storageConversionModel.petabyteToMegabyte();
                storageConversionView.setResult(result);
                break;
            case 4:
                result = storageConversionModel.petabyteToGigabyte();
                storageConversionView.setResult(result);
                break;
            case 5:
                result = storageConversionModel.petabyteToTerabyte();
                storageConversionView.setResult(result);
                break;
        }
    }

    /*
     *  View
     */
    public void updateByteToOthersView() {
        byteToOthersChoice = mainView.getChoice();

        switch (byteToOthersChoice) {
            case 1:
                storageConversionView.displayByteToKilobyteView(storageConversionModel.getInputSize());
                break;
            case 2:
                storageConversionView.displayByteToMegabyteView(storageConversionModel.getInputSize());
                break;
            case 3:
                storageConversionView.displayByteToGigabyteView(storageConversionModel.getInputSize());
                break;
            case 4:
                storageConversionView.displayByteToTerabyteView(storageConversionModel.getInputSize());
                break;
            case 5:
                storageConversionView.displayByteToPetabyteView(storageConversionModel.getInputSize());
                break;
        }
    }
    public void updateKilobyteToOthersView() {
        kilobyteToOthersChoice = mainView.getChoice();

        switch (kilobyteToOthersChoice) {
            case 1:
                storageConversionView.displayKilobyteToByteView(storageConversionModel.getInputSize());
                break;
            case 2:
                storageConversionView.displayKilobyteToMegabyteView(storageConversionModel.getInputSize());
                break;
            case 3:
                storageConversionView.displayKilobyteToGigabyteView(storageConversionModel.getInputSize());
                break;
            case 4:
                storageConversionView.displayKilobyteToTerabyteView(storageConversionModel.getInputSize());
                break;
            case 5:
                storageConversionView.displayKilobyteToPetabyteView(storageConversionModel.getInputSize());
                break;
        }
    }
    public void updateMegabyteToOthersView() {
        megabyteToOthersChoice = mainView.getChoice();

        switch (megabyteToOthersChoice) {
            case 1:
                storageConversionView.displayMegabyteToByteView(storageConversionModel.getInputSize());
                break;
            case 2:
                storageConversionView.displayMegabyteToKilobyteView(storageConversionModel.getInputSize());
                break;
            case 3:
                storageConversionView.displayMegabyteToGigabyteView(storageConversionModel.getInputSize());
                break;
            case 4:
                storageConversionView.displayMegabyteToTerabyteView(storageConversionModel.getInputSize());
                break;
            case 5:
                storageConversionView.displayMegabyteToPetabyteView(storageConversionModel.getInputSize());
                break;
        }
    }
    public void updateGigabyteToOthersView() {
        gigabyteToOthersChoice = mainView.getChoice();

        switch (gigabyteToOthersChoice) {
            case 1:
                storageConversionView.displayGigabyteToByte(storageConversionModel.getInputSize());
                break;
            case 2:
                storageConversionView.displayGigabyteToKilobyte(storageConversionModel.getInputSize());
                break;
            case 3:
                storageConversionView.displayGigabyteToMegabyte(storageConversionModel.getInputSize());
                break;
            case 4:
                storageConversionView.displayGigabyteToTerabyte(storageConversionModel.getInputSize());
                break;
            case 5:
                storageConversionView.displayGigabyteToPetabyte(storageConversionModel.getInputSize());
                break;
        }
    }
    public void updateTerabyteToOthersView() {
        terabyteToOthersChoice = mainView.getChoice();

        switch (terabyteToOthersChoice) {
            case 1:
                storageConversionView.displayTerabyteTobyte(storageConversionModel.getInputSize());
                break;
            case 2:
                storageConversionView.displayTerabyteToKilobyte(storageConversionModel.getInputSize());
                break;
            case 3:
                storageConversionView.displayTerabyteToMegabyte(storageConversionModel.getInputSize());
                break;
            case 4:
                storageConversionView.displayTerabyteToGigabyte(storageConversionModel.getInputSize());
                break;
            case 5:
                storageConversionView.displayTerabyteToPetabyte(storageConversionModel.getInputSize());
                break;
        }
    }
    public void updatePetabyteToOthersView() {
        petabyteToOthersChoice = mainView.getChoice();

        switch (petabyteToOthersChoice) {
            case 1:
                storageConversionView.displayPetabytetoByte(storageConversionModel.getInputSize());
                break;
            case 2:
                storageConversionView.displayPetabyteToKilobyte(storageConversionModel.getInputSize());
                break;
            case 3:
                storageConversionView.displayPetabyteToMegabyte(storageConversionModel.getInputSize());
                break;
            case 4:
                storageConversionView.displayPetabyteToGigabyte(storageConversionModel.getInputSize());
                break;
            case 5:
                storageConversionView.displayTerabyteToGigabyte(storageConversionModel.getInputSize());
                break;
        }
    }
}
