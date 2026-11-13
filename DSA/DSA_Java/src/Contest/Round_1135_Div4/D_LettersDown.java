package Contest.Round_1135_Div4;

import java.util.Scanner;

public class D_LettersDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] needed = new boolean[26];

            for (int i = 0; i < n / 2; i++) {
                int a = s.charAt(i) - 'a';
                int b = s.charAt(n - 1 - i) - 'a';

                int low = Math.min(a, b);
                int high = Math.max(a, b);

                for (int letter = low + 1; letter <= high; letter++) {
                    needed[letter] = true;
                }
            }

            int operations = 0;
            for (boolean step : needed) {
                if (step) {
                    operations++;
                }
            }

            System.out.println(operations);
        }

        sc.close();
    }
}
