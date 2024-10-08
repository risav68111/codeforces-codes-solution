import java.util.Scanner;

public class cf731a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int n= 0;
        int st=97;
        for(int i=0; i<s.length(); i++) {
            int cur= (int)s.charAt(i);
            int tem=Math.abs(cur-st);
            n+=Math.abs(tem >13? 26-tem: tem);
            st=cur;
        }
        System.out.println(n);
    }
}
