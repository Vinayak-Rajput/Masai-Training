package Stack.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

import static Stack.LinkedListStack.addPairToMap;
import static Stack.LinkedListStack.getPairedCharacter;

public class ValidParenthesis {

    public static boolean validParenthesisCheck(String str) {

        Deque<Character> stack = new ArrayDeque<>();
        addPairToMap('<','>');

        for(int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);

            } else if (ch == getPairedCharacter(ch)) {

                if(stack.isEmpty() || stack.peek() != getPairedCharacter(ch)) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
