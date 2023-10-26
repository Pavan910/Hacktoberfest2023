package Practice;

public class RecursiveMethod {
    //factorial from recursion
    //3!=3*2*1
    //res=(n-1)!*n

    static int factorial(int n){
        if(n==0){
            return 1;

        }
        return factorial(n-1)*n;
    }

    public static void main(String[] args) {
        int result=factorial(8);
        System.out.println(result);
    }
}
