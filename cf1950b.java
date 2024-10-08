import java.util.Scanner;

public  class cf1950b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int l= sc.nextInt();
            for(int i= 0; i<l; i++) {
                for(int k=0; k<2; k++){
                    for(int j=0; j<l ; j++) {
                        char c= (j+i)%2==0? '#': '.';
                        System.out.print(c+""+c);
                    }
                System.out.println();
                }
            }
        }
    }
}