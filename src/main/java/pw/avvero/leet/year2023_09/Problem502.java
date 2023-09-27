package pw.avvero.leet.year2023_09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Problem502 {

    private class Project {
        int profit;
        int capital;
        Project(int profit, int capital) {
            this.profit = profit;
            this.capital = capital;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Project> projects = new PriorityQueue<>((a, b) -> {
            int diff = a.capital - b.capital;
            if (diff == 0) {
                return b.profit - a.profit;
            } else {
                return diff;
            }
        });
        for (int i = 0; i < profits.length; i++) {
            projects.add(new Project(profits[i], capital[i]));
        }
        while (k > 0 && !projects.isEmpty()) {
            Project next = nextMaximum(projects, w);
            if (next == null) {
                break;
            }
            w += next.profit;
            k--;
            projects.remove(next);
        }
        return w;
    }

    private Project nextMaximum(PriorityQueue<Project> projects, int w) {
        Project result = null;
        Iterator<Project> iterator = projects.iterator();
        while(iterator.hasNext()) {
            Project next = iterator.next();
            if (next.capital <= w) {
                if (result == null || next.profit > result.profit) {
                    result = next;
                }
            }
        }
        return result;
    }
}
