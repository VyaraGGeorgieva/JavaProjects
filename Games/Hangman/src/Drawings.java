import java.io.*;

public class Drawings {
    public static void PrintMan(int livesLeft) {
        if (livesLeft == 7) {
            System.out.println("            _______________________");
            System.out.println("            ______________________|");
            System.out.println("            |**|         X");
            System.out.println("            |**|         X");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
        } else if (livesLeft == 6) {
            System.out.println("            _______________________");
            System.out.println("            ______________________|");
            System.out.println("            |**|         X");
            System.out.println("            |**|         X");
            System.out.println("            |**|       ***** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|       ***** ");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
            System.out.println("            |**|");
        } else if (livesLeft == 5) {
            System.out.println("            _______________________");
            System.out.println("            ______________________|");
            System.out.println("            |**|         X");
            System.out.println("            |**|         X");
            System.out.println("            |**|       ***** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|       *****  ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|               ");
            System.out.println("            |**|               ");
            System.out.println("            |**|               ");
        } else if (livesLeft == 4) {
            System.out.println("            _______________________");
            System.out.println("            ______________________|");
            System.out.println("            |**|         X");
            System.out.println("            |**|         X");
            System.out.println("            |**|       ***** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|       *****  ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|      //         ");
            System.out.println("            |**|     //         ");
            System.out.println("            |**|    //          ");
        } else if (livesLeft == 3) {
            System.out.println("            _______________________");
            System.out.println("            ______________________|");
            System.out.println("            |**|         X");
            System.out.println("            |**|         X");
            System.out.println("            |**|       ***** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|       *****  ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|      //   \\\\       ");
            System.out.println("            |**|     //     \\\\     ");
            System.out.println("            |**|    //       \\\\    ");
        } else if (livesLeft == 2) {
            System.out.println("            _______________________");
            System.out.println("            ______________________|");
            System.out.println("            |**|         X");
            System.out.println("            |**|         X");
            System.out.println("            |**|       ***** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|       *****  ");
            System.out.println("            |**|      //^^^    ");
            System.out.println("            |**|     // ^^^    ");
            System.out.println("            |**|    //  ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|      //   \\\\       ");
            System.out.println("            |**|     //     \\\\     ");
            System.out.println("            |**|    //       \\\\    ");
        } else if (livesLeft == 1) {
            System.out.println("            _______________________");
            System.out.println("            ______________________|");
            System.out.println("            |**|         X");
            System.out.println("            |**|         X");
            System.out.println("            |**|       ***** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|       *****  ");
            System.out.println("            |**|      //^^^\\\\    ");
            System.out.println("            |**|     // ^^^ \\\\    ");
            System.out.println("            |**|    //  ^^^  \\\\    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|      //   \\\\       ");
            System.out.println("            |**|     //     \\\\     ");
            System.out.println("            |**|    //       \\\\    ");
        } else if (livesLeft == 0) {
            System.out.println("            _______________________");
            System.out.println("            ______________________|");
            System.out.println("            |**|         X");
            System.out.println("            |**|         X");
            System.out.println("            |**|       ***** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**|      **   ** ");
            System.out.println("            |**| XXXX  *****  XXXX");
            System.out.println("            |**|  XXXXXXXXXXXXXXX    ");
            System.out.println("            |**|      //^^^\\\\    ");
            System.out.println("            |**|     // ^^^ \\\\    ");
            System.out.println("            |**|    //  ^^^  \\\\    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|        ^^^    ");
            System.out.println("            |**|      //   \\\\       ");
            System.out.println("            |**|     //     \\\\     ");
            System.out.println("            |**|    //       \\\\    ");
        }
    }

    public static void PrintTitle(){
        try {
            BufferedReader file = new BufferedReader(new FileReader("resources\\Hangman.txt"));
            String line = file.readLine();
            while(line!=null){
                System.out.println(line);
                line = file.readLine();
            }
            file.close();
        } catch (IOException f) {
            System.err.println("The file \"Hangman.txt\" cannot be found!");
        }
    }

    public static void PrintSmile(){
        try {
            BufferedReader file = new BufferedReader(new FileReader("resources\\Smiley.txt"));
            String line = file.readLine();
            while(line!=null){
                System.out.println(line);
                line = file.readLine();
            }
            file.close();
        } catch (IOException f) {
            System.err.println("The file \"Smiley.txt\" cannot be found!");
        }
    }

    public static void PrintThankYou(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("resources\\ThankYou.txt"));
            String line = reader.readLine();
            while(line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException fnf){
            System.out.println("The file \"ThankYou.txt\" cannot be found!");
        }
    }

    public static void PrintGameOver(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("resources\\GameOver.txt"));
            String line = reader.readLine();
            while(line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException fnf){
            System.out.println("The file \"GameOver.txt\" cannot be found!");
        }
    }
}


