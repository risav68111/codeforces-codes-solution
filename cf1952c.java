import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);z
        int t= sc.nextInt();
        int a=0;
        switch(t){
            case 0, 1 -> a=10;
            case 2 ,4, 12 -> a=8;
            case 3 ,10 -> a=9;
            case 5 ,6 ,7, 8 -> a=7;
            case 11 -> a=6;
            case 9 -> a=0;

        }
    System.out.println(a);
    }
}