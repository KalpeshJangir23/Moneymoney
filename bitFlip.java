import java.util.LinkedList;
import java.util.Queue;

public class bitFlip {
    
    static class State {
        int value;
        int steps;
        
        State(int value, int steps) {
            this.value = value;
            this.steps = steps;
        }
    }
    
    public static int minOperations(int N) {
        if (N == 0) return 0;
        
        Queue<State> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        queue.offer(new State(N, 0));
        visited[N] = true;
        
        while (!queue.isEmpty()) {
            State current = queue.poll();
            
            // Operation 1: Toggle the rightmost bit
            int nextValue = current.value ^ 1;
            if (nextValue == 0) return current.steps + 1;
            if (nextValue <= N && !visited[nextValue]) {
                queue.offer(new State(nextValue, current.steps + 1));
                visited[nextValue] = true;
            }
            
            // Operation 2: Change the ith bit where lower bits are zero
            for (int i = 1; (1 << i) <= current.value; i++) {
                int mask = (1 << i) - 1;
                if ((current.value & mask) == 0) {
                    nextValue = current.value | (1 << i);
                    if (nextValue == 0) return current.steps + 1;
                    if (nextValue <= N && !visited[nextValue]) {
                        queue.offer(new State(nextValue, current.steps + 1));
                        visited[nextValue] = true;
                    }
                }
            }
        }
        
        return -1; // This should never happen if N is non-negative
    }

    public static void main(String[] args) {
        int N = 4; // Example input
        System.out.println("Minimum operations to reduce " + N + " to 0: " + minOperations(N));
    }
}
