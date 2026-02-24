// Right Shift by 3
import java.util.Scanner;

class RS3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 3; 
        for(int j = 0; j < k; j++) {

            if (n > 0) {
                int last = arr[n - 1];

                for (int i = n - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }

                arr[0] = last;
            }
        }

        System.out.println("Array after right shift by 3:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}