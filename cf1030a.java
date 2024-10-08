import java.util.Scanner;

public class cf1030a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0) {
            if(sc.nextInt()==1) {
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");

    }
}
