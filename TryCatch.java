
//how to handle exception using try catch block
class TryCatch1 {
    public static void main(String[] args) {
        System.out.println("Before Exception...");

        try{
            System.out.println(10/0);        
        }
          catch(ArithmeticException eg) {
              System.out.println("Handlling Exception...");
          }
          System.out.println("After Exception");
    }
    
}
