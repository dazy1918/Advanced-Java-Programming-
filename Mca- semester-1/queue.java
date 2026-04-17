import java.util.*;
public class queue{
    public static void main(String[] args) {
     Queue<Integer> q= new PriorityQueue<>();
       // Queue<Integer> q= new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(12);
        q.offer(89);
        q.offer(67);
        q.offer(67);
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
for(Integer i:q){
    System.out.println(i);
}
    }
}