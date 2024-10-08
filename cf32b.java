import java.util.Scanner;

public class cf32b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char[] s= sc.next().toCharArray();
        String as= "";
        for(int i=0; i<s.length;i++) {
            if(s[i]=='.') {
                as+="0";
            } else {
                ++i;
                if(s[i]=='.') {
                    as+="1";
                } else {
                    as+="2";
                }
            }
        }
        System.out.println(as);
    }
}