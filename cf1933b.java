import java.util.Scanner;

public class cf1933b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int sum=0;
            for(int i=0; i<n; i++) {
                int v=sc.nextInt()%3;
                if(v==1) {
                    b1=true;
                } else if(v==2) {
                    b2=true;
                }
                sum+= v;
            }
            sum=sum%3;
            System.out.println(sum==0? 0: sum==1 && b1? 1:sum==2 && b2? 1:2);
        }
    }
}