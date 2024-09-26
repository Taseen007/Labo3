import java.util.Stack;

    public class MaxStack {
        private Stack<Integer> stack;
        private Stack<Integer> maxStack;


        public MaxStack() {
            stack = new Stack<>();
            maxStack = new Stack<>();
        }


        public void push(int x) {
            stack.push(x);


            if (maxStack.isEmpty() || x >= maxStack.peek()) {
                maxStack.push(x);
            }
        }

        public int pop() {
            int poppedValue = stack.pop();


            if (poppedValue == maxStack.peek()) {
                maxStack.pop();
            }
            return poppedValue;
        }


        public int max() {

            return maxStack.peek();
        }

        public static void main(String[] args) {
            MaxStack maxStack = new MaxStack();
            maxStack.push(3);
            maxStack.push(2);
            maxStack.push(5);
            maxStack.push(6);
            System.out.println(maxStack.max());


            maxStack.pop();
            System.out.println(maxStack.max());


            maxStack.push(1);
            maxStack.push(2);
            maxStack.push(3);
            maxStack.push(2);
            System.out.println(maxStack.max());
        }
    }


