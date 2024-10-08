import java.util.Scanner;

public class cf1829b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0) {
            int l= sc.nextInt();
            int cou= 0, count =0;
            while(l--> 0){
                int var= sc.nextInt();
                if(var ==0) {
                    cou++;
                } else {
                    cou=0;
                }
                count= (cou > count ? cou : count);
            }
            System.out.println(count);
        }
    }
}