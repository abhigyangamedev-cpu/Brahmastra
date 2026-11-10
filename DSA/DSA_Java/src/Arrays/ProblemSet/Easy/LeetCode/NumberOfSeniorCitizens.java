package Arrays.ProblemSet.Easy.LeetCode;

public class NumberOfSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count = 0;

        for(String info : details){
            char tens = info.charAt(11);
            char ones = info.charAt(12);
            if(tens > '6' || (tens == '6' && ones > '0')) count++;
        }

        return count;

    }

    public static void main(String[] args){
        String[] details = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        System.out.println(countSeniors(details));
    }
}
