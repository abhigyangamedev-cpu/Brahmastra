package Contest.Codeforces.Round_1131_Div3;

import java.util.Arrays;
import java.util.Scanner;

public class A_FractionAndSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String first = sc.next();
            String second = sc.next();

            StringBuilder remaining = new StringBuilder(first);
            boolean possible = true;

            for (char c : second.toCharArray()) {
                int index = remaining.indexOf(String.valueOf(c));

                if (index == -1) {
                    possible = false;
                    break;
                }

                remaining.deleteCharAt(index);
            }

            char[] letters = remaining.toString().toCharArray();
            Arrays.sort(letters);

            if (possible && new String(letters).equals("isx")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

}
