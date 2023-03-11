package HW_11_03_2023;

import java.sql.Struct;
import java.util.Random;

public class Cards {
    enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;
    }
    enum Rank {
        RANK2,
        RANK3,
        RANK4,
        RANK5,
        RANK6,
        RANK7,
        RANK8,
        RANK9,
        RANK10,
        JACK,
        QUENN,
        KING,
        ACE;
    }
    class Card {
        Rank rank;
        Suit suit;
        Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public String print_card() {
            return rank.name() + " " + suit.name();
        }
    }
    Card [] all_cards = new Card[Rank.values().length * Suit.values().length];
    Cards() {
        Random random = new Random();
        int index = 0;

        for (int i = 0; i < Rank.values().length; i++) {
            for (int j = 0; j < Suit.values().length; j++) {
                all_cards[index++] = new Card(Rank.values()[i], Suit.values()[j]);
            }
        }

        int numberOfCards = Rank.values().length * Suit.values().length;

        for (int i = 0; i < numberOfCards; i++) {
            Card currentCard = all_cards[i];
            int randomIndex = random.nextInt(numberOfCards);
            Card randomCard = all_cards[randomIndex];
            all_cards[i] = randomCard;
            all_cards[randomIndex] = currentCard;
        }
    }

    public int get_rank_length () {
        return Rank.values().length;
    }

    public int get_suits_length () {
        return Suit.values().length;
    }
}
