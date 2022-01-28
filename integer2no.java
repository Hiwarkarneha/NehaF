import java.util.Scanner;

class integer2no {
   public static void main(String[] args) {
    int num1,num2;
 
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter minimum number: ");
    num1=sc.nextInt();

    System.out.print("Enter maximum number: ");

    num2=sc.nextInt();

    if(num1<num2){

    System.out.println(num1+" is minimum");

     } else if(num1>num2){

    System.out.println(num2+" is maximum");

     }else {

    System.out.println("The minimum Number is 56 & 99 is" +num1);

 }

       
   } 
}
