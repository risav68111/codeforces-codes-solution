import java.util.Scanner;

public class cf1512a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0) {
            int arlen= sc.nextInt();
            int ar[]= new int[arlen];
            int t= 0; 
            int p=0; 
            for(int i=0; i<arlen; i++) {
                ar[i]=sc.nextInt();
                if(ar[0]== ar[i]) {
                    t++;
                } else {
                    p=i;
                }
            }
            if (t==1) {
                System.out.println(1);
            } else {
                System.out.println(p+1);
            }
        }
    }
}