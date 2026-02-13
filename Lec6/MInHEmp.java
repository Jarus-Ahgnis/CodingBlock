import java.util.Scanner;

class MInHEmp{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int space = 1;
        int star = n-1;

        for(int rows = 1; rows<=(2*n) - 1 ;rows++){
            //star
            for(int i = 1 ; i<=star ;i++){
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
            if(rows<n){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
        }
    }
}