package Arrays.ProblemSet.Codeforces.Rated800;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveSmallest_1399A {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            boolean check = true;

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i + 1] - a[i] > 1) {
                    check = false;
                    break;
                }
            }

            if (check || a.length == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

}

