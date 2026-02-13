import java.util.Scanner;

public class ExTEP{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 1;
        int space = n-1;

        for(int rows = 1 ;rows<=n ;rows++ ){
            //space
            for(int i = 1 ;i<=space ;i++){
                System.out.print("  ");

            }
            //star
            for(int j = 1 ;j<=star ;j++){
                if(j%2==1){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
            }
            System.out.println();
            space--;
            star+=2;
        
        }
    }
}