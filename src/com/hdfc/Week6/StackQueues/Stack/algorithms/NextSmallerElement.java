package Stack.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextSmallerElement {

    public static int[] nextSmEle(int[] arr) {

        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--) {

            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){

                result[i] = -1;

            } else {

                result[i] = stack.peek();

            }

            stack.push(arr[i]);
        }
        return result;
    }
}
