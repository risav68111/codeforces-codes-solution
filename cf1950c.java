import java.util.Scanner;

public class cf1950c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            String s= sc.next();
            String c= "";
            int h= Integer.parseInt(s.substring(0,2));
            int k= h-12;
            String tem= (Integer.toString(Math.abs(h-12))+s.substring(2,s.length()));
            System.out.println(h>=12? (h-12)<10 && (h-12)>0? "0"+tem+ " PM": h==12? s+ " PM": tem+" PM":h==00? tem+" AM": s+" AM");
        }
    }
}