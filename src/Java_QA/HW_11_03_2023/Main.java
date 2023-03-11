package HW_11_03_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cardsForPlayer = 5;
        int players = 0;

        Scanner scanner = new Scanner(System.in);

        Cards cards = new Cards();

        int numberOfCards = cards.get_rank_length() * cards.get_suits_length();
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

        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(cards.all_cards[i].print_card());

            if (i % cardsForPlayer == cardsForPlayer - 1) {
                System.out.println();
            }
        }
    }
}
