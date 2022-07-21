package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - List_Exercise
 * Date: June / 2022
 */
public class CardGame {
    public static void main(String[] args) {
        /*
        You will be given two hands of cards, which will be integer numbers.
        Assume that you have two players. You have to find out the winning deck and respectively the winner.

        You start from the beginning of both hands. Compare the cards from the first deck to the cards from the second deck.
        The player, who has a bigger card, takes both cards and puts them at the back of his hand - the second player's card
        is last, and the first person's card (the winning one) is before it (second to last)
        and the player with the smaller card must remove the card from his deck.
        If both players' cards have the same values - no one wins, and the two cards must
        be removed from the decks. The game is over when one of the decks is left without any cards.
        You have to print the winner on the console and the sum of the
        left cards: "{First/Second} player wins! Sum: {sum}".
         */
        Scanner scanner = new Scanner(System.in);
        List<Integer> hand1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> hand2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (hand1.size() != 0 && hand2.size() != 0) {
            int primerJugadorCarta = hand1.get(0);
            int segundoJugadorCarta = hand2.get(0);
            hand1.remove(0);
            hand2.remove(0);

            if (primerJugadorCarta>segundoJugadorCarta){
                hand1.add(primerJugadorCarta);
                hand1.add(segundoJugadorCarta);
            } else if (segundoJugadorCarta>primerJugadorCarta) {
                hand2.add(segundoJugadorCarta);
                hand2.add(primerJugadorCarta);
            }

            if (hand1.size() == 0){
                System.out.printf("Second player wins! Sum: %d", getCardsSum(hand2));
            }else if (hand2.size()==0){
                System.out.printf("First player wins! Sum: %d", getCardsSum(hand1));
            }
        }

    }
    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;
    }
}
