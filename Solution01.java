import java.io.*;
import java.util.*;

public class Solution {
    public static long sumOfFactors (long n, long upto) {
        long m  = (upto-1)/n;
        return (n*(m*(m+1))/2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        int i = 0;
        while(i < T) {
            long N = sc.nextLong();
            long ans = sumOfFactors(3,N) + sumOfFactors(5,N) - sumOfFactors(15,N);
            System.out.println(ans);
            i++;
        }
    }
}
