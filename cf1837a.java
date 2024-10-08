import java.util.Scanner;

public class cf1837a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        while(l-->0) {
            int x= sc.nextInt();
            int d= sc.nextInt();
            int var= x;
            int vas= 0;
            int count=1;
            while(var+vas==x && x>d) {
                if(var%d!=1 && vas%d!=1) {
                    var--;
                    vas++;
                }
            }
            if(x>d) {
                count=1;
            }
            System.out.println(count);
            System.out.print(var);
            if(vas!=0) {
                System.out.println(" "+ vas);
            }
        }
    }
}
