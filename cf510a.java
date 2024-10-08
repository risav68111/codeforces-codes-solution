import java.util.Scanner;

public class cf510a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        for(int i=0; i<r; i++) {
            int tem= c;
            if(i%2==0) {
                while(tem-->0) {
                    System.out.print('#');
                }
            } else if((i+1)%4==0) {
                System.out.print('#');
                while(--tem>0) {
                    System.out.print('.');
                }
            } else {
                while(--tem>0) {
                    System.out.print('.');
                }
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
