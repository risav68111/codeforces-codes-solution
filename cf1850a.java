import java.util.*;

public class cf1850a {
    public static void main(String[] args) {
        // InputStream ins= System.in;
        // OutputStream ops= System.out;
        // InputReader ir= new InputReader(ins);
        // OutputWriter ow= new OutputWriter(ops);
        
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            boolean ss= (a+b>9? true: a+c>9? true: b+c>9? true : false);
            System.out.println(ss? "YES": "NO");
        }

    }
}