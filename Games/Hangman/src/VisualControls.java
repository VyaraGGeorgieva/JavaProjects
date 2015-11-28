//execution of files and visual commands, given through the console
public class VisualControls {

    public static void refreshWindow(Integer livesLeft, char[] guessed, boolean repeated, char guessLetter, boolean letterGuessed, boolean gameStarted) {
        clearConsole();
        Drawings.PrintMan(livesLeft);
        if (gameStarted) {
            guessWord(letterGuessed, repeated);
        } else {
            System.out.println();
        }

        System.out.println("Entries" + Hangman.entries);
        System.out.println("Selected Category: " + Dictionaries.selectCategory);
        System.out.println("Lives left: " + livesLeft + "!");
        printGuessedWord(guessed);
        System.out.println("Enter a letter: ");
    }

    private static void guessWord(boolean letterGuessed, boolean repeated) {
        if (repeated) {
            System.out.println("You have already tried this letter");
        } else if (letterGuessed) {
            System.out.println("Yes! Go on!");
        } else {
            System.out.println("Sorry! No such letter in the word!");
        }

        System.out.println();
    }

    private static void printGuessedWord(char[] guessed) {
        System.out.println();
        System.out.println();
        for (char ch : guessed) {
            System.out.printf("%s ", ch);
        }
        System.out.println();
    }


    public static void clearConsole(){
        for (int clear = 0; clear < 150; clear ++){
            System.out.println("\b");
        }
    }



    public static void printRules(){
        System.out.println("RULES:");
        System.out.println("1. Enter letters from the English alphabet in order to guess the word");
        System.out.println("2. Do not enter more than one letter. If you do, only the first one counts");
        System.out.println("3. Entering symbols or digits may get you killed!");
        System.out.println("4. You can make 7 wrong guesses, on the 7th you are hanged!");
        System.out.println();
    }

    public static void selectCategory(){
        System.out.println("\nReady?");
        System.out.println("Choose a category (enter the number or the category name):\n1. Animals\n2. Personality\n3. Medicine\n4. The Body\n5. The Weather");
        System.out.println("Category: ");
    }


    public static void startNewGame(){
        Drawings.PrintTitle();
        VisualControls.printRules();
        VisualControls.selectCategory();
    }

    public static void endGame() {
        clearConsole();
        Drawings.PrintThankYou();
        System.out.println("Thank you for playing!");
        System.out.println("Keep on being better!  See you next time.");
        System.out.println("Press any key to exit.");
    }

    public static void printDeath(String currentWord) {
        clearConsole();
        Drawings.PrintMan(0);
        System.out.println("Sorry, not your day!");
        System.out.println("The word was: " + currentWord);
        newGameSuggestion();
    }

    private static void newGameSuggestion() {
        System.out.println("Would you want to try again? Y - yes; N - no, thank you.");
    }

    public static void printVictory() {
        clearConsole();
        Drawings.PrintSmile();
        System.out.println("Congratulations! You guessed the word!");
        newGameSuggestion();
    }
}
