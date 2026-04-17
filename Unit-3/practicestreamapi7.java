import java.util.*;
import java.util.stream.Stream;

public class practicestreamapi7 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(23, 67, 89, 54, 34, 21,-9,-7);

        //
        int product = l1.stream().reduce(1, (e1, e2) -> e1 * e2);
        System.out.println(product);

        // Find Maximum number using reduce()
        int MaxNum = l1.stream().reduce(0, (f1, f2) -> f1 > f2 ? f1 : f2);
        System.out.println(MaxNum);

        // Count total element using reduce()(without using count())
        int CountNum = l1.stream().reduce(0, (i1, i2) -> i1 + 1);
        System.out.println(CountNum);

        // Write a java program to calculate the sum of all even numbers using reduce()
         List<Integer> SumEvenNumber = l1.filter(u1 -> u1 % 2 == 0)
                                         .reduce(0,(u1,u2)->u1+u2)
         System.out.println(SumEvenNumber);

         // Write a java program using reduce() to concatenate all strings whose length is greater than 3
         List<String> StringLength = l1.stream()
                                       .map(StringLength::valueOf)
                                       .filter(t1-> t1.length > 3)
                                       .reduce("",(t1,t2)->t1.concat(t2));
          System.out.println(StringLength);
         
         // Write a java program to multiply only odd numbers in a list using reduce()
         List<Integer> OddNum = l1.stream()
                                  .filter(w1->w1 % 2 !=0)
                                  .reduce(1,(w1,w2)->w1*w2);
         System.out.println(OddNum);

         // Write a java program to replace all negative numbers with 0 and find thhe sum using reduce()
         Lsit<Integer> SumReplaceNegativeNum = l1.stream()
                                                 .map((p1)->p1:0?0:p1)
                                                 .reduce(0,(p1,p2)->p1+p2);
         System.out.println(SumReplaceNegativeNum);           
         
    }
}
