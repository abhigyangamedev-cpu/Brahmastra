package CP.CodeForces.Arrays;

import java.io.IOException;
import java.util.Scanner;

public class Tram_116A {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[] res = new int[n];
        res[0] = b[0];

        for(int i = 1; i < res.length; i++){
            res[i] = res[i - 1] - a[i] + b[i];
        }

        int capacity = 0;

        for(int i = 0; i < res.length; i++){
            capacity = Math.max(capacity,res[i]);
        }

        System.out.println(capacity);

    }
}
