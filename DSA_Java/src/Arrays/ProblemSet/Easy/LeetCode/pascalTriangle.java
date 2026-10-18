package Arrays.ProblemSet.Easy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static long nCr(int n, int r) {
        if (n < 0 || r < 0 || r > n) {
            throw new IllegalArgumentException("Require n >= 0 and 0 <= r <= n");
        }

        r = Math.min(r, n - r);
        long result = 1;

        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }

        return result;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                currentRow.add((int) nCr(row, col));
            }

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args){
        List<List<Integer>> triangle = generate(5);
        System.out.print(triangle);
    }

}
