package CP.CodeForces.Arrays;

import java.io.IOException;
import java.util.Scanner;

public class MaximumIncrease_702A {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];


        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int count = 1;
        int max = 1;

        for(int i = 1; i < a.length; i++){
            if(a[i-1] < a[i]){
                count++;
            }else{
                count = 1;
            }

            max = Math.max(max,count);
        }

        System.out.println(max);

    }
}
