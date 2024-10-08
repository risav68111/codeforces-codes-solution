import java.util.Scanner;

public class cf703a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m= 0;
        int c=0; 
        while(n-->0) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int d= (a> b ? m++:b>a?c++:1);
        }
        System.out.println(m>c? "Mishka": (c>m? "Chris":"Friendship is magic!^^"));
    }
}
