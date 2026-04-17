import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){
        Vector<String> v = new Vector<>();

        v.add("xyz");
        v.add("ram");
        v.add("sita");

        System.out.println(v);            
         // Print whole vector
        
        System.out.println("Size: " + v.size());     
          // Number of elements
        
        System.out.println("Capacity: " + v.capacity()); 
        // Current capacity

        // Traversing using for-each loop
        for(String s : v) {
            System.out.println(s);
        }
    }
}

//1. Vector

//A class in java.util package.

//Represents a resizable array (dynamic array) that can grow or shrink automatically.

//Thread-safe (methods are synchronized).

//2. <String>

//This is a generic type parameter.

//Specifies that the Vector will only store String objects.

//Ensures type safety — prevents adding other data types.

//3. v

//This is the variable name.

//It is the reference to the Vector object.

//You can choose any valid name like vec, names, etc.

//4. =

//The assignment operator.

//Assigns the object created on the right to the variable on the left (v).

//5. new

//Keyword that creates a new object in memory.

//Used to call the constructor of the class.

//6. Vector<>()

//Calls the constructor of the Vector class.

//Creates a new empty Vector with default capacity 10.

//<String> can be omitted inside the constructor after Java 7 due to the diamond operator <>.

// What is vector ?
//It is a dynamic array that can grow or shrink in size as elements are added or removed. 
// //By default vector capacity of 10