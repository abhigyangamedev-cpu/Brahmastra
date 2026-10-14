package Arrays.ProblemSet.Easy.NeetCode;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangleII {
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

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        for (int col = 0; col <= rowIndex; col++) {
            row.add((int) nCr(rowIndex, col));

        }
        return row;

    }

    public static void main(String[] args){
        List<Integer> row = getRow(5);
        System.out.print(row);
    }
}
