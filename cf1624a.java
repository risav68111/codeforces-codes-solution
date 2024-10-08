import java.util.Scanner;

public class cf1624a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int v= sc.nextInt();
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            while(v-->0) {
                int var= sc.nextInt();
                // min=Math.min(min,var);
                // max= Math.max(max,var);
                if(max<var) {
                    max=var;
                } else if(min>var) {
                    min=var;
                }
            }
            System.out.println(max-min);
        }
    }
}