import java.util.Scanner;
public class InT{
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n-1;
        int space = 1;

        for(int row = 1; row<=n ;row++){
        //spaces
        for(int i = 1; i<=space ;i++){
            System.out.print("  ");
        }
        //star
        for(int j = 1 ;j<=star ;j++){
            System.out.print("* ");
        }

        System.out.println();

        space++;
        star--;

        }

    }
}