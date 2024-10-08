import java.util.Scanner;

public class cf1294a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int n= sc.nextInt();
            int m= 3*Math.max(Math.max(a,b), c)-a-b-c;
            n-=m;
            System.out.println(n>=0 && n%3==0? "YES": "NO");
        }
    }
}

