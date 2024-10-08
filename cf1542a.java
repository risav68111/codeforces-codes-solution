import java.util.Scanner;

public class cf1542a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt(), a= 0;
            for(int i=0; i<2*n; i++) {
                a+= (sc.nextInt()%2!=0? 1:0);
            }
            System.out.println(a==n ? "YES" :"NO");
            // if(n==1) {
            //     System.out.println(sc.nextInt()== sc.nextInt() ? "Yes": "No");
            // } else { 
            //     while(n-->0) {
            //         a+= sc.nextInt(); 
            //     }
            //     System.out.println(a%4==0 ? "NO": "YES");
            // }
        }
    }
}
