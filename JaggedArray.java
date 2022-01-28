 class JaggedArray {
    public static void main(String[] args) {
        //Jagged array that can contain 2 one d array
            int  x[] [] = new int [2][];      

        x[0] = new int[2];  //Store 2 element in first array
        x[1] = new int[3]; //Store 3 element in seond array 

        //Store 2 elements in first  array
           x[0][0] = 10;
           x[0][1] = 11;

        //Store 3 elements in second array
          x[1][0] = 12;
          x[1][1] = 13;
          x[1][2] = 14;
          //Display the first array
          for(int i = 0; i<2; i++){
              System.out.print(x[0][i]+ ",");

          }
          System.out.println();

          //Disply second array

          for(int i =0; i<3; i++){
              System.out.print(x[1][i]+ ",");
          }
    }
}
