import java.util.Scanner;

class Divisiable {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("to check whether the number divisible by 5 & 11");
        number = sc.nextInt();

        if((number % 5 == 0) && (number % 11 == 0)) {
            System.out.println(number + "is divisible by 5 & 11");

        }else {
            System.out.println(number  + "is not divisible by 5 & 11");
        }

    }
    
}
