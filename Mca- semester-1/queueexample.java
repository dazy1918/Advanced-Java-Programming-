import java.util.*;

public class queueexample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(12);
        q.offer(89);
        q.add(67);
        q.offer(67);

        System.out.println(q);
        System.out.println(q.peek());

        q.poll();
        System.out.println(q);

        System.out.println("contains30?" + q.contains(30));

        System.out.println("Size:" + q.size());

    }
}