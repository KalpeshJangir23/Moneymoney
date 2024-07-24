import java.util.Stack;

public class MaximumScore {
    public static int maximumGain(String s, int x, int y) {
        Stack<Character> stack = new Stack<>();
        int sum = 0;

        if (x > y) {
            sum += stackkiMC(s, stack, 'a', 'b', x);
            sum += remStackkiMC(stack, 'b', 'a', y);
        } else {
            sum += stackkiMC(s, stack, 'b', 'a', y);
            sum += remStackkiMC(stack, 'a', 'b', x);
        }

        return sum;
    }

    static int stackkiMC(String s, Stack<Character> stack, char start, char end, int point) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == start && current == end) {
                stack.pop();
                sum += point;
                System.out.println("Pair removed: " + start + end + ", Current sum: " + sum);
            } else {
                stack.push(current);
                System.out.println("Character pushed: " + current);
            }
        }
        return sum;
    }

    static int remStackkiMC(Stack<Character> stack, char start, char end, int point) {
        int sum = 0;
        Stack<Character> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            char current = stack.pop();
            if (!tempStack.isEmpty() && tempStack.peek() == end && current == start) {
                tempStack.pop();
                sum += point;
                System.out.println("Remaining pair removed: " + start + end + ", Current sum: " + sum);
            } else {
                tempStack.push(current);
                System.out.println("Remaining character pushed: " + current);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Final score: " + maximumGain("cdbcbbaaabab", 4, 5)); // Expected output: 19
    }
}
