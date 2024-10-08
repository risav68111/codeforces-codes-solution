import java.util.Scanner;

public class cf1560a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0) {
            int ii= sc.nextInt();
            int i=1,ans=0;
            while(i<1800) {
                if(i%10!=3 && i%3!=0) {
                    ans++;
                }
                if(ans==ii) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }
    }
}
