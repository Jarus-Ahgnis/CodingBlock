import java.util.Scanner;

public class InTp{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = (2*n)-1;
        int space = 0;

        for (int rows = 1 ;rows<= n ; rows++ ){
            //spaces
            for(int i = 1 ;i<=space ;i++){
                System.out.print(" ");

            }
            //star
            for (int j = 1;j<=star ;j++){
                System.out.print("*");
            }
            System.out.println();
            space++;
            star-=2;
        }

        
    }
}