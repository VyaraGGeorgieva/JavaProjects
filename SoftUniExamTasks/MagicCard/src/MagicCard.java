import java.util.*;
public class MagicCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cards = scanner.nextLine().split("\\s+");
        String oddOrEven = scanner.nextLine();
        String magicCard = scanner.nextLine();

        String magicCardFace = magicCard.substring(0, 1);
        String magicCardSuit = magicCard.substring(1,2);
       
        int magicSum = 0;
        Map<Character,Integer> specialCards = new HashMap<>();
        specialCards.put('J', 120);
        specialCards.put('Q', 130);
        specialCards.put('K', 140);
        specialCards.put('A', 150);

        int i;
        if (oddOrEven.equals("odd")){
            i = 1;
        }
        else {
            i = 0;
        }

        for (; i <cards.length ; i+=2) {
            String card = cards[i];
            int cardValue;

            if (isSpecial(card)){
                cardValue = specialCards.get(card.charAt(0));
            }else{
                cardValue = Integer.parseInt(card.replaceAll("[SHDC]", ""))*10;
            }
            if (card.contains(magicCardFace)){
                cardValue*=3;
            } else if(card.contains(magicCardSuit)){
                cardValue*=2;
            }
            magicSum+=cardValue;
        }

        System.out.println(magicSum);
    }

   private static boolean isSpecial(String cardToBeChecked){
       return !(cardToBeChecked.charAt(0)>='1'&&
                cardToBeChecked.charAt(0)<='9');
   }
}
