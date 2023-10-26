import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, k, temp;
        System.out.println("how many elements?");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            for (k = 0; k < n - i - 1; k++) {
                if (a[k] > a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
