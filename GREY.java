import java.util.*;

public class GREY {

    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int total = 1 << n; // 2^n values
        for (int i = 0; i < total; i++) {
            result.add(i ^ (i >> 1)); // Gray code formula
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 2; // change this to test other values
        List<Integer> graySequence = grayCode(n);

        System.out.println("Gray code sequence for n = " + n + ":");
        System.out.println(graySequence);
    }
}
