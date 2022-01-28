import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class Exam1 { 
    public static void main(String[] args) throws IOException {
        
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter University : ");
         String Univ = br.readLine();

         System.out.println("Enter College :");
         String coll = br.readLine();

         System.out.println("Enter Student");
          String stud = br.readLine();

          System.out.println(Univ);
          System.out.println(coll);
          System.out.println(stud);

          System.out.println("APPEND METHOD");

          sb.append(Univ);
          sb.append(stud);

          System.out.println("sb Name : "+sb);

          int n = Univ.length();
          System.out.println(n);

          sb.insert(n,"WORD");
          System.out.println(sb);

          System.out.println("Full name : "+sb);
          System.out.println("In reverse :" +sb.reverse());
    }
    
}
