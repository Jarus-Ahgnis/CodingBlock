import java.util.Scanner;

public class Sp{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the first term: ");
 	int a = sc.nextInt();

	System.out.println("Enter the common difference: ");
 	int d = sc.nextInt();
       

        for(int i= 1 ; i<=50 ;i++ ){
		 int t = a +(i - 1)*d;
	System.out.println( t+ " ");
	}
	
	
	}


}