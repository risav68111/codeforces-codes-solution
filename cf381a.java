import java.util.Scanner;

public class cf381a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] ar= new int[n];
        for(int i=0; i<n; i++) {
            ar[i]= sc.nextInt();
        }
        int i=0;
        int cou=0, co= 0;
        n-=1;
        int b= 0; 
        int count=2;
        while(i<=n) {
            if(ar[i]>ar[n]) {
                b=ar[i];
                i++;
            } else {
                b= ar[n];
                n--;
            }
            if (count%2==0) {
                cou+=b;
            } else {
                co+= b;
            }
            count++;
        }
        System.out.println(cou+" "+ co);
    }
}