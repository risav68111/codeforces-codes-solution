import java.util.Scanner;

public class cf61a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        int n= s1.length();
        String ans="";
        while(n-->0) {
            if(s1.charAt(n)!=s2.charAt(n)) {
                ans= "1"+ans;
            } else {
                ans= "0" + ans;
            }
        }
        System.out.println(ans);
    }
}
