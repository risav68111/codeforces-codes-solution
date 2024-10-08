import java.util.Scanner;


public class cf1809G {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        int winner= 0;
        System.out.println(algo(arr, k, winner));
    }

    public static int algo(int[] arr, int k, int winner) {
        for(int i=1; i<arr.length; i++) {
            int var= arr[winner]-arr[i];
            if(var<0) {
                var=var*(-1);
            }

            if(var>k) {
                if(arr[winner]>arr[i]) {
                } else {
                    winner= i;
                }       
            }else  {
                int x= cf1809G.algo(arr, k, winner);
                winner=i;
                int y= cf1809G.algo(arr, k, winner);
                if(arr[x]>arr[y]) {
                    winner= x;
                } else {
                    winner= y;
                }
            }
        }
        return winner;
    }
}
