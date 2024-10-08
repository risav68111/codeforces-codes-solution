import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int k= sc.nextInt();
            int q= sc.nextInt();
            int[] ark= new int[k];
            int[] arq= new int[q];
            for(int i=0; i<k; i++) {
                ark[i]= sc.nextInt();
            }
            for(int i=0; i<q; i++) {
                arq[i]= sc.nextInt();
            }
        }
    }
}