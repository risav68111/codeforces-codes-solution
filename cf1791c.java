import java.util.Scanner;

public class cf1791c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0) {
            int len= sc.nextInt();
            String s= sc.next();
            while(s.length()>1 && s.charAt(0)!= s.charAt(s.length()-1)) {
                s= s.substring(1, s.length()-1);
            }
            System.out.println(s.length());
        }
    }
}