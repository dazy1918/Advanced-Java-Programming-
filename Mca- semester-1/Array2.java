import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        
      
        ArrayList<String> fruits; 
        ArrayList<Integer> numbers = new ArrayList<>();  
        var dynamicList = new ArrayList<Double>();  
        ArrayList<String> list1 = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>(10);  
        
      
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Orange", "Mango", "Apple"));
        
     
        ArrayList<String> list4 = new ArrayList<>() {{
            add("Red");
            add("Green");
            add("Blue");
        }};        
    
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Red"));
        System.out.println("Original list: " + colors);
  
        

        colors.add("Purple");
        System.out.println("After adding Purple: " + colors);
        
     
        colors.add(1, "Orange");  
        System.out.println("After adding Orange at index 1: " + colors);
        
       
        colors.addAll(Arrays.asList("Black", "White"));
        System.out.println("After adding Black and White: " + colors);
        
 

        boolean hasGreen = colors.contains("Green");
        System.out.println("Contains Green? " + hasGreen);
        
      
        int index = colors.indexOf("Red");
        System.out.println("First index of Red: " + index);
        
      
        int lastIndex = colors.lastIndexOf("Red");
        System.out.println("Last index of Red: " + lastIndex);
        
       
        
      
        String removed = colors.remove(2);  
        System.out.println("Removed element at index 2: " + removed);
        System.out.println("After removal by index: " + colors);
        
        
        boolean isRemoved = colors.remove("Red");
        System.out.println("Removed 'Red'? " + isRemoved);
        System.out.println("After removal by value: " + colors);
        
      
        colors.removeIf(color -> color.equals("Red"));
        System.out.println("After removing all 'Red': " + colors);
        
        // Clear all elements
        colors.clear();
        System.out.println("After clear: " + colors);
        System.out.println("Is list empty? " + colors.isEmpty());
        
        // ====== 6. COMMON OPERATIONS ======
        
        // Re-initialize for more examples
        colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"));
        
        // Get element at index
        String color = colors.get(2);
        System.out.println("\nElement at index 2: " + color);
        
        // Update element at index
        colors.set(1, "Dark Green");
        System.out.println("After updating index 1: " + colors);
        
        // Get size of list
        System.out.println("Size of list: " + colors.size());
        
        // Iterate through list
        System.out.print("All elements: ");
        for (String c : colors) {
            System.out.print(c + " ");
        }
        
        // ====== 7. DIFFERENT DATA TYPES ======
        
        // Integer ArrayList
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(25);
        ages.add(30);
        ages.add(35);
        System.out.println("\n\nAges: " + ages);
        
        // Double ArrayList
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(19.99);
        prices.add(29.50);
        System.out.println("Prices: " + prices);
    }
}
