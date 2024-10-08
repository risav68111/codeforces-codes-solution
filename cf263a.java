import java.util.Scanner;

class cf263a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr= new int[5][5];
        int a=0, b=0;
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                arr[i][j]= sc.nextInt();
                if(arr[i][j]== 1) {
                    a=i+1;
                    b=j+1;
                    a=Math.abs(3-a);
                    b=Math.abs(3-b);
                    System.out.println((a+b));
                    return;
                }
            }
        }
    }
}
