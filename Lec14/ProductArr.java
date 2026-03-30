import java.util.Scanner;

class resArr{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int result[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        display(arr, n);

    }
        static void display(int arr[], int n) {
        // res
        for(int i = 0; i < n; i++){
            int res = 1;

            for(int j = 0; j < n; j++){
                if(i != j){
                    res = res * arr[j];
                }
            }

            result[i] = res;
        }

        // print result
        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
    }
}