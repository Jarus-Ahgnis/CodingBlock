import java.util.Scanner;
class FindingEle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
            display(arr,key);
    }
        

    static void display(int arr[], int key) {
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i] == key){
                System.out.println("Found at index "+i);
                return;
            }
        }
        System.out.println("Not found");
         
    }
   
} 