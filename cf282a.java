import java.util.Scanner;

class cf282a {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int l = sc.nextInt();
		int x=0;
		while(l-->0) {
			String s= sc.next();
			if(s.charAt(1)== '-') {
				x--;
			} else {
				x++;
			}
		}
		System.out.println(x);
	}
}

