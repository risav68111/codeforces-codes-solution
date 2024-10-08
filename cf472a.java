import java.util.Scanner;

public class cf472a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int or= r%2;
        System.out.println(or==1? 9 +" "+ (r-9): 8+" "+ (r-8));
    }
}