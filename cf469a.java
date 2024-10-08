import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
// import java.util.Arrays;

public class cf469a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max= sc.nextInt();
        Set<Integer> st= new HashSet<Integer>();
        int twi= 2;
        while(twi-->0) {
            int le= sc.nextInt();
            while(le-->0){
                st.add(sc.nextInt());
            }
        }
        // int t=2;
        // int mx= 0;
        // while(t-->0) {
        //     int lop= sc.nextInt();
        //     while(lop-->0) {
        //         int var=sc.nextInt();
        //         if(mx<var) {
        //             mx=var;
        //         }
        //     }
        // }
        // int arr[] = new int[sc.nextInt()];
        // for(int i=0; i<arr.length; i++) {
        //     arr[i]= sc.nextInt();
        // }
        // int arr1[] = new int[sc.nextInt()];
        // for(int i=0; i<arr1.length; i++) {
        //     arr1[i]= sc.nextInt();
        // }
        // int arr2[]= new int[arr.length+arr1.length];
        // System.arraycopy(arr, 0, arr2, 0, arr.length);
        // System.arraycopy(arr1, 0, arr2, arr.length, arr1.length);
        // Arrays.sort(arr2);
        // int meta[] = new int[max];
        // meta[0]= arr[0];
        // int j=1;
        // for(int i=0; i<max-1; i++ ) {
        //     if(meta[i]+1==arr2[j]) {
        //         meta[i+1]=arr2[j];
        //         j++;
        //     } else if(meta[i]==arr2[j]) {
        //         j++;
        //     } else if(meta[i]+2== arr2[j]) {
        //         System.out.println("Oh, my keyboard!");
        //         return;
        //     }
        //     System.out.println(meta[i]);
        // }
        
        // if(meta.length== max) {
        //     System.out.println("I become the guy.");
        // } else  {
        //     System.out.println("Oh, my keyboard!");
        // }
        System.out.println(st.size()==max ? "I become the guy." : "Oh, my keyboard!");
    }
}
