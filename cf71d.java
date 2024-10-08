// practice with rainboy
import java.io.*;
import java.util.*;

public class CF71D extends PrintWriter {
	CF71D() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		CF71D o = new CF71D(); o.main(); o.flush();
	}

	char[] i2s = { 'C', 'D', 'H', 'S' };
	char[] i2r = { '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A' };
	int[] s2i = new int[128];
	int[] r2i = new int[128];
	{
		for (int i = 0; i < 4; i++)
			s2i[i2s[i]] = i;
		for (int i = 0; i < 13; i++)
			r2i[i2r[i]] = i;
	}
	int[][] rr;
	boolean[][] used = new boolean[4][13];
	boolean[] used_ = new boolean[13];
	boolean distinct(int i, int j) {
		for (int r = 0; r < 13; r++)
			used_[r] = false;
		for (int di = 0; di < 3; di++)
			for (int dj = 0; dj < 3; dj++) {
				int i_ = i + di;
				int j_ = j + dj;
				int r = rr[i_][j_];
				if (used_[r])
					return false;
				used_[r] = true;
			}
		return true;
	}
	int ip, jp, iq, jq;
	boolean check(int n, int m) {
		int il, jl, ir, jr, iu, ju, id, jd;
		il = ir = -1; jl = m; jr = -1;
		ju = jd = -1; iu = n; id = -1;
		for (int i = 0; i + 3 <= n; i++)
			for (int j = 0; j + 3 <= m; j++)
				if (distinct(i, j)) {
					if (jl > j) {
						il = i; jl = j;
					}
					if (jr < j) {
						ir = i; jr = j;
					}
					if (iu > i) {
						iu = i; ju = j;
					}
					if (id < i) {
						id = i; jd = j;
					}
				}
		if (jr - jl >= 3) {
			ip = il; jp = jl;
			iq = ir; jq = jr;
			return true;
		}
		if (id - iu >= 3) {
			ip = iu; jp = ju;
			iq = id; jq = jd;
			return true;
		}
		return false;
	}
	boolean check_(int n, int m, int s1, int r1, int s2, int r2) {
		if (!check(n, m))
			return false;
		println("Solution exists.");
		if (s1 == -1 && s2 == -1)
			println("There are no jokers.");
		else if (s2 == -1)
			println("Replace J1 with " + i2r[r1] + i2s[s1] + ".");
		else if (s1 == -1)
			println("Replace J2 with " + i2r[r2] + i2s[s2] + ".");
		else
			println("Replace J1 with " + i2r[r1] + i2s[s1]
					+ " and J2 with " + i2r[r2] + i2s[s2] + ".");
		println("Put the first square to (" + (ip + 1) + ", " + (jp + 1) + ").");
		println("Put the second square to (" + (iq + 1) + ", " + (jq + 1) + ").");
		return true;
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		rr = new int[n][m];
		int i1, j1, i2, j2, s1, r1, s2, r2;
		i1 = j1 = i2 = j2 = -1;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				String str = sc.next();
				char r = str.charAt(0);
				char s = str.charAt(1);
				if (s == '1') {
					i1 = i; j1 = j;
				} else if (s == '2') {
					i2 = i; j2 = j;
				} else
					used[s2i[s]][rr[i][j] = r2i[r]] = true;
			}
		if (j1 == -1 && j2 == -1) {
			if (check_(n, m, -1, -1, -1, -1))
				return;
		} else if (j1 != -1 && j2 == -1) {
			for (s1 = 0; s1 < 4; s1++)
				for (r1 = 0; r1 < 13; r1++) {
					if (!used[s1][r1]) {
						used[s1][r1] = true;
						rr[i1][j1] = r1;
						if (check_(n, m, s1, r1, -1, -1))
							return;
						used[s1][r1] = false;
					}
				}
		} else if (j1 == -1 && j2 != -1) {
			for (s2 = 0; s2 < 4; s2++)
				for (r2 = 0; r2 < 13; r2++) {
					if (!used[s2][r2]) {
						used[s2][r2] = true;
						rr[i2][j2] = r2;
						if (check_(n, m, -1, -1, s2, r2))
							return;
						used[s2][r2] = false;
					}
				}
		} else {
			for (s1 = 0; s1 < 4; s1++)
				for (r1 = 0; r1 < 13; r1++) {
					if (!used[s1][r1]) {
						used[s1][r1] = true;
						rr[i1][j1] = r1;
						for (s2 = 0; s2 < 4; s2++)
							for (r2 = 0; r2 < 13; r2++) {
								if (!used[s2][r2]) {
									used[s2][r2] = true;
									rr[i2][j2] = r2;
									if (check_(n, m, s1, r1, s2, r2))
										return;
									used[s2][r2] = false;
								}
							}
						used[s1][r1] = false;
					}
				}
		}
		println("No solution.");
	}
}
