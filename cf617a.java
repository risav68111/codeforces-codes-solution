import java.util.Scanner;

public class cf617a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int cou=0;
        if(x>5) {
            cou= x/5;
            x=x%5;
        } 
        if(x!=0) {
            cou++;
        }
        System.out.println(cou);
    }
}