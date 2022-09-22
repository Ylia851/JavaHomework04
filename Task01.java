import java.util.Stack;

public final class Task01 {

    public static class Stack<T> {
        private T[] array;
        private int index;
        private int lenght;

        public Stack(int length) {
            this.index = 0;
            this.array = (T[]) new Object[length];
        }

        public int size() {
            return this.index;
        }

        public boolean empty() {
            return this.size() == 0;
        }

        public void push(T value) {
            if (this.size() > this.length) {
                System.out.println("Стек переполнен");
            } else {
                this.array[index++] = value;
            }
        }

        public T peek() {
            if (this.size() > 0)
                return this.array[index - 1];
            else {
                System.out.print("Стек пуст ");
                return 0;
            }
        }

        public T pop() {
            if (this.size() > 0)
                return this.array[--index];
            else {
                System.out.print("Стек пуст ");
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack(100);
        Stack.push('string1');
        Stack.push('string2');
        Stack.push('string3');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
