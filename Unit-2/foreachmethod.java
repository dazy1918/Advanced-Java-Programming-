import java.util.*;
public class foreachmethod{
 
    public static void main(String[] args){
        List<Integer> l= new ArrayList<>();
         l.add(34);
         l.add(44);
         l.add(71);
         l.add(67);
         l.add(11);

         l.forEach(i->{
            if(i%2==0){
            System.out.print(i + " "); 
            }
        });
     //Method refrence to a particular object 
         l.forEach(System.out::println);

         
    }
}



