import java.util.Scanner;

public class cf158a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w= sc.nextInt();
        int min= sc.nextInt();
        int count=0;
        int[] arr= new int[w];
        for(int i=0; i<w;i++) {
            arr[i]= sc.nextInt();
            if(arr[i]>=arr[min-1]) {
                if(arr[i]>0){
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
}