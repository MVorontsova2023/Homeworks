package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int cardsForPlayer = 5;
        int players = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numberOfCards = rank.length * suits.length;
        int maxPlayers = numberOfCards / cardsForPlayer;

        do {
            System.out.println("Пожалуйста, введите количество игроков, от 2 до " + maxPlayers);
            if (scanner.hasNextInt()) {
                players = scanner.nextInt();
            } else {
                System.out.println("Вы ввели не число.");
                scanner = new Scanner(System.in);
            }
        } while (players < 2 || players > maxPlayers);

        String[] cards = new String[numberOfCards];
        int index = 0;

        for (int i = 0; i < rank.length; i++) {

//            System.out.println(rank[i]);
            for (int j = 0; j < suits.length; j++) {
//                System.out.println(suits[j]);
                cards[index++] = rank[i] + " " + suits[j];
            }
        }


        for (int i = 0; i < cards.length; i++) {
            String currentCard = cards[i];
            int randomIndex = random.nextInt(numberOfCards);
            String randomCard = cards[randomIndex];
            cards[i] = randomCard;
            cards[randomIndex] = currentCard;
        }

        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(cards[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1) {
                System.out.println();
            }
            // 0    0   == 4    false
            // 1    1   == 4    false
            // 2    2   == 4    false
            // 3    3   == 4    false
            // 4    4   == 4    true вывели пустую строку
            // 5    0   == 4    false
            // 6    1   == 4    false
            // 7    2   == 4    false
            // 8    3   == 4    false
            // 9    4   == 4    true вывели пустую строку
            // 10    0   == 4    false
            // 11    1   == 4    false
            // 12    2   == 4    false
            // 13    3   == 4    false
            // 14    4   == 4    true вывели пустую строку
        }

    }
}
