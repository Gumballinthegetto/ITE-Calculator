import controller.ArithmeticController;
import controller.BinaryArithmeticController;
import controller.BitwiseController;
import controller.MoneyExchangeController;
import controller.NumberSystemConversion;
import controller.SetTheoryController;
import controller.StorageConversionController;
import controller.TrigonometryController;
import view.ArithmeticView;
import view.BinaryArithmeticView;
import view.BitwiseView;
import view.MainView;
import view.MoneyExchangeView;
import view.NumberSystemConversionView;
import view.SetTheoryView;
import view.StorageConversionView;
import view.TrigonometryView;
/**
 *  ITE Calculator - a better version of the previous Java ITECalculator (in progress) by optimizing the whole code using MVC architecture for better coding behavior.
 *                   This calculator consists of classes such as:
 *                   +=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+
 *                   |   ITE Calculator -                          |
 *                   +=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+
 *                   |   1. Arithmetic Operation                   |
 *                   |   2. Trigonometry                           |
 *                   |   3. Bitwise Operation                      |
 *                   |   4. Money Exchange                         |
 *                   |   5. Storage Conversion                     |
 *                   |   6. Number System Conversion               |
 *                   |   7. Binary Arithmetic Operation            |
 *                   |   8. Set Theory                             |
 *                   |   9. Exit                                   |
 *                   +=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+
 */
public class ITECalculator {

    // Main method
    public static void main(String[] args) throws Exception {
        displayMainMenu();
    }

