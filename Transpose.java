 import java.io.*;
 import java.util.Scanner;

 
 class Transpose {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);     
    

    System.out.println("Enter Rows, Columns : ");
    int row = sc.nextInt();
    int column = sc.nextInt();

    int arr[][] = new int[row][column];
    System.out.println("Enter Elements of matrix: ");

    for(int i=0; i < row; i++){
     for(int j=0; j<column; j++) {
         arr[i][j] = sc.nextInt();
     }

    }
    
    System.out.println("Transpose of Matrix : ");

    for(int i =0; i<column; i++) {
      for(int j=0; j<row; j++) {
        System.out.print(arr[j][i] + " ");
      }
        System.out.println();
    }
    }

    }