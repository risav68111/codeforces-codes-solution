import java.util.Scanner;

public class cf9a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mx= Math.max(sc.nextInt(), sc.nextInt());
        String s= "";
        switch (mx) {
            case 1-> s= "1/1";
            case 2-> s= "5/6";
            case 3-> s= "2/3";
            case 4-> s= "1/2";
            case 5-> s= "1/3";
            case 6-> s= "1/6";
        }
        System.out.println(s);
    }
}
