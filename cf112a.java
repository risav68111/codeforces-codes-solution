import java.util.Scanner;

public class cf112a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        int i= s1.compareToIgnoreCase(s2);
        if(i==0) {
            System.out.println(0);
        } else if(i>0) {
            System.out.println(1);
        } else  {
            System.out.println(-1);
        }
    }
}
