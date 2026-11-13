package Contest.Round_1135_Div4;

import java.util.Arrays;
import java.util.Scanner;

public class A_ThreePiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t -- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int[] arr = new int[]{a,b,c};
            Arrays.sort(arr);

            if(arr[2] - arr[1] == 1 && arr[1] - arr[0] == 1 && arr[2] - arr[0] == 2)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
