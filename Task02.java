import java.util.Queue;
import java.util.LinkedList;

public final class Task02 {
    public static void main(String[] args) {
        Object[] arr = { 1, 100, 113, 2, "tree" };
        private int index;
        private int lenght;
        addToQueue(arr);
    }

    public static void addToQueue(Object[] obj) {
        LinkedList<Object> que = new LinkedList<>();
        for (Object object : obj) {
            que.offer(object);
        }
        System.out.println(que);

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
                this.que[index++] = value;
            }
        }

        public T peek() {
            if (this.size() > 0)
                return this.que[index - 1];
            else {
                System.out.print("Стек пуст ");
                return 0;
            }
        }

        public T poll() {
            if (this.size() > 0)
                return this.que[--index];
            else {
                System.out.print("Стек пуст ");
                return 0;
            }
        }
    }

}
