import java.util.Scanner;

public class cf734a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String s= sc.next();
        int a=0, d=0;
        for(int i=0; i<s.length(); i++) {
           int c=(s.charAt(i)=='A' ? a++: d++);
        }
        if(a>d) {
            System.out.println("Anton");
        } else if(d>a) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
