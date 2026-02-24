import java.util.Scanner;
// Swapping using Arithmatic operator
class Swap2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
    static void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);
    }


}