// Reverse an array 
import java.util.Scanner;
class RevArr{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];w
            arr[n - 1 - i] = temp;
        }

        System.out.println("Reversed array:");
        for (int x : arr)
            System.out.print(x + " ");
        sc.close();
        
    }
}