import java.util.Scanner;

class SSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // selection sort
        for(int i = 0; i < n - 1; i++){

            int minI = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minI]){
                    minI = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = temp;
        }

        display(arr);
        sc.close();
    }

    static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}