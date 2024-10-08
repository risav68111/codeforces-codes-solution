import java.util.Scanner;

public class cf1993a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0 ) {
            int l = sc.nextInt();
            char[] arr= sc.next().toCharArray();
            int a=0, b=0, c=0, d=0;
            for(char ch: arr) {
                // System.out.println(a+" "+ b+ " "+c+ " " + d);
                switch (ch) {
                    case 'A':
                        a++;
                        break;
                    case 'B':
                        b++;
                        break;
                    case 'C':
                        c++;
                        break;
                    case 'D':
                        d++;
                        break;
                    default:
                        break;
                }
            }
            a= (a>l? l:a);
            b= (b>l? l:b);
            c= (c>l? l:c);
            d= (d>l? l:d);
            System.out.println(a+b+c+d);
        }
    }
}