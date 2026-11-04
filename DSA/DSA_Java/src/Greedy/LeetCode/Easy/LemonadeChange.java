package Greedy.LeetCode.Easy;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {

        int fives = 0;
        int tens = 0;

        for(int bill : bills){
            if(bill == 5){
                fives++;
            }else if(bill > 5){
                if(bill == 10){
                    if(fives > 0){
                        fives--;
                        tens++;
                    }else return false;
                }else if(bill == 20){
                    if(fives > 0 && tens > 0 ){
                        fives--;
                        tens--;
                    }else if(fives >= 3){
                        fives -= 3;
                    }else return false;
                }else return false;
            }
        }

        return true;

    }

    public static void main(String[] args){
        int[] arr = {5,5,5,10,20};
        System.out.println(lemonadeChange(arr));
    }
}
