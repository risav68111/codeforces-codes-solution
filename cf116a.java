import java.util.Scanner;

public class cf116a {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		int sum=0;
		int var=0;
		while(no-->0) {
			if(var<sum) {
				var=sum;
			}
			sum-=sc.nextInt();
			sum+=sc.nextInt();
		}
		System.out.println(var);
	}
}