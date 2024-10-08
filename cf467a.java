import java.util.Scanner;

public class cf467a {
    public static void main(String[]  args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;
        while(n-->0) {
            int min= sc.nextInt()- sc.nextInt();
            if(-min>1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
