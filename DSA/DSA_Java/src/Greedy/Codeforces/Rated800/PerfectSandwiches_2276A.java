package Greedy.Codeforces.Rated800;

import java.util.Scanner;

public class PerfectSandwiches_2276A {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a > b){
                System.out.println(Math.min(b,a-b));
            }else{
                System.out.println(-1);
            }
        }
    }
}
