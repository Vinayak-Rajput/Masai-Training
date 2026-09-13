package Stack.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixCalculator {

    public static int postfixEvaluation(String str) {

        Deque<Integer> stack = new ArrayDeque<>();

        String[] tokens  = str.split(" "); // "\\s+"

        for (String token : tokens) {

            if(! "+-*/".contains(token)) {
                stack.push(Integer.parseInt(token));
            }

            else {

                int operand1 = stack.pop();
                int operand2 = stack.pop();

                int result = switch (token) {
                    case "+" -> operand1 + operand2;
                    case "-" -> operand1 - operand2;
                    case "*" -> operand1 * operand2;
                    case "/" -> operand1 / operand2;
                    default -> throw new IllegalArgumentException("Invalid Operator for Expression.");
                };

                stack.push(result);

            }

        }

        if (!stack.isEmpty())
            throw new RuntimeException("Invalid Postfix Expression");

        return stack.pop();
    }
}
