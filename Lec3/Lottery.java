import java.util.Scanner;

public class Lottery{
   public static void main(String[] args){
     
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
  
    if(n>=300 && n <=460){
      System.out.println("Congratulations! You just won a Macbook");
    }
    else if(n>=200 && n <=280){
      System.out.println("Congratulations! You just won a Kurkure");
    }
    else if(n>=1100 && n <=1500){
      System.out.println("Congratulations! You just won a Cycle");
    }
    else if(n>=50 && n<=80){
      System.out.println("You won a Bike");
    }
    else{
      System.out.println("Better luck next time");
    }
     sc.close();
   }

}
