import java.util.Scanner;

public class cf1878a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0) {
            boolean bol= false;
            int n= sc.nextInt(), k= sc.nextInt();
            while(n-->0 ) {
                if(k== sc.nextInt()) {
                    bol= true;
                }
            }
            System.out.println(bol ? "YES": "NO");
        }
    }
}