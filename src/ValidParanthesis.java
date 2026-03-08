import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string of brackets: ");
        String input = sc.nextLine();

        Solution sol = new Solution();
        boolean result = sol.isValid(input);

        if (result) {
            System.out.println("The brackets are valid.");
        } else {
            System.out.println("The brackets are not valid.");
        }
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (!stack.isEmpty() && ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (!stack.isEmpty() && ch == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}