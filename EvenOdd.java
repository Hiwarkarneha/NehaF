import java.util.Scanner;

 class EvenOdd {
    public static void main(String[] args) {
     int num;

Scanner input = new Scanner(System.in);

 num = input.nextInt();

 if(num % 2  == 0)
     System.out.println(" is an Even Number!");
 
 else  
     System.out.println("is an Odd Number!");

    }
}
