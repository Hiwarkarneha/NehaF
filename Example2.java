import java.io.*;
 
 class Example {
    public static void main(String[] args) throws IOException {
        
        //String empty String buffer object
        StringBuffer sb = new StringBuffer();
         
        //accept the input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //accept surname
        System.out.println("Enter Surname : ");
        String sur = br.readLine();

        System.out.println("Enter MddleName : ");
        String MName = br.readLine();

        System.out.println("Enter name");
        String name = br.readLine();

        System.out.println(sur);
        System.out.println(name);
        System.out.println(MName);

        System.out.println("APPEND METHOD");
        //append sur to sb
        sb.append(name);

        System.out.println("SB Name :" +sb);

        //insert
        
        int n = sur.length();
        System.out.println(n);
        sb.insert(n, "WORD");
        System.out.println(sb);

        System.out.println("Full Name : " +sb);
        System.out.println("In reverse : "+sb.reverse());

    }
}
