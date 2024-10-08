import java.util.Scanner;

public class cf110a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String l=sc.next().replace('4', '7');
        int count=0;
        for(int i=0; i<l.length(); i++) {
            char var=l.charAt(i);
            if(var=='7') {
                count++;
            }
        }
        String ans="NO";
        if(count==7 | count ==4) {
            ans="YES";
        }
        System.out.println(ans);
    }
}
