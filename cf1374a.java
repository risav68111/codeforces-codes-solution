import java.util.Scanner; 

public class cf1374a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(); 
        while(n-->0 ) {
            int r =sc.nextInt();
            int c= sc.nextInt();
            int dec= sc.nextInt();
            // while(dec%r!= c) {
            //     dec--;
            // }
            // System.out.println(dec);
            System.out.println(((dec-c)/r)*r+c);
        }
    }
}
