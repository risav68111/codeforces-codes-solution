import java.util.Scanner;

public class cf1551a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int m= sc.nextInt();
            switch(m%3) {
                case 0 -> System.out.println(m/3+" "+ m/3);
                case 1 -> System.out.println(m/3+1+" "+ m/3);
                case 2 -> System.out.println(m/3+" "+ (m/3+1));
            }
        }
    }
}
