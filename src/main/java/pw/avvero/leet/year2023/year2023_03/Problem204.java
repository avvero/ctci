package pw.avvero.leet.year2023.year2023_03;

public class Problem204 {

    public int countPrimes(int n) {
        int[] primes = new int[5000000];
        int primesi = 0;
        int i = 2;
        while (i < n) {
            if (isPrime(i, primes, primesi)) {
                primes[primesi++] = i;
                i = i + (i < 7 ? 1 : 2);
            } else {
                i += 1;
            }
        }
        return primesi;
    }

    private boolean isPrime(int n, int[] primes, int primesi) {
        for (int i = 0; i < Math.min(primesi, primesi); i++) {
            if (n % primes[i] == 0) {
                return false;
            };
        }
        return true;
    }
}
