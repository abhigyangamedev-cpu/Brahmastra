package Greedy.Codeforces.Rated800;

import java.util.Scanner;

public class MinMaxGame_2263A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t -- > 0){
            int n = sc.nextInt();
            int c0 = 0, c1 = 0;

            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(x == 0) c0++;
                else c1++;
            }

            if(c1 >= c0) System.out.println("Bessie");
            else System.out.println("Elsie");


        }
    }
}
