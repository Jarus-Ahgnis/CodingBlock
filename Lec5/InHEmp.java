import java.util.Scanner;

class InHEmp{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int space = 0;
        int star = n;

        for(int rows = 1; rows<=n ;rows++){
            //star
            for(int i = 1 ;i<=star ;i++){
                System.out.print("* ");
            }
            //space
            for(int j = 1 ;j<=space ;j++){
                System.out.print("  ");
            }  
            //star
            for(int k = 1 ;k<=star ;k++){
                System.out.print("* ");
            }
            System.out.println();
            star--;
            space+=2;
        }
    }
}