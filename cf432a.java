import java.util.Scanner;

public class cf432a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        int co= sc.nextInt();
        int count= 0;
        while(c-->0) {
            if (5-sc.nextInt()>=co) {
                count++;
            }
        }
        System.out.println(count/3);
    }
}
