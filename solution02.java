import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int index = 0;
        long a, b;
        while(index < T) {
            long N = sc.nextLong();
            long sum = 0;
            a =1; b =2;
            for (long i = 0; b < N; i++) {
                if (b%2 == 0) {
                    
                    sum+=b;
                }
                long temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println(sum);
            index++;
        }
    }
}
