package Chapter4;

public class task8 {
    public static int cumulativeSum(int... nums) {
        int total = 0;

        for (int n : nums) {
            int cumulative = 0;

            // Compute 1 + 2 + ... + n
            for (int i = 1; i <= n; i++) {
                cumulative += i;
            }

            System.out.println("Cumulative sum for " + n + " = " + cumulative);
            total += cumulative;
        }

       return total;
    }

    public static void main(String[] args) {
        int result = cumulativeSum(4, 5, 10);
        System.out.println("Total of all cumulative sums = " + result);

    
    
}
}