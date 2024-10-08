import java.util.Scanner;

public class cf1367a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w= sc.nextInt();
        while(w-->0) {
            String s= new String(sc.next());
            String ans= "";
            for(int i=0; i<s.length(); i+=2) {
                if(s.charAt(i)==s.charAt(i+1)) {
                    ans+=s.charAt(i);
                } else {
                    ans+=s.substring(i, i+1);
                }
            }
            System.out.println(ans+s.charAt(s.length()-1));
        }
    }
}
