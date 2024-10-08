import java.util.Scanner;

public class cf344a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt()-1;
        int var= sc.nextInt();
        int count=1;
        while(l-->0) {
            int s= sc.nextInt();
            if(var!=s) {
                var=s;
                count++;
            }
        }
        System.out.println(count);
    }
}
