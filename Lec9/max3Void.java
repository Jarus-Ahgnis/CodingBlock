import java.util.Scanner;
class max3Void{
    public static void j(int a, int b, int c){
        if(a>b && a>c){
            System.out.print(a);
        }else if(b>a && b>c){
            System.out.print(b);
        }else{
            System.out.print(c);
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
            
        j(a,b,c);
        sc.close();
      
    }
}
