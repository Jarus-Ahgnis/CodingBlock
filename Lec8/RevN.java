import java.util.Scanner;
public class RevN{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        System.out.print(rev);
        sc.close();
    }
}