// maximum subarray  (Kadane's Algorithm)
import java.util.Scanner;
public class MaxSubArr{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        for(int i=0;i<n;i++){
              CurrentSum  += arr[i];
              if(CurrentSum > maxSum){
                  maxSum = CurrentSum;
              }
              if(CurrentSum < 0){
                  CurrentSum = 0;
              }
        }
        System.out.println(maxSum);
    }
}

