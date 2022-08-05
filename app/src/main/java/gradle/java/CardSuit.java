package gradle.java;

public class CardSuit {
    public String card_suit(String input) {
        if (input == "3♣"){
            return "clubs";
        }
        return "Sorry, I don't know what emoji is this one :/";
    }
}
