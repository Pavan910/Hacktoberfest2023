package Recursion;

public class ReturnStatement {

    static void function(int n){

        if(n==0){
            return ;

        }
        System.out.println("Recursion call:"+n);
        function(n-1);
    }

    public static void main(String[] args) {
        function(8);
    }
}



        
