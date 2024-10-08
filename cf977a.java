import java.util.Scanner;

public class cf977a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no= sc.nextInt();
        int cou= sc.nextInt();
        while(cou-->0) {
            if(no%10!=0) {
                no--;
            } else {
                no/=10;
            }
            // no=(no%10!=0 ? no-- : no/10);
        }
        System.out.println(no);
    }
}
