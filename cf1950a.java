import java.util.Scanner;

public class cf1950a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            System.out.println(a<b && b<c? "STAIR": a<b && b>c? "PEAK": "NONE");
        }
    }
}