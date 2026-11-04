package Greedy.LeetCode.Easy;

import java.util.*;

public class BuyTwoChocolates {
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int min = prices[0];
        int secondMin = prices[1];
        int sum = min + secondMin;

        if(money - sum >= 0) return money - sum;
        else return money;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2};
        System.out.println(buyChoco(arr,3));
    }
}
