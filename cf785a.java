import java.util.Scanner;

public class cf785a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        int face= 0;
        while(i-->0) {
            String s= sc.next();
            if (s.charAt(0)=='C') {
                face+=6;
            } else if(s.charAt(0)=='T') {
                face+=4;
            } else if(s.charAt(0)=='O') {
                face+=8;
            } else if(s.charAt(0)=='D') {
                face+=12;
            } else if(s.charAt(0)=='I') {
                face+=20;
            } else {
                face+=0;
            }
        }
        System.out.println(face);
    }
}
