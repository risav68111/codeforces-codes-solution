import java.util.Scanner;

public class cf1619a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            String s= sc.next();
            int c=s.length();
            if(c%2==0) {
                System.out.println(s.substring(0, c/2).equals(s.substring(c/2))? "YES": "NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}