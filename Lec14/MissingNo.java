import java.util.Scanner;

public class MissingNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        dis(arr, n);

    }
    static void dis(int[] arr, int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        int TSum = (n * (n + 1)) / 2;
        int miss = TSum - sum;
        System.out.println("Missing number: " + miss);
    }
    
}
