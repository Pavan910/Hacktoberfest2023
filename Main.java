package Recursion;

import java.io.*;
import java.util.*;

class Solution {

    public ArrayList<Integer> perfect(int n) {
        // your solutions goes here..
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPerfect(i, 2, i / 2, 1)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    public static boolean isPerfect(int num, int divisor, int maxDivisor, int sum) {
        if (divisor > maxDivisor) {
            return sum == num;
        }
        if (num % divisor == 0) {
            sum += divisor;
        }
        return isPerfect(num, divisor + 1, maxDivisor, sum);
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}
