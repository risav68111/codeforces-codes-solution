import java.util.*;

public class cf1703a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0) {
            String[] s= sc.next().toLowerCase().split("");
            String[] arr= {"y", "e", "s"};
            if(Arrays.equals(s, arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}