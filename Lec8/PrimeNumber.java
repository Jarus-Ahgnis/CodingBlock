import java.util.Scanner;
class PrimeNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for(int i = 1; i<n; i++){
            if(n%i==0){
                cnt++;
            }
        }if(cnt==2){
            System.out.print("Prime");
        }else{
            System.out.print("Not-Prime");
        }
        sc.close();
    }
    
}