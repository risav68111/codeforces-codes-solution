import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            String s= sc.next();
            System.out.println(s.contains("it")? "YES": "NO");
        }
    }
}