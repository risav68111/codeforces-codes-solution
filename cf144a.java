import java.util.Scanner;

public class cf144a {
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int si=0, li=0;
        int arr[] = new int[n];
        for(int cou=0; cou<n; cou++) {
            arr[cou]= sc.nextInt();
            if(arr[li]<arr[cou]) {
                li=cou;
            }
            if(arr[si]>=arr[cou]) {
                si=cou;
            }
        }
        System.out.println(li+(n-si-1)-(si<li?1:0));
    }
}
