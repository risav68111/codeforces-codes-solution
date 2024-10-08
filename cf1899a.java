import java.util.Scanner;

public class cf1899a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0) {
            int i= sc.nextInt();
            int a= i+1, b= i-1;
            if(a%3==0 || b%3==0) {
                System.out.println("First");
            }
            else {
                System.out.println("Second");
            }
        }
    }
}