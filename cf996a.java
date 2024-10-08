import java.util.Scanner;

public class cf996a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bal= sc.nextInt();
        int li= 0,i=0;
        while(bal>0) {
            if(bal>=100) {
                i=bal/100;
                bal%=100;
                li+=i;
            }   else if(bal>=20) {
                i=bal/20;
                bal%=20;
                li+=i;
            } else if(bal>=10) {
                i=bal/10;
                bal%=10;
                li+=i;
            } else if(bal>=5) {
                i=bal/5;
                bal%=5;
                li+=i;
            } else {
                bal-=1;
                li++;
            } 
        }
        System.out.println(li);
    }
}
