package Recursion;

public class sumOfDigitRecursion {

    static int sumRecursion(int n, int sum){

        if(n==0) {
            return sum;
        }

            sum  += n % 10;
            n=n/10;


        return sumRecursion(n,sum);
    }

    public static void main(String[] args) {
        System.out.println(sumRecursion(64345654,0 ));

    }
}
