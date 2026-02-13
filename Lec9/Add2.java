import java.util.Scanner;
class Add2{
    //void
    public static void add(int a, int b){
        int c = a+b;
        System.out.print(c);
    }

    /*
    //function
    public static int add(int a , int b){
        int c = a+b;
        return c;
    }
     */

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        add(a,b);
    }


}