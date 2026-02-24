import java.util.Scanner;
class MinArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1 ; i<n ;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
            display(arr,min);
    }
        

    static void display(int arr[], int min) {
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i] == min){
                System.out.println("Found at index "+i);
                return;
            }
        }
        System.out.println("Not found");
         
    }
   
} 