import java.util.Scanner;

public class PeakEle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        peak(arr, n);

        sc.close();
    }

    // peak function
    static void peak(int[] arr, int n) {

        for (int i = 1; i < n - 1; i++) {

            // peak element condition
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Peak index: " + i);
            }
        }
    }
}