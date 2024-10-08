import java.util.Scanner;

public class cf200b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int con=n;
        double per= 0;
        while(n-->0) {
            per+= (double)sc.nextInt()/con;
        } 
        System.out.println(per);
    }
}
