import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Palidrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String :");
        String str = br.readLine();
    
        String temp = str;
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        str = sb.toString();

       if(temp.equalsIgnoreCase(str)) 
           System.out.println(temp = "this is a palidrome");
        else 
        System.out.println("This is not a palidrome");

       } 
    }

