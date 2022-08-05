package gradle.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardSuitTest {
    @Test
    void when_I_received_the_club_emoji_I_get_club(){
        String input = "3♣";
        String output = "clubs";

        CardSuit myObject = new CardSuit();
        String result = myObject.card_suit(input);

        assertThat(result).isEqualTo(output);
    }

    @Test
    void when_I_received_the_diamond_emoji_I_get_diamond(){
        String input = "3♦";
        String output = "diamonds";

        CardSuit myObject = new CardSuit();
        String result = myObject.card_suit(input);

        assertThat(result).isEqualTo(output);
    }

    @Test
    void when_I_received_the_heart_emoji_I_get_heart(){
        String input = "3♥";
        String output = "hearts";

        CardSuit myObject = new CardSuit();
        String result = myObject.card_suit(input);

        assertThat(result).isEqualTo(output);
    }

    @Test
    void when_I_received_the_spade_emoji_I_get_spade(){
        String input = "3♠";
        String output = "spades";

        CardSuit myObject = new CardSuit();
        String result = myObject.card_suit(input);

        assertThat(result).isEqualTo(output);
    }
}
