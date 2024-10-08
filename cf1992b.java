import java.util.Scanner;

public class cf1992b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[k];
            int max=0;
            int ans=0;
            for(int i=0; i<k; i++) {
                int a=sc.nextInt();
                if(a>= arr[max]) {
                    max=i;
                }
                arr[i]=a;
            }
            while(k-->0) {
                if(k ==max) {
                    continue;
                } else {
                    ans+= arr[k]*2-1;
                }
            }
            System.out.println(ans);
        }
    }
}