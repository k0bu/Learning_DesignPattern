public class Hand {
    public static final int HANDVALUE_ROCK = 0;
    public static final int HANDVALUE_SCISSORS = 1;
    public static final int HANDVALUE_PAPER = 2;

    public static final Hand[] hand = {
        new Hand(HANDVALUE_ROCK),
        new Hand(HANDVALUE_SCISSORS),
        new Hand(HANDVALUE_PAPER),
    };

    private static final String[] name = {
        "Rock", "Scissors", "Paper",
    };

    private int handValue;
    private Hand(int handValue) {
        this.handValue = handValue;

    }

    public static Hand getHand (int handValue) {
        return hand[handvalue];

    }

    public boolean isStrongerThan (Hand h) {
        return fight(h) == 1;

    }

    public boolean isWeakerThan (Hand h) {
        return fight(h) == -1;
    
    }

    private int fight (Hand h) {
        if(this == h) {
            return 0;

        } else if ( (this.handValue + 1) % 3 == h.handValue ) {
            return 1;

        } else {
            return -1;

        }
    }

    public String toString() {
        return name[handValue];

    }
}