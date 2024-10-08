import java.util.Scanner;
public class cf1692a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0) {
            int o= sc.nextInt();
            int nn= 3;
            int cou=0;
            while(nn-->0) {
                if(o<sc.nextInt()) {
                    cou++;
                }
            }
            System.out.println(cou);
        }
    }
}