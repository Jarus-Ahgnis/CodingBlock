import java.util.Scanner;

class HEmp{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int star = 1;
        int space = (2*n)-3;

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
               
                if(k==n){
                    break;
                }else{
                    System.out.print("* ");
                }

            }
            System.out.println();
            star++;
            space-=2;
        }
    }
}