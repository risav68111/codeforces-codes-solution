import java.util.Scanner;

public class cf4a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        if(i<3) {
            System.out.println("NO");
        }else if(i%4==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
