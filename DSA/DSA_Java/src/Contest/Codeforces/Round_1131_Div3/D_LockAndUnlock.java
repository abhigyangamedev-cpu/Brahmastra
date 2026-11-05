package Contest.Codeforces.Round_1131_Div3;

import java.util.*;

public class D_LockAndUnlock {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

        int t = sc.nextInt();
        while (t -- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++) a[i] = sc.nextInt();

            Arrays.sort(a);
            long x = a[n/2];

            long cost = 0;
            for(int i = 0; i < n; i++) cost += Math.abs(a[i]-x);

            long ops = a[n-1] - a[0];
            System.out.println(cost + " " + ops);
        }
    }
}
