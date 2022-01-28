import java.io.*;
class Demo {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a Char : ");
         char ch = (char) br.read();
         System.out.println("Char is : "+ch);


         
         System.out.println("Enter a String");
         String str = br.readLine();
         System.out.println("String is : "+str);
    }
}