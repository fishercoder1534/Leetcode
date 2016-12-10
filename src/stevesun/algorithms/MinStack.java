package stevesun.algorithms;

import java.util.*;

public class MinStack {
    
    private Stack<Integer> stack;
    private int min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        /**All the trick happens here, we push the second minimum number onto the stack before we push the newer one,
         * this way, when popping, we could always get the next minimum one in constant time.*/
        if(x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(min == stack.peek()){
            stack.pop();
            min = stack.pop();
        } else {
            stack.pop();
        }
        if(stack.isEmpty()) min = Integer.MAX_VALUE;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }

}
