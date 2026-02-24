import java.util.Scanner;

// Right Shift by 3 Optimized

public class RS3O {

    static void rev(int[] arr, int start, int end) {    // void function for reversal
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {    //main function 

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)     // array input
            arr[i] = sc.nextInt();

        int k = 3;   // right shift value

        k = k % n;

        rev(arr, 0, n - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

        sc.close();
    }
}