import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumFinalElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            PriorityQueue<Long> minHeap = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                long num = sc.nextLong();
                minHeap.add(num);
            }
            
            while (minHeap.size() > 1) {
                long first = minHeap.poll();
                long second = minHeap.poll();
                long combined = (first + second) / 2;
                minHeap.add(combined);
            }
            
            long x = minHeap.poll();
            System.out.println(x);
        }
        sc.close();
    }
}
