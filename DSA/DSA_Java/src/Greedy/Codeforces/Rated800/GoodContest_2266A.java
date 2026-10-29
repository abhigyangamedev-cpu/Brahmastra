package Greedy.Codeforces.Rated800;

import java.util.Scanner;

public class GoodContest_2266A {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t -- > 0){
            int n = sc.nextInt();
            int[] a = new int[3];

            for(int i = 0; i < 3; i++){
                a[i] = sc.nextInt();
            }

            int limiting_problem = Math.min(Math.min(a[0],a[1]),Math.min(a[1],a[2]));

            System.out.println(n - limiting_problem);

        }
    }
}
