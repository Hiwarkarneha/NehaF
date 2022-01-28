import java.util.Scanner;

class SeriseEvenNo {
public static void main(String[] args) {
    int minimum, maximum;

    Scanner sc = new Scanner(System.in);

    System.out.println("minimum of series");
    minimum = sc.nextInt();
    System.out.println("maximum of series");
    maximum = sc.nextInt();
    findEven(minimum,maximum);
}
    public static void findEven(int minimum, int maximum){
        int i;
        if(minimum % 2!=0){
          minimum++;
        }
           for(i=minimum; i<=maximum; i++){
             if(i% 2==0){
                 System.out.print(i + "\t");

             }
           }
    }
}
