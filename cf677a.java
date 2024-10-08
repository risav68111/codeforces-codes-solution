import java.util.Scanner;

public class cf677a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int h= sc.nextInt();
        int count=0;
        while(n-->0) {
            int var= sc.nextInt();
            int vc= var>h ? count+=2 : count++;
        }
        System.out.println(count);
    }
}
