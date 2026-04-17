import java.util.*;

public class Collection5 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(23);
        l.add(12);
        l.add(100);
        l.add(67);
        System.out.println(l);

        Iterator<Integer> list1=l.iterator();
        while(list1.hasNext()){
           // System.out.println(list1.next());
            Integer i=list1.next();
        if(i==12){
            list1.remove();
        }
    }
    System.out.println(l);
    List<String> l2=new ArrayList<>();
    l2.add("lion");
    l2.add("tiger");
    l2.add("cat");
    l2.add("bear");
    System.out.println(l2);
   
    ListIterator<String> list2=l2.listIterator(l2.size());   //Add, Remove, Update //not move forward and backward  //Having Previous method
    while(list2.hasPrevious()) {
        //System.out.println(list2.previous());
        String s=list2.previous();
        if(s.equals("lion")){
            //list2.add("dog");
            //list2.set("change");
            list2.remove();
         }
      }
        System.out.println(l2);
        System.out.println("min="+Collections.min(l));
        System.out.println("max="+Collections.max(l));
        Collections.sort(l);
        System.out.println(l);
        System.out.println(Collections.frequency(l, 67));
    }   
 }
   