package pw.avvero.leet.year2026_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem846 {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        Arrays.sort(hand);
        //
        List<Integer>[] cards = new List[hand.length / groupSize];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new ArrayList<>();
        }
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                if (cards[j].size() == groupSize) continue;
                //
                if (cards[j].size() == 0) {
                    cards[j].add(hand[i]);
                    break;
                }
                int last = cards[j].get(cards[j].size() - 1);
                if (last + 1 == hand[i]) {
                    cards[j].add(hand[i]);
                    break;
                }
            }
        }
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].size() != groupSize) return false;
        }
        return true;
    }
}
