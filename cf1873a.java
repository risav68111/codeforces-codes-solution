import java.util.Scanner;

public class cf1873a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w= sc.nextInt();
        while(w-->0) {
            String s= sc.next();
            System.out.println(s.charAt(0)=='a' || s.charAt(1)=='b' || s.charAt(2)=='c'? "YES": "NO");
        }
    }
}
