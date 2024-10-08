import java.util.Scanner;

public class cf1719a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String cf= "codefrcs";
        while(n-->0) {
            System.out.println(cf.contains(sc.next())? "YES": "NO");
        }
    }
}
