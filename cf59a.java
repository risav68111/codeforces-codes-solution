import java.util.Scanner;

public class cf59a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int cou=0;
        for(int i=0; i<s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                cou++;
            }
        }
        if(cou*2> s.length()) {
            s=s.toUpperCase();
        } else {
            s=s.toLowerCase();
        }
        System.out.println(s);
    }
}
