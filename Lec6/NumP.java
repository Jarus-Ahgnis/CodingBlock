import java.util.Scanner;
class NumP{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int space = n-1;
        int star = 1;
        int cnt  = 1;

        for(int rows = 1; rows<=n ;rows++){
            //space
            for(int i = 1 ; i<=space ;i++){
                System.out.print("  ");
            }
            //star
            for(int j = 1 ;j<=star ;j++){
                System.out.print(cnt+" ");
                cnt++;
            }  
            System.out.println();
            space--;
            star+=2;
        }
    }
}