import java.util.Scanner;

public class cf492a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int c=0;
        int a=0;
        while(n>=a) {
            c++;
            a+=c*(c+1)/2;
        }
        System.out.println(c-1);
    }
}