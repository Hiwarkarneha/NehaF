import java.util.Scanner;

class integerno {
    public static void main(String[] args) {
        int num1, num2, num3;
 
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter minimum number: ");
    num1=sc.nextInt();

    System.out.print("Enter midal number: ");
       num2=sc.nextInt();

     System.out.println("Enter maximum number");
     num3=sc.nextInt();

    if(num1<num2){

    System.out.println(num1+" is midal");

     } else if(num1<num2){

    System.out.println(num2+ " is minimum");

     }else if(num1>num3){
         System.out.println(num3+ "is maximum");
     } else{
    System.out.println("The minimum Number is 56 7 & 99 is:" +num3);

 }

    }
}

