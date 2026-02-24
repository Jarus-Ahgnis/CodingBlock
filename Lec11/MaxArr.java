import java.util.Scanner;
class MaxArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1 ; i<n ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
            display(arr,max);
    }
        

    static void display(int arr[], int max) {
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i] == max){
                System.out.println("Found at index "+i);
                return;
            }
        }
        System.out.println("Not found");
         
    }
   
} 