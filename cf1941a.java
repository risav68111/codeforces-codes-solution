import java.util.Scanner;

public class cf1914a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int[] ar1= new int[sc.nextInt()];
            int[] ar2= new int[sc.nextInt()];
            int k= sc.nextInt();
            
            for(int i=0; i<ar1.length; i++) {
                ar1[i]= sc.nextInt();
            }

            for(int i=0; i<ar2.length; i++) {
                ar2[i]= sc.nextInt();
            }

            int cou= 0;
            for(int i=0; i<ar1.length; i++) {
                for(int j=0; j<ar2.length; j++) {
                    if (ar1[i]+ar2[j]<=k) {
                        cou++;
                    } 
                }
            }
            System.out.println(cou);
        }
    }
}