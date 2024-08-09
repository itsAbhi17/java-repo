public class cointoss {
    static void generateOutcomes(int n, String outcome) {
        if (n == 0) {
            System.out.println(outcome);
            return;
        }
        generateOutcomes(n - 1, outcome + "H"); // Heads
        generateOutcomes(n - 1, outcome + "T"); // Tails
    }

    public static void main(String[] args) {
        int N = 3; // Number of coins
        int S = 4; // Number of flips

        generateOutcomes(N, ""); // Start with an empty outcome
    }
}

