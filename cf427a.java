import java.util.Scanner;

public class cf427a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int d=0,cr=0;
        while(l-->0) {
            int c=sc.nextInt();
            d+=c;
            if(d==-1) {
               cr++;
               d++;
            }
        }
        System.out.println(cr);
    }
}
