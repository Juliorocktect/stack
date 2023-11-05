
public class Trhekegmu {
    private Queue<Integer> queue;

    public void ausgabe_zahlenfolge() {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.front());
            queue.dequeue();
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.top());
            stack.pop();
        }
    }

    public static void main(String[] args) {
        queue = new Queue<>();
        queue.enqueue(12);
        queue.enqueue(1);
        queue.enqueue(7);
        queue.enqueue(68);
        queue.enqueue(33);
        queue.enqueue(88);
        queue.enqueue(99);
        queue.enqueue(1232);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        ausgabe_zahlenfolge();
    }
}
