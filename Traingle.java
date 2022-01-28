import java.util.Scanner;

class Traingle {
  public static void main(String[] args) {
    int x=30; 
    int y=60; 
    int z=70; 
    int sum;  
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter the first number: ");  
    x = sc.nextInt();  
    System.out.print("Enter the second number: ");  
    y = sc.nextInt();  
    System.out.print("Enter the third number: ");  
    z = sc.nextInt();  
    sum = sum(x, y, z);  
    System.out.println("The traingle with angles 30 60 & 70 is a invalid one: " + sum);  
    }  
    public static int sum(int a, int b, int c)  
    {  
    int sum = a + b + c;  
    return sum;  
      
  }
    
}
