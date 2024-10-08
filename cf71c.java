import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		int N = Integer.parseInt(in.readLine());
		boolean[] knights = new boolean[N];
		int M = 0;
		int firstOne = -1;

		StringTokenizer st = new StringTokenizer(in.readLine());
		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(st.nextToken());
			if (val == 0) {
				knights[i] = false;
				M++;
			}
			else knights[i] = true;
		}

		in.close();

		ArrayList<Integer> factors = new ArrayList<>();
		for (int i = 3; i <= N; i++) {
			if (N % i == 0) factors.add(i);
		}

		int K = factors.size();
		int[][] table = new int[K][M];
		int index = 0;

		for (int i = 0; i < N; i++) {
			if (knights[i]) continue;
			for (int j = 0; j < K; j++) {
				table[j][index] = i % (N / factors.get(j));
			}
			index++;
		}

		for (int i = 0; i < K; i++) {
			// System.out.println("For factor: " + factors.get(i) + ": " + Arrays.toString(table[i]));
			boolean[] check = new boolean[N / factors.get(i)];
			for (int j = 0; j < M; j++) {
				check[table[i][j]] = true;
			}
			int count = 0;
			for (int j = 0; j < check.length; j++) {
				if (!check[j]) {
					count++;
				}
			}
			// System.out.println(Arrays.toString(check));
			// System.out.println("COUNT = " + count);
			if (count > 0) {
				out.println("YES");
				out.close();
				return;
			}
		}

		out.println("NO");
		out.close();
	}
}
