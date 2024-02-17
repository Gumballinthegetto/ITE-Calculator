package view;

import java.util.Scanner;
/**
 * Main View - contains methods to display menu to user
 */
public class MainView {

    private int choice;

    Scanner input = new Scanner(System.in);

    // Getter method
    public int getChoice() {
        return this.choice;
    }
    // private method to reduce repeatitive code
    private void enterChoice() {
        System.out.print("| -> Enter your choice: ");
        choice = input.nextInt();
    }
    
    // Main Menu
    public void displayMenu() {
        System.out.println("+=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
        System.out.println("||                ITE Calcultor              ||");
        System.out.println("+=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
        System.out.println("|   1. Arithmetic Operation                   |");
        System.out.println("|   2. Trigonometry                           |");
        System.out.println("|   3. Bitwise Operation                      |");
        System.out.println("|   4. Money Exchange                         |");
        System.out.println("|   5. Storage Conversion                     |");
        System.out.println("|   6. Number System Conversion               |");
        System.out.println("|   7. Binary Arithmetic Operation            |");
        System.out.println("|   8. Set Theory                             |");
        System.out.println("|   9. Exit                                   |");
        System.out.println("+=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=+");
        enterChoice();
    }
    // 1. Arithmetic Menu   
    public void displayArithmeticMenu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("|             Arithmetic Operation            |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|   1. Summation                              |");
        System.out.println("|   2. Difference                             |");
        System.out.println("|   3. Multiplication                         |");
        System.out.println("|   4. Division                               |");
        System.out.println("|   5. Modulo                                 |");
        System.out.println("|   6. Back To Main Menu                      |");
        System.out.println("+---------------------------------------------+");
        enterChoice();
    }
    // 2. Trigonometry Menu
    public void displayTrigonometryMenu() { 
        System.out.println("+---------------------------------------------+");
        System.out.println("|                 Trigonometry                |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|   1. Sin      (degree)                      |");
        System.out.println("|   2. Sind     (radian)                      |");
        System.out.println("|   3. Cos      (degree)                      |");
        System.out.println("|   4. Cosd     (radian)                      |");
        System.out.println("|   5. Tan      (degree)                      |");
        System.out.println("|   6. Tand     (radian)                      |");
        System.out.println("|   7. Square2  (int)                         |");
        System.out.println("|   8. Square2  (double)                      |");
        System.out.println("|   9. Square3  (int)                         |");
        System.out.println("|   10. Square3 (double)                      |");
        System.out.println("|   11. Degree to Radian                      |");
        System.out.println("|   12. Back To Main Menu                     |");
        System.out.println("+---------------------------------------------+");
        enterChoice();
    }
    // 3. Bitwise Menu
    public void displayBitwiseMenu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("|                   Bitwise                   |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|   1. BitwiseAND                             |");
        System.out.println("|   2. BitwiseOR                              |");
        System.out.println("|   3. BitwiseXOR                             |");
        System.out.println("|   4. Bitwise Left Shift                     |");
        System.out.println("|   5. Bitwise Right Shift                    |");
        System.out.println("|   6. Bitwise Inversion                      |");
        System.out.println("|   7. Back To Main Menu                      |");
        System.out.println("+---------------------------------------------+");
        enterChoice();
    }
    // 4. Money Exchange
    public void displayMoneyExchangeMenu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("|                Money Exchange               |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|   1. Riel to Other currencies               |");
        System.out.println("|   2. Other currencies to Riel               |");
        System.out.println("|   3. Back To Main Menu                      |");
        System.out.println("+---------------------------------------------+");
        enterChoice();
    }
        // 4.1. Money Exchange (Riel to Other currencies)
        public void displayRielToOtherMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|           Riel to Other currencies          |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Riel to Dollar                         |");
            System.out.println("|   2. Riel to Euro                           |");
            System.out.println("|   3. Riel to Franc                          |");
            System.out.println("|   4. Riel to Pound                          |");
            System.out.println("|   5. Riel to Baht                           |");
            System.out.println("|   6. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 4.2. Money Exchange (Other currencies to Riel)
        public void displayOtherToRielMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|           Other currencies to Riel          |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Dollar to Riel                         |");
            System.out.println("|   2. Euro to Riel                           |");
            System.out.println("|   3. Franc to Riel                          |");
            System.out.println("|   4. Pound to Riel                          |");
            System.out.println("|   5. Baht to Riel                           |");
            System.out.println("|   6. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
    // 5. Storage Conversion
    public void displayStorageConversionMenu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("|              Storage Conversion             |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|   1. Byte                                   |");
        System.out.println("|   2. KiloByte                               |");
        System.out.println("|   3. MegaByte                               |");
        System.out.println("|   4. GigaByte                               |");
        System.out.println("|   5. TeraByte                               |");
        System.out.println("|   6. PetaByte                               |");
        System.out.println("|   7. Back To Main Menu                      |");
        System.out.println("+---------------------------------------------+");
        enterChoice();
    }
        // 5.1. Byte
        public void displayByteMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                    Byte                     |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Byte to Kilobyte                       |");
            System.out.println("|   2. Byte to Megabyte                       |");
            System.out.println("|   3. Byte to Gigabyte                       |");
            System.out.println("|   4. Byte to Terabyte                       |");
            System.out.println("|   5. Byte to Petabyte                       |");
            System.out.println("|   6. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 5.2. KiloByte
        public void displayKilobyteMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                  Kilobyte                   |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Kilobyte to byte                       |");
            System.out.println("|   2. Kilobyte to Megabyte                   |");
            System.out.println("|   3. Kilobyte to Gigabyte                   |");
            System.out.println("|   4. Kilobyte to Terabyte                   |");
            System.out.println("|   5. Kilobyte to Petabyte                   |");
            System.out.println("|   6. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 5.3. Megabyte
        public void displayMegabyteMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                  Megabyte                   |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Megabyte to byte                       |");
            System.out.println("|   2. Megabyte to Kilobyte                   |");
            System.out.println("|   3. Megabyte to Gigabyte                   |");
            System.out.println("|   4. Megabyte to Terabyte                   |");
            System.out.println("|   5. Megabyte to Petabyte                   |");
            System.out.println("|   6. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 5.4. Gigabyte
        public void displayGigabyteMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                  Gigabyte                   |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Gigabyte to byte                       |");
            System.out.println("|   2. Gigabyte to Kilobyte                   |");
            System.out.println("|   3. Gigabyte to Megabyte                   |");
            System.out.println("|   4. Gigabyte to Terabyte                   |");
            System.out.println("|   5. Gigabyte to Petabyte                   |");
            System.out.println("|   6. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 5.5. Terabyte
        public void displayTerabyteMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                  Terabyte                   |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Terabyte to byte                       |");
            System.out.println("|   2. Terabyte to Kilobyte                   |");
            System.out.println("|   3. Terabyte to Megabyte                   |");
            System.out.println("|   4. Terabyte to Gigabyte                   |");
            System.out.println("|   5. Terabyte to Petabyte                   |");
            System.out.println("|   6. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 5.6. Petabyte
        public void displayPetabyteMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                  Petabyte                   |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Petabyte to byte                       |");
            System.out.println("|   2. Petabyte to Kilobyte                   |");
            System.out.println("|   3. Petabyte to Megabyte                   |");
            System.out.println("|   4. Petabyte to Gigabyte                   |");
            System.out.println("|   5. Petabyte to Petabyte                   |");
            System.out.println("|   6. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
    // 6. Number System Conversion
    public void displayNumberSystemConversionMenu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("|           Number System Conversion          |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|   1. Binary                                 |");
        System.out.println("|   2. Octal                                  |");
        System.out.println("|   3. Deciaml                                |");
        System.out.println("|   4. Hexadecimal                            |");
        System.out.println("|   5. Back To Main Menu                      |");
        System.out.println("+---------------------------------------------+");
        enterChoice();
    }
        // 6.1. Binary
        public void displayBinaryMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                   Binary                    |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Binary to Octal                        |");
            System.out.println("|   2. Binary to Decimal                      |");
            System.out.println("|   3. Binary to Hexadecimal                  |");
            System.out.println("|   4. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 6.2. Octal
        public void displayOctalMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                    Octal                    |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Octal to Binary                        |");
            System.out.println("|   2. Octal to Decimal                       |");
            System.out.println("|   3. Octal to Hexadecimal                   |");
            System.out.println("|   4. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 6.3. Decimal
        public void displayDecimalMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                   Decimal                   |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Decimal to Binary                      |");
            System.out.println("|   2. Decimal to Octal                       |");
            System.out.println("|   3. Decimal to Hexadecimal                 |");
            System.out.println("|   4. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
        // 6.4. Hexadecimal
        public void displayHexadecimalMenu() {
            System.out.println("+---------------------------------------------+");
            System.out.println("|                 Hexadecimal                 |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|   1. Hexadecimal to Binary                  |");
            System.out.println("|   2. Hexadecimal to Octal                   |");
            System.out.println("|   3. Hexadecimal to Decimal                 |");
            System.out.println("|   4. Back                                   |");
            System.out.println("+---------------------------------------------+");
            enterChoice();
        }
    // 7. Binary Arithmetic
    public void displayBinaryArithmeticMenu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("|               Binary Arithmetic             |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|   1. Binary Addition                        |");
        System.out.println("|   2. Binary Subtraction                     |");
        System.out.println("|   3. Binary Multiplication                  |");
        System.out.println("|   4. Binary Division                        |");
        System.out.println("|   5. Binary Addition    (2's Complement)    |");
        System.out.println("|   6. Binary Subtraction (2's Complement)    |");
        System.out.println("|   7. First Complement                       |");
        System.out.println("|   8. Second Complement                      |");
        System.out.println("|   9. Back To Main Menu                      |");
        System.out.println("+---------------------------------------------+");
        enterChoice();
    }
    // 8. Set Theory
    public void displaySetTheoryMenu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("|                  Set Theory                 |");
        System.out.println("+---------------------------------------------+");
        System.out.println("|   1. Union                                  |");
        System.out.println("|   2. Intersection                           |");
        System.out.println("|   3. Set Differences                        |");
        System.out.println("|   4. Back To Main Menu                      |");
        System.out.println("+---------------------------------------------+");
        enterChoice();
    }
}
