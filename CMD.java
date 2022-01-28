 class prog1 {
     public static void main(String[] args) {
         int n = args.length; //to find no of arguments
         System.out.println("Number of Arguments : " +n);

         System.out.println("The Arguments are : ");
         for(int i=0; i<n; i++){
             System.out.print(args[i]+"\t");
         }
     }
    
}
