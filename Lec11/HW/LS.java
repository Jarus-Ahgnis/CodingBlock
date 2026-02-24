import java.util.Scanner;

class LS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //left shift
        if (n > 0) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            arr[n - 1] = first;
        }

        System.out.println("Array after left shift:");
        for (int x : arr)
            System.out.print(x + " ");
        sc.close();
    }
}