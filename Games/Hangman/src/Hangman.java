import java.util.*;


public class Hangman {

    private static boolean playing;
    private static boolean letterFound = false;
    public static LinkedHashSet<String> entries = new LinkedHashSet<String>();
    private static List<String> secretWords;
    public static boolean validCategory = true;
    private static int livesLeft;
    private static boolean repeated;
    private static char guessLetter;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random wordSelector = new Random();
        playing = true;
        boolean dead = false;
        boolean gameWon = false;

        while (playing) {
            if (!entries.isEmpty()) {
                entries.clear();
            }
            //Start a new game
            VisualControls.startNewGame();
            String category = input.nextLine();
            //Take the words only for the chosen category
            secretWords = Dictionaries.selection(category, secretWords);

            //check if the category is valid
            if (!validCategory) {
                System.out.println("You entered a wrong category. Please, try again!");
                category = input.nextLine();
                secretWords = Dictionaries.selection(category, secretWords);
            }

            //check if the category is empty. In such a case, let him choose another

            if (secretWords.size() == 0) {
                VisualControls.startNewGame();
                System.out.println("I am sorry, but the category you chose has run out of words. Please, choose another one!");
                category = input.nextLine();
                secretWords = Dictionaries.selection(category, secretWords);
            }

            if (secretWords.size() > 0) {
                //choose a word from the selected category randomly
                String currentWord = pickWord(wordSelector).toUpperCase();
                //split the word into chars
                char[] toGuess = currentWord.toCharArray();
                char[] guessed = new char[currentWord.length()];
                drawWord(guessed);

                //prints everything so far
                VisualControls.refreshWindow(livesLeft, guessed, repeated, guessLetter, letterFound, false);

                //Main logic --> Make the user enter letters until he wins or loses
                while (true) {
                    String userEntry = input.nextLine();
                    //additional check
                    while (userEntry.equals("")) {
                        VisualControls.refreshWindow(livesLeft, guessed, repeated, guessLetter, letterFound, false);
                        userEntry = input.nextLine();
                    }
                    guessLetter = userEntry.toUpperCase().charAt(0);
                    //check if the entered letter is in the secret word
                    checkGuess(toGuess, guessed);

                    // Check if the user is dead or victorious
                    dead = checkDead(currentWord, input, dead, guessed, gameWon);
                    gameWon = checkWon(currentWord, input, dead, guessed, gameWon);
                    if (dead || gameWon) {
                        break;
                    }

                    // reset the boolean variable holding the result of the last entry
                    letterFound = false;
                }

                // When current game ends prompt for a new game
                String choice = input.nextLine().trim().toLowerCase();
                while (!choice.equals("y") && !choice.equals("n")) {
                    System.out.println("Invalid input. Enter your choice again.");
                    choice = input.nextLine().trim().toLowerCase();
                }
                if (choice.equals("y")) {
                    VisualControls.selectCategory();
                } else {
                   playing = false;
                    break;
                }

            }
        }

        //print the Thank-you message
            VisualControls.endGame();
            input.nextLine();
        }
    private static void checkGuess(char[] toGuess, char[] guessed) {
        if (entries.contains("" + guessLetter)) {
            VisualControls.refreshWindow(livesLeft, guessed, true, guessLetter, letterFound, true);
        } else {
            entries.add("" + guessLetter);
            letterLookup(toGuess, guessed);

            if (!letterFound) {
                livesLeft--;
            }

            VisualControls.refreshWindow(livesLeft, guessed, false, guessLetter, letterFound, true);
        }
    }

    // checks  if the letter is in the word or not; used by the previous methods
    private static void letterLookup(char[] toGuess, char[] guessed) {
        for (int i = 0; i < guessed.length; i++) {
            if (guessLetter == toGuess[i]) {
                guessed[i] = guessLetter;
                letterFound = true;
            }
        }
    }

    private static String pickWord(Random wordSelector){
        int newWordIndex = wordSelector.nextInt(secretWords.size());
        String currentWord = secretWords.get(newWordIndex);
        secretWords.remove(newWordIndex);
        return currentWord;
    }

    private static void drawWord (char[] guessed){
        for (int i = 0; i < guessed.length ; i++) {
            guessed[i] = '_';
        }
        livesLeft = 7;
    }

    private static boolean checkDead(String currentWord, Scanner input, boolean dead, char[] guessed, boolean gameWon) {
        if (livesLeft < 1) {
            VisualControls.printDeath(currentWord);
            return true;
        } return false;
    }

    // Checks for victory condition => no stars left means all letters have been revealed
    private static boolean checkWon(String currentWord, Scanner input, boolean dead, char[] guessed, boolean gameWon) {
        // count the stars
        int underscoresLeft = 0;
        for (char c : guessed) {
            if (c == '_') {
                underscoresLeft++;
            }
        }

        if (underscoresLeft == 0){

            VisualControls.printVictory();
            return true;

        } else {
            return false;
        }
    }
}

