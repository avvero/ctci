package pw.avvero.leet.year2023.year2023_09;

import java.util.Arrays;
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
        Project[] projects = new Project[profits.length];
        for (int i = 0; i < profits.length; i++) {
            projects[i] = new Project(profits[i], capital[i]);
        }
        Arrays.sort(projects, (a, b) -> a.capital - b.capital);
        PriorityQueue<Integer> profitable = new PriorityQueue<>((a, b) -> b - a);
        int i = 0;
        while (k-- > 0) {
            while (i < projects.length && projects[i].capital <= w) {
                profitable.offer(projects[i].profit);
                i++;
            }
            if (profitable.isEmpty()) {
                break;
            }
            w += profitable.poll();
        }
        return w;
    }
}
