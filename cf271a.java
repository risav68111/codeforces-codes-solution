import java.util.Scanner;

public class cf271a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int y= sc.nextInt();
        while(y>999) {
            int count=0;
            ++y;
            String s= Integer.toString(y);
            for(int i=0; i<s.length()-1; i++) {
                for(int j=1; j<s.length(); j++) {
                    if(s.charAt(i)!=s.charAt(j)) {
                        count++;
                    }
                }
            }
            if(count==7) {
                System.out.println(y);
                return;
            }
        }
    }
}
