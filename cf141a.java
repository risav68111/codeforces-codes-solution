import java.util.Arrays;
import java.util.Scanner;

public class cf141a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n1= sc.next();
        String n2= sc.next();
        String jum= sc.next();
        char[] c= new char[jum.length()];
        char[] c1= jum.toCharArray();
        if(n1.length()+n2.length()==jum.length()) {
            c= (n1+n2).toCharArray();
            Arrays.sort(c);
            Arrays.sort(c1);
            for(int i=0; i<jum.length();i++) {
                if(c[i]!=c1[i]) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    
        // char[] arr = (sc.next()+sc.next()).toCharArray();
        // char[] arr2 = sc.next().toCharArray();
        // Arrays.sort(arr);
        // Arrays.sort(arr2);
        // System.out.println((Arrays.equals(arr,arr2))?"YES":"NO");
    }
}
