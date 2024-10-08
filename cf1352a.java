import java.util.Scanner;

public class cf1352a {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int l= sc.nextInt();
        while(l-->0) {
            int c= sc.nextInt();
            int count=0;
            String s= "";
            int pow=0;
            while(c>0) {
                if(c%10!=0) {
                    s+=String.valueOf((int)(c%10*Math.pow(10,pow)))+" ";
                    count++;
                }
                c/=10;
                pow++;
            }
            System.out.println(count);
            System.out.println(s);
        }
    }
}
