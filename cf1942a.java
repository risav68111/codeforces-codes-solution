import java.util.Scanner;

public class cf1942a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int k= sc.nextInt();
            if(n==k) {
                while(n-->0) {
                    System.out.println(1);
                }
            }else if(k==1){
                for(int i=0; i<n; i++) {
                    System.out.print(i+1+" ");
                }System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}