import java.util.Scanner;
class MLRT{
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n- 1;
        int star = 1;

    for(int row = 1; row<=(2*n)-1 ;row++){
        //spaces
        for(int i = 1; i<=space ;i++){
            System.out.print("  ");
        }
        //star
        for(int j = 1 ;j<=star ;j++){
            System.out.print("* ");
        }

        System.out.println("  ");

    
        if(row<n){
            star++;
            space--;
        }else{
            star--;
            space++;
        }
    }

}
   
}