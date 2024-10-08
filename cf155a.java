import java.util.Scanner;

public class cf155a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt(), mi= sc.nextInt(),mx=0,cou=0;
        mx=mi;
        while(--l>0) {
            int in= sc.nextInt();
            if(mi>in) {
                mi=in;
                cou++;
            } else if(mx<in) {
                mx=in;
                cou++;
            }
        }
        System.out.println(cou);
    }
}
