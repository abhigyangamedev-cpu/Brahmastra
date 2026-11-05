
package Contest.Codeforces.Round_1131_Div3;

import java.util.Scanner;

public class C_MathsAndPhysics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long sum = 0;
            boolean all_ones = true;
            boolean mid_ones = true;

            for (int i = 0; i < n; i++) {
                sum += a[i];

                if (a[i] != 1) {
                    all_ones = false;
                }

                if (i > 0 && i < n - 1 && a[i] != 1) {
                    mid_ones = false;
                }
            }

            if (all_ones) {
                System.out.println(-1);
            }
            else if (mid_ones) {
                System.out.println(sum - n + 1);
            }
            else {
                System.out.println(sum - 1);
            }
        }

        sc.close();
    }
}
