package Contest.LeetCode.WeeklyContext_526;

public class minimizeTheMaxValueOfGCDConnectedArray {
    public static long gcd(long a, long b){
        while(b != 0){
            long rem = a%b;
            a = b;
            b = rem;
        }
        return Math.abs(a);
    }

    public static long spf(long x){
        if(x % 2 == 0) return 2;

        for(long p = 3; p <= x/p; p+=2) if(x % p == 0) return p;

        return x;
    }

    public static long minimumMaxValue(int n, int index, int value) {
        if(n == 1 ) return value;
        if(value == 1) return -1;

        long left = index;
        long right = (long)(n - 1 - index);
        long val = value;

        if(left > 0){
            long firstLeft = val - spf(val);
            if(firstLeft <= 0) return -1;
            long remaining = left - 1;
            if(remaining > (firstLeft - 2)/2) return -1;
        }


        long firstRight = value;

        if(right >0 && val%2 != 0){
            firstRight += spf(val);
            right--;
        }

        return firstRight + 2*right;
    }

    public static void main(String[] args){
        System.out.println(minimumMaxValue(4,2,8));
    }
}