    // method to create a default message when user inputs invalidly
    private static void defaultMessage(int num1, int num2) {
        System.out.println("+---------------------------------------------+");
        System.out.println("| -> Wrong input! Please choose from (" + num1 + "-" + num2 + ") <- |");
    }
    // method to exit the program with message
    private static void exitProgram() {
        System.out.println("+---------------------------------------------+");
        System.out.println("| Exiting program....                         |");
        System.out.println("| Thanks for using our calculator!            |");
        System.out.println("+---------------------------------------------+");
        System.exit(0);
    }
    // method to display the main menu
    private static void displayMainMenu() {
        int menuChoice, arithmeticChoice, trigonometryChoice, bitwiseChoice, moneyExchangeChoice;
        int storageConversionChoice, numberSystemConversionChoice, binaryArithmeticChoice, setTheoryChoice;
        int rielToOtherChoice, otherToRielChoice;
        int byteChoice, kiloByteChoice, megaByteChoice, gigaByteChoice, teraByteChoice, petaByteChoice;
        int binaryChoice, octalChoice, decimalChoice, hexaDecimalChoice;
        
        MainView mainView = new MainView();

        ArithmeticView arithmeticView = new ArithmeticView();
        ArithmeticController arithmeticController = new ArithmeticController(arithmeticView, mainView);

        TrigonometryView trigonometryView = new TrigonometryView();
        TrigonometryController trigonometryController = new TrigonometryController(trigonometryView, mainView);

        BitwiseView bitwiseView = new BitwiseView();
        BitwiseController bitwiseController = new BitwiseController(bitwiseView, mainView);

        MoneyExchangeView moneyExchangeView = new MoneyExchangeView();
        MoneyExchangeController moneyExchangeController = new MoneyExchangeController(moneyExchangeView, mainView);

        StorageConversionView storageConversionView = new StorageConversionView();
        StorageConversionController storageConversionController = new StorageConversionController(storageConversionView, mainView);

        NumberSystemConversionView numberSystemConversionView = new NumberSystemConversionView();
        NumberSystemConversion numberSystemConversion = new NumberSystemConversion();

        BinaryArithmeticView binaryArithmeticView = new BinaryArithmeticView();
        BinaryArithmeticController binaryArithmeticController = new BinaryArithmeticController();

        SetTheoryView setTheoryView = new SetTheoryView();
        SetTheoryController setTheoryController = new SetTheoryController();

        // Run a loop for main menu
        while (true) {
            // display menu
            mainView.displayMenu();
            menuChoice = mainView.getChoice();
            // Run a another loop for menu choice from user
            while (true) {
                // if user inputs invalid choice
                if (menuChoice < 1 || menuChoice > 9) {
                    defaultMessage(1, 9);
                    break;
                }
                // 1. Arithmetic Operation
                if (menuChoice == 1) {
                    mainView.displayArithmeticMenu();
                    arithmeticChoice = mainView.getChoice();
                    // get input from user to enter the menu
                    switch (arithmeticChoice) {
                        case 1, 2, 3, 4, 5:
                            arithmeticView.displaySetInputs();
                            arithmeticController.updateModel();
                            arithmeticController.updateView();
                            break;
                        case 6:
                            while (true) {
                                displayMainMenu();
                            }
                        default:
                            defaultMessage(1, 6);
                            break;
                    }
                }
                // 2. Trigonometry
                else if (menuChoice == 2) {
                    mainView.displayTrigonometryMenu();
                    trigonometryChoice = mainView.getChoice();
                    // get input from user to enter the menu
                    switch (trigonometryChoice) {
                        case 1, 2, 3, 4, 5, 6, 8, 10, 11:
                            trigonometryView.displaySetInputDouble();
                            trigonometryController.updateModel();
                            trigonometryController.updateView();
                            break;
                        case 7, 9:
                            trigonometryView.displaySetInputInt();
                            trigonometryController.updateModel();
                            trigonometryController.updateView();
                            break;
                        case 12:
                            while (true) {
                                displayMainMenu();
                            }
                        default:
                            defaultMessage(1, 12);
                            break;
                    }
                }
                // 3. Bitwise Operation
                else if (menuChoice == 3) {
                    mainView.displayBitwiseMenu();
                    bitwiseChoice = mainView.getChoice();
                    // get input from user to enter the menu
                    switch (bitwiseChoice) {
                        case 1, 2, 3, 4, 5:
                            bitwiseView.displayTwoSetInput();
                            bitwiseController.updateModel();
                            bitwiseController.updateView();
                            break;
                        case 6:
                            bitwiseView.displayOneSetInput();
                            bitwiseController.updateModel();
                            bitwiseController.updateView();
                            break;
                        case 7:
                            while (true) {
                                displayMainMenu();
                            }
                        default:
                            defaultMessage(1, 7);
                            break;
                    }
                }
                // 4. Money Exchange
                else if (menuChoice == 4) {
                    mainView.displayMoneyExchangeMenu();
                    moneyExchangeChoice = mainView.getChoice();
                    // get input from user to enter the menu
                    switch (moneyExchangeChoice) {
                        case 1:
                            while (true) {
                                mainView.displayRielToOtherMenu();
                                rielToOtherChoice = mainView.getChoice();
                                // get input from user
                                switch (rielToOtherChoice) {
                                    case 1, 2, 3, 4, 5:
                                        moneyExchangeView.displaySetInputDouble();
                                        moneyExchangeController.updateRielToOthersModel();
                                        moneyExchangeController.updateRielToOthersView();
                                        break;
                                    case 6:
                                        while (true) {
                                            displayMoneyExchangeMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 6);  
                                        break; 
                                }
                            }
                        case 2:
                            while (true) {
                                mainView.displayOtherToRielMenu();
                                otherToRielChoice = mainView.getChoice();
                                // get input from user
                                switch (otherToRielChoice) {
                                    case 1, 2, 3, 4, 5:
                                        moneyExchangeView.displaySetInputDouble();
                                        moneyExchangeController.updateOthersToRielModel();
                                        moneyExchangeController.updateOthersToRielView();
                                        break;
                                    case 6:
                                        while (true) {
                                            displayMoneyExchangeMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 6);
                                        break;
                                }
                            }
                        case 3:
                            while (true) {
                                displayMainMenu();
                            }
                        default:
                            defaultMessage(1, 3);
                            break;
                    }
                }
                // 5. Storage Conversion
                else if (menuChoice == 5) {
                    mainView.displayStorageConversionMenu();
                    storageConversionChoice = mainView.getChoice();
                    // get input from user
                    switch (storageConversionChoice) {
                        // 1. Byte
                        case 1:
                            while (true) {
                                mainView.displayByteMenu();
                                byteChoice = mainView.getChoice();
                                // get input from user
                                switch (byteChoice) {
                                    case 1, 2, 3, 4, 5:
                                        storageConversionView.displaySetInput();
                                        storageConversionController.updateByteToOthersModel();
                                        storageConversionController.updateByteToOthersView();
                                        break;
                                    case 6:
                                        while (true) {
                                            displayStorageConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 6);
                                        break;
                                }
                            }
                        // 2. Kilobyte
                        case 2:
                            while (true) {
                                mainView.displayKilobyteMenu();
                                kiloByteChoice = mainView.getChoice();
                                // get input from user
                                switch (kiloByteChoice) {
                                    case 1, 2, 3, 4, 5:
                                        storageConversionView.displaySetInput();
                                        storageConversionController.updateKilobyteToOthersModel();
                                        storageConversionController.updateKilobyteToOthersView();
                                        break;
                                    case 6:
                                        while (true) {
                                           displayStorageConversionMainMenu(); 
                                        }
                                    default:
                                        defaultMessage(1, 6);
                                        break;
                                }
                            }
                        // 3. Megabyte
                        case 3:
                            while (true) {
                                mainView.displayMegabyteMenu();
                                megaByteChoice = mainView.getChoice();
                                // get input from user
                                switch (megaByteChoice) {
                                    case 1, 2, 3, 4, 5:
                                        storageConversionView.displaySetInput();
                                        storageConversionController.updateMegabyteToOthersModel();
                                        storageConversionController.updateMegabyteToOthersView();
                                        break;
                                    case 6:
                                        while (true) {
                                            displayStorageConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 6);
                                        break;
                                }
                            }
                        // 4. Gigabyte
                        case 4:
                            while (true) {
                                mainView.displayGigabyteMenu();
                                gigaByteChoice = mainView.getChoice();
                                // get input from user
                                switch (gigaByteChoice) {
                                    case 1, 2, 3, 4, 5:
                                        storageConversionView.displaySetInput();
                                        storageConversionController.updateGigabyteToOthersModel();
                                        storageConversionController.updateGigabyteToOthersView();
                                        break;
                                    case 6:
                                        while (true) {
                                            displayStorageConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 6);
                                        break;
                                }
                            }
                        // 5. Terabyte
                        case 5:
                            while (true) {
                                mainView.displayTerabyteMenu();
                                teraByteChoice = mainView.getChoice();
                                // get input from user
                                switch (teraByteChoice) {
                                    case 1, 2, 3, 4, 5:
                                        storageConversionView.displaySetInput();
                                        storageConversionController.updateTerabyteToOthersModel();
                                        storageConversionController.updateTerabyteToOthersView();
                                        break;
                                    case 6:
                                        while (true) {
                                            displayStorageConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 6);
                                        break;
                                }
                            }
                        // 6. Petabyte
                        case 6:
                            while (true) {
                                mainView.displayPetabyteMenu();
                                petaByteChoice = mainView.getChoice();
                                // get input from user
                                switch (petaByteChoice) {
                                    case 1, 2, 3, 4, 5:
                                        storageConversionView.displaySetInput();
                                        storageConversionController.updatePetabyteToOthersModel();
                                        storageConversionController.updatePetabyteToOthersView();
                                        break;
                                    case 6:
                                        while (true) {
                                            displayStorageConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 6);
                                        break;
                                }
                            }
                        // 7. Back To Main Menu
                        case 7:
                            while (true) {
                                displayMainMenu();
                            }
                        default:
                            defaultMessage(1, 7);
                            break;
                    }
                }
                // 6. Number System Conversion
                else if (menuChoice == 6) {
                    mainView.displayNumberSystemConversionMenu();
                    numberSystemConversionChoice = mainView.getChoice();
                    // get input from user
                    switch (numberSystemConversionChoice) {
                        // 1. Binary
                        case 1:
                            while (true) {
                                mainView.displayBinaryMenu();
                                binaryChoice = mainView.getChoice();
                                // get user input
                                switch (binaryChoice) {
                                    case 1, 2, 3:
                                        break;
                                    case 4:
                                        while (true) {
                                            displayNumberSystemConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 4);
                                        break;
                                }
                            }
                        // 2. Octal
                        case 2:
                            while (true) {
                                mainView.displayOctalMenu();
                                octalChoice = mainView.getChoice();
                                // get user input
                                switch (octalChoice) {
                                    case 1, 2, 3:
                                        break;
                                    case 4:
                                        while (true) {
                                            displayNumberSystemConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 4);
                                        break;
                                } 
                            }
                        // 3. Decimal
                        case 3:
                            while (true) {
                                mainView.displayDecimalMenu();
                                decimalChoice = mainView.getChoice();
                                // get user input
                                switch (decimalChoice) {
                                    case 1, 2, 3:
                                        break;
                                    case 4:
                                        while (true) {
                                            displayNumberSystemConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 4);
                                        break;
                                }
                            }
                        // 4. Hexadecimal
                        case 4:
                            while (true) {
                                mainView.displayHexadecimalMenu();
                                hexaDecimalChoice = mainView.getChoice();
                                // get user input
                                switch (hexaDecimalChoice) {
                                    case 1, 2, 3:
                                        break;
                                    case 4:
                                        while (true) {
                                            displayNumberSystemConversionMainMenu();
                                        }
                                    default:
                                        defaultMessage(1, 4);
                                        break;
                                }
                            }
                        // 5. Back to main menu
                        case 5:
                            while (true) {
                                displayMainMenu();
                            }
                        default:
                            defaultMessage(1, 5);
                            break;
                    }
                }
                // 7. Binary Arithmetic Operation
                else if (menuChoice == 7) {
                    mainView.displayBinaryArithmeticMenu();
                    binaryArithmeticChoice = mainView.getChoice();
                    // get input from user
                    switch (binaryArithmeticChoice) {
                        case 1, 2, 3, 4, 5, 6, 7, 8:
                            break;
                        case 9:
                            while (true) {
                                displayMainMenu();
                            }
                        default:
                            defaultMessage(1, 9);
                            break;
                    }
                }
                // 8. Set Theory
                else if (menuChoice == 8) {
                    mainView.displaySetTheoryMenu();
                    setTheoryChoice = mainView.getChoice();
                    // get input from user
                    switch (setTheoryChoice) {
                        case 1, 2, 3:
                            break;
                        case 4:
                            while (true) {
                                displayMainMenu();
                            }
                        default:
                            defaultMessage(1, 4);
                            break;
                    }
                }
                // 9. Exit the program
                else if (menuChoice == 9) {
                    exitProgram();
                }
            }
        }
    }
    // method to display MoneyExchange main menu
    private static void displayMoneyExchangeMainMenu() {
        int moneyExchangeChoice;
        int rielToOtherChoice, otherToRielChoice;
        MainView mainView = new MainView();

        MoneyExchangeView moneyExchangeView = new MoneyExchangeView();
        MoneyExchangeController moneyExchangeController = new MoneyExchangeController(moneyExchangeView, mainView);

        while (true) {
            mainView.displayMoneyExchangeMenu();
            moneyExchangeChoice = mainView.getChoice();

            // get input from user to enter the menu
            switch (moneyExchangeChoice) {
                case 1:
                    while (true) {
                        mainView.displayRielToOtherMenu();
                        rielToOtherChoice = mainView.getChoice();
                        // get input from user
                        switch (rielToOtherChoice) {
                            case 1, 2, 3, 4, 5:
                                moneyExchangeView.displaySetInputDouble();
                                moneyExchangeController.updateRielToOthersModel();
                                moneyExchangeController.updateRielToOthersView();
                                break;
                            case 6:
                                while (true) {
                                    displayMoneyExchangeMainMenu();
                                }
                            default:
                                defaultMessage(1, 6);  
                                break; 
                        }
                    }
                case 2:
                    while (true) {
                        mainView.displayOtherToRielMenu();
                        otherToRielChoice = mainView.getChoice();
                        // get input from user
                        switch (otherToRielChoice) {
                            case 1, 2, 3, 4, 5:
                                moneyExchangeView.displaySetInputDouble();
                                moneyExchangeController.updateOthersToRielModel();
                                moneyExchangeController.updateOthersToRielView();
                                break;
                            case 6:
                                while (true) {
                                    displayMoneyExchangeMainMenu();
                                }
                            default:
                                defaultMessage(1, 6);
                                break;
                        }
                    }
                case 3:
                    while (true) {
                        displayMainMenu();
                    }
                default:
                    defaultMessage(1, 3);
                    break;
            }
        }
    }
    // method to display Storage Conversion main menu
    private static void displayStorageConversionMainMenu() {
        int storageConversionChoice;
        int byteChoice, kiloByteChoice, megaByteChoice, gigaByteChoice, teraByteChoice, petaByteChoice;
        MainView mainView = new MainView();

        StorageConversionView storageConversionView = new StorageConversionView();
        StorageConversionController storageConversionController = new StorageConversionController(storageConversionView, mainView);

        while (true) {
            mainView.displayStorageConversionMenu();
            storageConversionChoice = mainView.getChoice();
            // get input from user
            switch (storageConversionChoice) {
                // 1. Byte
                case 1:
                    while (true) {
                        mainView.displayByteMenu();
                        byteChoice = mainView.getChoice();
                        // get input from user
                        switch (byteChoice) {
                            case 1, 2, 3, 4, 5:
                                storageConversionView.displaySetInput();
                                storageConversionController.updateByteToOthersModel();
                                storageConversionController.updateByteToOthersView();
                                break;
                            case 6:
                                while (true) {
                                    displayStorageConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 6);
                                    break;
                        }
                    }
                // 2. Kilobyte
                case 2:
                    while (true) {
                        mainView.displayKilobyteMenu();
                        kiloByteChoice = mainView.getChoice();
                        // get input from user
                        switch (kiloByteChoice) {
                            case 1, 2, 3, 4, 5:
                                storageConversionView.displaySetInput();
                                storageConversionController.updateKilobyteToOthersModel();
                                storageConversionController.updateKilobyteToOthersView();
                                break;
                            case 6:
                                while (true) {
                                    displayStorageConversionMainMenu(); 
                                }
                            default:
                                defaultMessage(1, 6);
                                break;
                        }
                    }
                // 3. Megabyte
                case 3:
                    while (true) {
                        mainView.displayMegabyteMenu();
                        megaByteChoice = mainView.getChoice();
                        // get input from user
                        switch (megaByteChoice) {
                            case 1, 2, 3, 4, 5:
                                storageConversionView.displaySetInput();
                                storageConversionController.updateMegabyteToOthersModel();
                                storageConversionController.updateMegabyteToOthersView();
                                break;
                            case 6:
                                while (true) {
                                    displayStorageConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 6);
                                break;
                        }
                    }
                // 4. Gigabyte
                case 4:
                    while (true) {
                        mainView.displayGigabyteMenu();
                        gigaByteChoice = mainView.getChoice();
                        // get input from user
                        switch (gigaByteChoice) {
                            case 1, 2, 3, 4, 5:
                                storageConversionView.displaySetInput();
                                storageConversionController.updateGigabyteToOthersModel();
                                storageConversionController.updateGigabyteToOthersView();
                                break;
                            case 6:
                                while (true) {
                                    displayStorageConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 6);
                                break;
                        }
                    }
                // 5. Terabyte
                case 5:
                    while (true) {
                        mainView.displayTerabyteMenu();
                        teraByteChoice = mainView.getChoice();
                        // get input from user
                        switch (teraByteChoice) {
                            case 1, 2, 3, 4, 5:
                                storageConversionView.displaySetInput();
                                storageConversionController.updateTerabyteToOthersModel();
                                storageConversionController.updateTerabyteToOthersView();
                                break;
                            case 6:
                                while (true) {
                                    displayStorageConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 6);
                                break;
                        }
                    }
                // 6. Petabyte
                case 6:
                    while (true) {
                        mainView.displayPetabyteMenu();
                        petaByteChoice = mainView.getChoice();
                        // get input from user
                        switch (petaByteChoice) {
                            case 1, 2, 3, 4, 5:
                                storageConversionView.displaySetInput();
                                storageConversionController.updatePetabyteToOthersModel();
                                storageConversionController.updatePetabyteToOthersView();
                                break;
                            case 6:
                                while (true) {
                                    displayStorageConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 6);
                                break;
                        }
                    }
                // 7. Back to main menu
                case 7:
                    while (true) {
                        displayMainMenu();
                    }
                default:
                    defaultMessage(1, 7);
            }
        }
    }
    // method to display Number System Conversion main menu
    private static void displayNumberSystemConversionMainMenu() {
        int numberSystemConversionChoice;
        int binaryChoice, octalChoice, decimalChoice, hexaDecimalChoice;
        MainView mainView = new MainView();

        while (true) {
            mainView.displayNumberSystemConversionMenu();
            numberSystemConversionChoice = mainView.getChoice();
            // get input from user
            switch (numberSystemConversionChoice) {
                // 1. Binary
                case 1:
                    while (true) {
                        mainView.displayBinaryMenu();
                        binaryChoice = mainView.getChoice();
                        // get user input
                        switch (binaryChoice) {
                            case 1, 2, 3:
                                break;
                            case 4:
                                while (true) {
                                    displayNumberSystemConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 4);
                                break;
                        }
                    }
                // 2. Octal
                case 2:
                    while (true) {
                        mainView.displayOctalMenu();
                        octalChoice = mainView.getChoice();
                        // get user input
                        switch (octalChoice) {
                            case 1, 2, 3:
                                break;
                            case 4:
                                while (true) {
                                    displayNumberSystemConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 4);
                                break;
                        } 
                    }
                // 3. Decimal
                case 3:
                    while (true) {
                        mainView.displayDecimalMenu();
                        decimalChoice = mainView.getChoice();
                        // get user input
                        switch (decimalChoice) {
                            case 1, 2, 3:
                                break;
                            case 4:
                                while (true) {
                                    displayNumberSystemConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 4);
                                break;
                        }
                    }
                // 4. Hexadecimal
                case 4:
                    while (true) {
                        mainView.displayHexadecimalMenu();
                        hexaDecimalChoice = mainView.getChoice();
                        // get user input
                        switch (hexaDecimalChoice) {
                            case 1, 2, 3:
                                break;
                            case 4:
                                while (true) {
                                    displayNumberSystemConversionMainMenu();
                                }
                            default:
                                defaultMessage(1, 4);
                                break;
                        }
                    }
                // 5. Back to main menu
                case 5:
                    while (true) {
                        displayMainMenu();
                    }
                default:
                    defaultMessage(1, 5);
                    break;
            }
        }
    }
}