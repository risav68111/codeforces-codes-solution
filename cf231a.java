import java.util.Scanner;

public class cf231a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        int count=0;
        while(i-->0) {
            int sum=0;
            int[] arr= new int[3];
            for(int x=0 ; x<3 ; x++) {
                arr[x]=sc.nextInt();
                sum+=arr[x];
            }
            if(sum>1) {
                count++;
            }
        }
        System.out.println(count);
    }    
}
