package CP.Math;

import java.util.Scanner;

public class MinusTwo_2259B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int ones = 0, twos = 0, fours = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 4 == 0) {
                    fours++;
                } else if (x % 2 == 0) {
                    twos++;
                } else {
                    ones++;
                }
            }

            System.out.println(Math.max(ones, Math.max(twos, fours)));
        }
    }
}
