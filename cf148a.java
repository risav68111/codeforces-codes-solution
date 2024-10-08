import java.util.Scanner;

public class cf148a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int d1= sc.nextInt();
        int d2= sc.nextInt();
        int d3= sc.nextInt();
        int d4= sc.nextInt();
        int total= sc.nextInt();
        int sum=0;
        for(int i=1; i<=total; i++) {
            if(i%d1==0 || i%d2==0 || i%d3==0 || i%d4==0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
