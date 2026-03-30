import java.util.Scanner;
// product of array except self Optimized
public class ProductArrOp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        display(arr, n);

    }
    static void display(int[] arr, int n){
        int res = 1;
        //product of all elements in the array
        for(int i = 0; i < n; i++){
            res = res * arr[i];
        }
        //display the new array
        for(int i = 0; i < n; i++){
            int newRes = res / arr[i];
            System.out.print(newRes + " ");
        }
    }
    
}
