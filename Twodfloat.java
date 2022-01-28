 class Matrix {
     public static void main(String[] args) {
        float x[][] = {{1.1f,1.2f,1.3f, 1.4f},
                 {2.1f,2.2f,2.3f,1.4f},
                 {3.1f, 3.2f,3.3f,3.4f}} ;
                 System.out.println("number in matrix from :");
                 for(int i=0;i<3; i++) {  //i=rows
                    for(int j=0; j<4; j++) { //=colums
                        System.out.println(x[i][j] + "\t");

                    }
                      System.out.println(); //nextline
                 }
     }
    
}
