import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Dictionaries {

    public static String selectCategory;

    public static List<String> animals = new LinkedList<String>
            (Arrays.asList(
                    "ELEPHANT", "DOG", "CAT", "TIGER", "LION", "SNAKE", "PANDA", "BEAR", "RABBIT", "KOALA", "DUCK", "SNAIL", "LEOPARD", "ZEBRA", "KANGOROO", "FALCON", "EAGLE", "MOUSE", "HORSE", "BAT", "ANT", "BEAVER", "BEE", "BUFFALO", "BULL", "CAMEL", "CHIMPANZEE", "CRAB", "COYOTE", "CROCODILE", "CRAB", "DEOVE", "DONKEY", "FOX", "FROG", "GOAT", "GOOSE", "GORILLA", "PARROT", "PENGUIN", "RAT", "SCORPION", "SPIDER", "SQUIRREL", "SWAN", "WHALE", "WOLF", "PIGEON", "PIG", "PEACOCK", "OWL", "OCTOPUS", "MOOSE", "MOLE", "HIPPOPOTAMUS", "GRASSHOPPER", "GIRAFFE", "FLY"));

    public static List<String> personality = new LinkedList<>
            (Arrays.asList(
                    "STABLE", "ARROGANT", "VAIN", "INSINCERE", "SINCERE",
                    "ECCENTRIC", "STUBBORN", "LOYAL", "POSSESSIVE", "RESERVED",
                    "MATURE", "IMPULSIVE", "SOCIABLE", "HELPFUL", "SENSITIVE",
                    "ADVENTUROUS", "PRACTICAL", "PESSIMISTIC", "TRUSTWORTHY"
            ));

    public static List<String> medicine = new LinkedList<>
            (Arrays.asList(
                    "TEMPERATURE", "COUGH", "RASH", "SNEEZE", "VOMIT",
                    "FLU", "BRUISE", "BANDAGE", "SYRINGE", "MEDICINE", "OPERATION", "STITCHES", "BLISTER"
            ));

    public static List<String> body = new LinkedList<>
            (Arrays.asList(
                    "WRIST", "WAIST", "FOREHEAD", "ELBOW", "EYEBROW", "EYELASH",
                    "THIGH", "CALF", "TOE", "FINGER", "NECK", "KNEE", "FOOT"
            ));

    public static List<String> weather = new LinkedList<>
            (Arrays.asList(
                    "BREEZE", "CHILLY", "COOL", "DAMP", "DRIZZLE", "FREEZING",
                    "SHOWER", "SCORCHING", "BLIZZARD", "HAILSTORM", "LIGHTNING",
                    "DROUGHT", "HEATWAVE", "MONSOON", "HURRICANE", "THUNDER"
            ));

    //A method to handle the selection and retrieve the chosen list of words:

    public static List<String> selection(String selectedCategory, List<String> secretWords) {
        String choice = String.valueOf(selectedCategory.toLowerCase());
        if (choice.equals("animals") || choice.equals("1")) {
            secretWords = animals;
            selectCategory = "ANIMALS";
            Hangman.validCategory = true;
        } else if (choice.equals("personality") || choice.equals("2")) {
            secretWords = personality;
            selectCategory = "PERSONALITY";
            Hangman.validCategory = true;
        } else if (choice.equals("medicine") || choice.equals("3")) {
            secretWords = medicine;
            selectCategory = "MEDICINE";
            Hangman.validCategory = true;
        } else if (choice.equals("body") || choice.equals("4")) {
            secretWords = body;
            selectCategory = "BODY";
            Hangman.validCategory = true;
        } else if (choice.equals("weather") || choice.equals("5")) {
            secretWords = weather;
            selectCategory = "WEATHER";
            Hangman.validCategory = true;
        } else{
            Hangman.validCategory = false;
        }
        return secretWords;
    }
}


