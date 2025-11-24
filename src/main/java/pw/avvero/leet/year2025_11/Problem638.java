package pw.avvero.leet.year2025_11;

import java.util.*;

public class Problem638 {

    private int max = Integer.MAX_VALUE;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        track(price, special, needs, 0, 0);
        return max;
    }

    private void track(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int s, int priceSoFar) {
        int priceForNeeds = 0;
        for (int i = 0; i < needs.size(); i++) {
            if (needs.get(i) < 0) return;
            priceForNeeds += needs.get(i) * price.get(i);
        }
        max = Math.max(max, priceSoFar + priceForNeeds);
        for (int i = s; i < special.size(); i++) {
            List<Integer> offer = special.get(i);
            //
            List<Integer> remainNeeds = new ArrayList<>();
            boolean belowZero = false;
            for (int j = 0; j < needs.size(); i++) {
                int v = needs.get(j) - offer.get(j);
                remainNeeds.add(v);
                if (v < 0) {
                    belowZero = true;
                    break;
                }
            }
            if (belowZero) break;
            Integer offerPrice = offer.get(offer.size() - 1);
            track(price, special, remainNeeds, i, priceSoFar + offerPrice);
        }
    }
}
