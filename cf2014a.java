import java.util.Scanner;

public class cf2014a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0 ) {
            int n= sc.nextInt(), k= sc.nextInt();
            int p= 0;
            int count= 0;
            while(n--> 0) {
                int x= sc.nextInt();
                if(p>0 && x==0) {
                    count++;
                    p--;
                } else if(x>=k) {
                    p+=x;
                }
            }
            System.out.println(count);
        }
    }
}